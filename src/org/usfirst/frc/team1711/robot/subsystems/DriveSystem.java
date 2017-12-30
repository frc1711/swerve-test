package org.usfirst.frc.team1711.robot.subsystems;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * 
 */
public class DriveSystem extends Subsystem 
{
	//four power drive motors
	//these need to ALL have encoders connected for drive to work properly
	CANTalon frontLeftDrivePower;
	CANTalon frontRightDrivePower;
	CANTalon rearLeftDrivePower;
	CANTalon rearRightDrivePower;
	
	//four motors controlling wheel unit rotation
	CANTalon frontLeftDriveAngle;
	CANTalon frontRightDriveAngle;
	CANTalon rearLeftDriveAngle;
	CANTalon rearRightDriveAngle;
	
	


	public DriveSystem()
	{
		
	}

    public void initDefaultCommand() 
    {
    }
}

