package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Chassis;


public class Turn extends CommandBase {
    private final Chassis drivesub;
    private double targetangle; 
  
    double output, goalDeg, currentDeg, error, kP=0.012;
  
    public Turn(Chassis drivesub, double itargetangle) {
      targetangle = itargetangle;
      this.drivesub = drivesub;
      addRequirements(drivesub);
    }
  
    @Override
    public void initialize() {
      drivesub.resetGyro();
      currentDeg = drivesub.getRotation2d().getDegrees();
      goalDeg = currentDeg+targetangle;
    }
  
    @Override
    public void execute() {
      currentDeg = drivesub.getRotation2d().getDegrees();
      error = goalDeg - currentDeg;
      output = kP*error;
      drivesub.arcadeDrive(0, -output);
    }
  
    @Override
    public void end(boolean interrupted) {}
  
    @Override
    public boolean isFinished() {
      if(Math.abs(error)<7){return true;}
      return false;
    }
  }