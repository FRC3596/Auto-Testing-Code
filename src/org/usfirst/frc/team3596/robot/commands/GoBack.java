package org.usfirst.frc.team3596.robot.commands;

import org.usfirst.frc.team3596.robot.Robot;

import edu.wpi.first.wpilibj.command.TimedCommand;

/**
 *
 */
public class GoBack extends TimedCommand {

	public GoBack(double x) {
        super(x);
        requires(Robot.drivetrain);
    }

    // Called just before this Command runs the first time
    protected void execute() {
    	Robot.drivetrain.drive(-0.5,0);
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.drivetrain.drive(0,0);
    }
}
