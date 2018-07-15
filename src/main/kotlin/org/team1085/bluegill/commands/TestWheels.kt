package org.team1085.bluegill.commands

import edu.wpi.first.wpilibj.command.PIDCommand
import org.team1085.bluegill.Robot
import org.team1085.bluegill.Map

class TestWheels (setpoint: Double) : PIDCommand (0.00045, 0.0, 0.00003) {

  init { 
    requires(Robot.chassis)
    this.setpoint = setpoint
  }

  override fun usePIDOutput (value: Double) = Robot.chassis.setRightRaw(value)
  override fun returnPIDInput () = Robot.chassis.getRight().toDouble()

  override fun initialize () {
    setSetpoint(this.setpoint)
    Robot.chassis.resetEncoders()
  }

  override fun isFinished () = false
  override fun execute () {}
  override fun interrupted () = Robot.chassis.fullStop()
  override fun end () = Robot.chassis.fullStop()

}