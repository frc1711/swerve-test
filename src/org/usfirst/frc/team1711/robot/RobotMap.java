package org.usfirst.frc.team1711.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 * 
 * we LOVE magic numbers here at team 1711
 */
public class RobotMap
{
	//$800 worth of variables coming at ya
	
	//four power drive motors
	//these need to ALL have encoders connected for drive to work properly
	public static int frontLeftDrivePower;
	public static int frontRightDrivePower;
	public static int rearLeftDrivePower;
	public static int rearRightDrivePower;
	
	//four motors controlling wheel unit rotation
	public static int frontLeftDriveAngle;
	public static int frontRightDriveAngle;
	public static int rearLeftDriveAngle;
	public static int rearRightDriveAngle;

	public RobotMap()
	{
		frontLeftDrivePower = 0;
		frontRightDrivePower = 1;
		rearLeftDrivePower = 2;
		rearRightDrivePower = 3;
		
		frontLeftDriveAngle = 4;
		frontRightDriveAngle = 5;
		rearLeftDriveAngle = 6;
		rearRightDriveAngle = 7;
	}
}