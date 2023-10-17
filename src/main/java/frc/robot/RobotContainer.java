// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.subsystems.Chassis;
import frc.robot.commands.Moveforward;
import frc.robot.commands.Moveforward2;
import frc.robot.commands.Turn;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.RunCommand;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.button.Trigger;


public class RobotContainer {
 
  private final Chassis m_drive = new Chassis();

  private final XboxController ycc = new XboxController(Constants.JoystickConstants.kDriverControllerPort);


  public RobotContainer() {m_drive.setDefaultCommand(new RunCommand(()->{
    m_drive.arcadeDrive(ycc.getLeftY()*0.7,ycc.getRightX()*0.7);
  },m_drive)); 
   
  // configureBindings();
  }

  public Command getAutonomousCommand(){
  return new SequentialCommandGroup(
    new Moveforward(m_drive),
    new Turn(m_drive, -90),
    new Moveforward2(m_drive),
    new Turn(m_drive, 90),
    new Moveforward(m_drive)
  );
};
}
