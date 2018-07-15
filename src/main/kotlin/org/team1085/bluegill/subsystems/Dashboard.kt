package org.team1085.bluegill.subsystems

import edu.wpi.first.wpilibj.command.Subsystem
import edu.wpi.first.wpilibj.DriverStation
import edu.wpi.first.wpilibj.Joystick
import edu.wpi.first.wpilibj.XboxController
import edu.wpi.first.wpilibj.buttons.NetworkButton
import edu.wpi.first.wpilibj.buttons.JoystickButton
import edu.wpi.first.networktables.NetworkTableInstance
import org.team1085.bluegill.pathing.FollowPath
import org.team1085.bluegill.pathing.Paths
import org.team1085.bluegill.commands.EncoderTest
import org.team1085.bluegill.commands.TestWheels
import org.team1085.bluegill.commands.Logging
import org.team1085.bluegill.Map

class Dashboard : Subsystem () {

  private val station = DriverStation.getInstance()

  private val globalTable = NetworkTableInstance.getDefault()
  public val visionTable = globalTable.getTable("VISION")
  public val sensorTable = globalTable.getTable("SENSOR")
  public val errorsTable = globalTable.getTable("ERRORS")

  public val firstDriver = Joystick(Map.FIRST_DRIVER)
  public val secondDriver = XboxController(Map.SECOND_DRIVER)

  override fun initDefaultCommand () = setDefaultCommand(Logging())

  public fun selectAuto () = FollowPath(Paths.S_CURVE)

}
