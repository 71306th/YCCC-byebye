// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

public final class Constants {
  public static class JoystickConstants {
    public static final int kDriverControllerPort = 0;
    public static final int kOperatorControllerPort = 1;

    public static final int leftStick_X = 0;
    public static final int leftStick_Y = 1;
    public static final int rightStick_X = 4;
    public static final int rightStick_Y = 5;
    public static final int trigger_L = 2;
    public static final int trigger_R = 3;
    public static final int btn_A = 1;
    public static final int btn_B = 2;
    public static final int btn_X = 3;
    public static final int btn_Y = 4;
    public static final int btn_LB = 5;
    public static final int btn_RB = 6;
    public static final int btn_LS = 9;
    public static final int btn_RS = 10;
  }

  public static final class Chassis {
    public static final int LFMotor = 1;
    public static final int LRMotor = 2;
    public static final int RFMotor = 3;
    public static final int RRMotor = 4;
    public static final int CANCoder = 5;
    public static final double wheelMeters = 0.1495;
    
  }
}