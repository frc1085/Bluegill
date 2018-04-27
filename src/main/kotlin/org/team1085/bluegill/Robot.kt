package org.team1085.bluegill

import edu.wpi.first.wpilibj.IterativeRobot
import edu.wpi.first.wpilibj.command.Scheduler
import org.team1085.bluegill.subsystems.Chassis
import org.team1085.bluegill.subsystems.Dashboard

class Robot : IterativeRobot () {

  companion object {
    public val chassis = Chassis()
    public val dashboard = Dashboard()
  }

  override fun robotInit () {}
  override fun autonomousInit () {}
  override fun teleopInit () {}

  override fun autonomousPeriodic () = Scheduler.getInstance().run()
  override fun teleopPeriodic () = Scheduler.getInstance().run()

}