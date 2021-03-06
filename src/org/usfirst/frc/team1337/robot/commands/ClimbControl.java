package org.usfirst.frc.team1337.robot.commands;

import org.usfirst.frc.team1337.robot.OI;
import org.usfirst.frc.team1337.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ClimbControl extends Command {

	public ClimbControl() {
		requires(Robot.climb);
	}

	// Called just before this Command runs the first time
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
	
		logging();
		//use the hat to control the movement of the climber 
		//if the hat is going down
		if(Robot.oi.joystick1.getPOV()==0) {
			Robot.climb.set(-1);
			//if the hat is pointing up
		}else if (Robot.oi.joystick1.getPOV()==180) {
			Robot.climb.set(1);
		}else {
			Robot.climb.set(0);
		}
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	protected void end() {
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
		end();
	}
	//current logging
	//do we need it?
	void logging() {
		Robot.logCurrentCommand("ClimbControl");
		//oof
		Robot.climb.logging();
	}
}
