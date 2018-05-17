package org.team1085.bluegill.commands

import edu.wpi.first.wpilibj.command.Command
import org.team1085.bluegill.Robot
import org.team1085.bluegill.Map

class EncoderTest : Command () {

  init { requires(Robot.chassis) }

  override fun isFinished () = Robot.chassis.getLeft() >= 5000 && Robot.chassis.getRight() <= -5000
  override fun initialize () = Robot.chassis.resetEncoders()

  override fun execute () {
    Robot.chassis.setLeftRaw(0.2)
    Robot.chassis.setRightRaw(0.2)
  }

  override fun interrupted () = Robot.chassis.fullStop()
  override fun end () = Robot.chassis.fullStop()

}
