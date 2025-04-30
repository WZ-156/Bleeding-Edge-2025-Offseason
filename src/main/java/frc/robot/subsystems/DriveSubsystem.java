package frc.robot.subsystems;

import com.revrobotics.spark.SparkMax;

import frc.robot.Constants;

public class DriveSubsystem {
    private SparkMax motor1;
    private SparkMax motor2;
    private SparkMax motor3;
    private SparkMax motor4;

    public DriveSubsystem(){
        motor1 = new SparkMax(Constants.Drive.ID1, null);
        motor2 = new SparkMax(Constants.Drive.ID2, null);
        motor3 = new SparkMax(Constants.Drive.ID3, null);
        motor4 = new SparkMax(Constants.Drive.ID4, null);

        
    }

    public void Drive(double lSpeed, double rSpeed){

    }
}
