package org.usfirst.frc.team1337.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	public static final int LEFT_DRIVE_SLAVE = 4, LEFT_DRIVE_MASTER = 1;
	public static final int RIGHT_DRIVE_SLAVE = 2, RIGHT_DRIVE_MASTER = 3;
	
	public static final int PCM = 25;
	public static final int shotPinForward = 25;
	public static final int shotPinReverse = 25;
}
