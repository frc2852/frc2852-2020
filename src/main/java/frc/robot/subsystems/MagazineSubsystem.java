/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class MagazineSubsystem extends SubsystemBase { // loads and stores the balls
 	private TalonSRX magazineMotor = new TalonSRX(Constants.MAGAZINE);
  	/**
   	* Creates a new MagazineSubsystem.
   	*/
	public MagazineSubsystem() {
		magazineMotor.configFactoryDefault();

   		magazineMotor.setNeutralMode(NeutralMode.Brake);

	}
 	@Override
  	public void periodic() {
    	// This method will be called once per scheduler run
	  }
	  
	public void manualLoad(){
		magazineMotor.set(ControlMode.Velocity, 0.7);
	}

	public void manualReverseLoad(){ //magazine runs in reverse
		magazineMotor.set(ControlMode.Velocity, -0.5);
	}
}
