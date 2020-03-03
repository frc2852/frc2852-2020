/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands.pivot;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.pivot.PivotSubsystem;

public class RaiseThatPosteriorCommand extends CommandBase {

	PivotSubsystem pivotSubsystem;

	/**
	 * Creates a new RaiseThatPosteriorCommand.
	 */
	public RaiseThatPosteriorCommand(PivotSubsystem _pivotSubsystem) {
		pivotSubsystem = _pivotSubsystem;
	}

	// Called when the command is initially scheduled.
	@Override
	public void initialize() {
	}

	// Called every time the scheduler runs while the command is scheduled.
	@Override
	public void execute() {
		pivotSubsystem.RaiseThatPosterior();
	}

	// Called once the command ends or is interrupted.
	@Override
	public void end(boolean interrupted) {
	}

	// Returns true when the command should end.
	@Override
	public boolean isFinished() {
		return pivotSubsystem.RaiseThatPosteriorFinished();
	}
}
