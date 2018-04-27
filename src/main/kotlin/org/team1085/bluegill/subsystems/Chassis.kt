package org.team1085.bluegill.subsystems

import edu.wpi.first.wpilibj.command.Subsystem
import com.ctre.phoenix.motorcontrol.can.TalonSRX
import com.ctre.phoenix.motorcontrol.ControlMode
import com.ctre.phoenix.motorcontrol.FeedbackDevice
import org.team1085.bluegill.commands.ArcadeDrive
import org.team1085.bluegill.Map

class Chassis : Subsystem () {

  private val rightCimA = TalonSRX(Map.RIGHT_CIM_A)
  private val rightCimB = TalonSRX(Map.RIGHT_CIM_B)
  private val rightCimC = TalonSRX(Map.RIGHT_CIM_C)

  private val leftCimA = TalonSRX(Map.LEFT_CIM_A)
  private val leftCimB = TalonSRX(Map.LEFT_CIM_B)
  private val leftCimC = TalonSRX(Map.LEFT_CIM_C)

  init {
    rightCimA.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, 0)
    leftCimA.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, 0)
  }

  override fun initDefaultCommand () = setDefaultCommand(ArcadeDrive())

  public fun setSpeed (rate: Double) {
    rightCimA.set(ControlMode.PercentOutput, rate)
    rightCimB.set(ControlMode.PercentOutput, rate)
    rightCimC.set(ControlMode.PercentOutput, rate)

    leftCimA.set(ControlMode.PercentOutput, -rate)
    leftCimB.set(ControlMode.PercentOutput, -rate)
    leftCimC.set(ControlMode.PercentOutput, -rate)
  }

  public fun setRightRaw (rate: Double) {
    rightCimA.set(ControlMode.PercentOutput, rate)
    rightCimB.set(ControlMode.PercentOutput, rate)
    rightCimC.set(ControlMode.PercentOutput, rate)
  }

  public fun setLeftRaw (rate: Double) {
    leftCimA.set(ControlMode.PercentOutput, -rate)
    leftCimB.set(ControlMode.PercentOutput, -rate)
    leftCimC.set(ControlMode.PercentOutput, -rate)
  }

  public fun fullStop () {
    rightCimA.set(ControlMode.PercentOutput, 0.0)
    rightCimB.set(ControlMode.PercentOutput, 0.0)
    rightCimC.set(ControlMode.PercentOutput, 0.0)

    leftCimA.set(ControlMode.PercentOutput, 0.0)
    leftCimB.set(ControlMode.PercentOutput, 0.0)
    leftCimC.set(ControlMode.PercentOutput, 0.0)
  }

  public fun getRight () = rightCimA.getSelectedSensorPosition(0)
  public fun getLeft () = leftCimA.getSelectedSensorPosition(0)

  public fun resetEncoders () {
    rightCimA.setSelectedSensorPosition(0, 0, 0)
    leftCimA.setSelectedSensorPosition(0, 0, 0)
  }

}