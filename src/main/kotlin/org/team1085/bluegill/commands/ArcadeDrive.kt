package org.team1085.bluegill.commands

import edu.wpi.first.wpilibj.command.Command
import org.team1085.bluegill.Robot
import org.team1085.bluegill.Map

class ArcadeDrive : Command () {

  init { requires(Robot.chassis) }

  override fun isFinished () = false
  override fun execute () {
    val x = Robot.dashboard.firstDriver.getX()
    val y = Robot.dashboard.firstDriver.getY()

    Robot.chassis.setLeftRaw(Math.pow(y - x, Map.INPUT_SCALE))
    Robot.chassis.setRightRaw(Math.pow(y + x, Map.INPUT_SCALE))
  }
}