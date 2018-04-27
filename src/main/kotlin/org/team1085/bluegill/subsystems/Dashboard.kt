package org.team1085.bluegill.subsystems

import edu.wpi.first.wpilibj.command.Subsystem
import edu.wpi.first.wpilibj.DriverStation
import edu.wpi.first.wpilibj.Joystick
import edu.wpi.first.wpilibj.XboxController
import edu.wpi.first.wpilibj.buttons.NetworkButton
import edu.wpi.first.wpilibj.buttons.JoystickButton
import edu.wpi.first.networktables.NetworkTableInstance
import org.team1085.bluegill.Map

class Dashboard : Subsystem () {

  private val station = DriverStation.getInstance()

  private val globalTable = NetworkTableInstance.create()
  private val visionTable = globalTable.getTable("VISION")
  private val sensorTable = globalTable.getTable("SENSOR")
  private val errorsTable = globalTable.getTable("ERRORS")

  public val firstDriver = Joystick(Map.FIRST_DRIVER)
  public val secondDriver = XboxController(Map.SECOND_DRIVER)

  override fun initDefaultCommand () {}

}
