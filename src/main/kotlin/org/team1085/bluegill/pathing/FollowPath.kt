package org.team1085.bluegill.pathing

import edu.wpi.first.wpilibj.command.Command
import jaci.pathfinder.Pathfinder
import jaci.pathfinder.Trajectory
import jaci.pathfinder.Waypoint
import jaci.pathfinder.modifiers.TankModifier
import jaci.pathfinder.followers.EncoderFollower
import org.team1085.bluegill.Robot
import org.team1085.bluegill.Map

class FollowPath (waypoints: Array<Waypoint>) : Command () {

  init { requires(Robot.chassis) }

  private val config = Trajectory.Config(Trajectory.FitMethod.HERMITE_CUBIC, Trajectory.Config.SAMPLES_HIGH, 0.05, 1.7, 2.0, 60.0)
  private val center = Pathfinder.generate(waypoints, config)
  private val modify = TankModifier(center).modify(Map.DRIVE_WIDTH)

  private val leftFollower = EncoderFollower(modify.getLeftTrajectory())
  private val rightFollower = EncoderFollower(modify.getRightTrajectory())

  override fun isFinished () = leftFollower.isFinished() && rightFollower.isFinished()

  override fun initialize () {
    Robot.chassis.resetEncoders()
    leftFollower.configureEncoder(Robot.chassis.getLeft(), Map.TICKS_PER_REV, Map.TICK_DIST)
    rightFollower.configureEncoder(Robot.chassis.getRight(), Map.TICKS_PER_REV, Map.TICK_DIST)
  }

  override fun execute () {
    val leftSpeed = leftFollower.calculate(Robot.chassis.getLeft())
    val rightSpeed = rightFollower.calculate(Robot.chassis.getRight())

    Robot.chassis.setLeftRaw(leftSpeed)
    Robot.chassis.setRightRaw(rightSpeed)
  }

  override fun interrupted () = Robot.chassis.fullStop()
  override fun end () = Robot.chassis.fullStop()

}
