package org.team1085.bluegill.pathing

import jaci.pathfinder.Waypoint

class Paths {
  companion object {
    public val CROSS_LINE = arrayOf(
      Waypoint(0.0, 0.0, 0.0),
      Waypoint(0.5, 0.0, 0.0)
    )

    val C_CURVE = arrayOf(
      Waypoint(0.0, 0.0, 0.0),
      Waypoint(0.5, 0.0, 0.0),
      Waypoint(1.0, -0.5, -0.785),
      Waypoint(2.5, -1.0, 0.0)
      //Waypoint(2.0, 0.0, 0.0)
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
