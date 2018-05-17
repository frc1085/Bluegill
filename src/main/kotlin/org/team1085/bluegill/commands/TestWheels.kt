package org.team1085.bluegill.commands

import edu.wpi.first.wpilibj.command.Command
import org.team1085.bluegill.Robot
import org.team1085.bluegill.Map

class TestWheels : Command () {

  init { requires(Robot.chassis) }

  override fun isFinished () = false
  override fun execute () = Robot.chassis.setSpeed(0.5)
  override fun interrupted () = Robot.chassis.fullStop()
  override fun end () = Robot.chassis.fullStop()

}