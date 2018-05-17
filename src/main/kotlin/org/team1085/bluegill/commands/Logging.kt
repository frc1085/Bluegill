package org.team1085.bluegill.commands

import edu.wpi.first.wpilibj.command.Command
import org.team1085.bluegill.Robot
import org.team1085.bluegill.Map

class Logging : Command () {

  init { requires(Robot.dashboard) }

  private val leftCounter = Robot.dashboard.sensorTable.getEntry("left_ticker")
  private val rightCounter = Robot.dashboard.sensorTable.getEntry("right_ticker")

  override fun isFinished () = false
  override fun initialize () {}

  override fun execute () {
    leftCounter.setDouble(Robot.chassis.getLeft().toDouble())
    rightCounter.setDouble(Robot.chassis.getRight().toDouble())
  }

  override fun interrupted () {}
  override fun end () {}

}
