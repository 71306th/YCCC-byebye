

package frc.robot.commands;

import frc.robot.subsystems.Chassis;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class Moveforward2 extends CommandBase {
  private final Chassis drivesub; 

  double output, goalPos, currentPos, error, kP=0.75;

  public Moveforward2(Chassis drivesub) {
    this.drivesub = drivesub;
    addRequirements(drivesub);
  }

  @Override
  public void initialize() {
    drivesub.setPositionToZero();
    goalPos = 2;
  }

  @Override
  public void execute() {
    currentPos = drivesub.getCurrentPosition();
    error = goalPos - currentPos;
    output = kP*error;

    drivesub.arcadeDrive(-output, 0);
  }

  @Override
  public void end(boolean interrupted) {}

  @Override
  public boolean isFinished() {
    if(Math.abs(error)<0.1){
      drivesub.arcadeDrive(0, 0);
      return true;
    }else{
    return false;
    }
  }
}
