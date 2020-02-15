
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.InnerElevatorSubsystem;

public class MinInnerElevatorPositionCommand extends CommandBase {
  /**
   * Creates a new MaxInnerElevatorPositionCommand.
   */
  private final InnerElevatorSubsystem innerElevatorSubsystem;

  public MinInnerElevatorPositionCommand(InnerElevatorSubsystem _innerElevatorSubsystem) {
    // Use addRequirements() here to declare subsystem dependencies.
    innerElevatorSubsystem = _innerElevatorSubsystem;
    addRequirements(innerElevatorSubsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {

  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
  innerElevatorSubsystem.innerElevatorMinPosition();
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
  }
}