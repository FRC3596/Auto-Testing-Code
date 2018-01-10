package org.usfirst.frc.team3596.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class TimedMovement extends CommandGroup {

    public TimedMovement() {
    	
    	addSequential(new GoForward(2));
    	addSequential(new TurnLeft(2));
    	addSequential(new TurnRight(2));
    	addSequential(new GoNowhere(2));
    	addSequential(new GoBack(2));
    	addSequential(new GoForward(2));
    	addSequential(new TurnLeft(2));
    	
    	
    }
}
