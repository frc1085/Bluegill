package org.team1085.bluegill.pathing

import jaci.pathfinder.Waypoint

class Paths {
  companion object {
    public val S_CURVE = arrayOf(
      Waypoint(0.0, 0.0, 0.0),
      Waypoint(6.0, 6.0, 0.0)
    )

    public val CROSS_LINE = arrayOf(
      Waypoint(0.0, 0.0, 0.0),
      Waypoint(2.0, 0.0, 0.0)
    )

    public val C_CURVE = arrayOf(
      Waypoint(0.0, 0.0, 0.0),
      Waypoint(0.5, 0.0, 0.0),
      Waypoint(1.0, -0.5, -0.785),
      Waypoint(2.5, -1.0, 0.0)
      //Waypoint(2.0, 0.0, 0.0)
    )

    public val H_CURVE = arrayOf(
      Waypoint(0.0, 0.0, 0.0),
      Waypoint(0.04, 0.42, 0.28),
      Waypoint(0.4, 0.86, 0.63),
      Waypoint(0.64, 1.16, 1.05),
      Waypoint(0.94, 1.379, 1.57)
    )

    public val TEST = arrayOf(
      Waypoint(0.0, 0.0, 0.0),
      Waypoint(5.0, -2.0, 0.0)
    )

    public val LEFT_LEFT_SCALE = arrayOf(
      Waypoint(0.0, 0.0, 0.0)
    )

    public val LEFT_RIGHT_SCALE = arrayOf(
      Waypoint(0.0, 0.0, 0.0)
    )

    public val RIGHT_LEFT_SCALE = arrayOf(
      Waypoint(0.0, 0.0, 0.0)
    )
  }
}
