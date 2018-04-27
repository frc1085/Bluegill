package org.team1085.bluegill

class Map {
  companion object {

    // Magic Numbers
    public val INPUT_SCALE = 3.0
    public val DRIVE_WIDTH = 3.5
    public val WHEEL_WIDTH = 3.4
    public val TICKS_PER_REV = 4096
    public val TICK_DIST = 0.1524

    // CAN Channels
    public val RIGHT_CIM_A = 62
    public val RIGHT_CIM_B = 61
    public val RIGHT_CIM_C = 60

    public val LEFT_CIM_A = 59
    public val LEFT_CIM_B = 58
    public val LEFT_CIM_C = 57

    // OI Channels
    public val FIRST_DRIVER = 0
    public val SECOND_DRIVER = 1

    public val FIRST_TRIGGER = 1
    public val FIRST_2 = 2

    public val SECOND_A = 0
    public val SECOND_B = 1

  }
}
