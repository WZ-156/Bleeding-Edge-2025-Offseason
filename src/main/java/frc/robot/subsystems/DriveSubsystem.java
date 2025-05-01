package frc.robot.subsystems;

import java.io.ObjectInputFilter.Config;

import com.revrobotics.spark.SparkBase.PersistMode;
import com.revrobotics.spark.SparkBase.ResetMode;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.config.SparkMaxConfig;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveSubsystem extends SubsystemBase{
    private SparkMax motor1;
    private SparkMax motor2;
    private SparkMax motor3;
    private SparkMax motor4;
    

    public DriveSubsystem(){
        motor1 = new SparkMax(Constants.Drive.ID1, null);
        motor2 = new SparkMax(Constants.Drive.ID2, null);
        motor3 = new SparkMax(Constants.Drive.ID3, null);
        motor4 = new SparkMax(Constants.Drive.ID4, null);

        SparkMaxConfig config = new SparkMaxConfig();
        config.follow(motor1);
        motor2.configure(config, ResetMode.kResetSafeParameters, PersistMode.kPersistParameters);
        config.follow(motor3);
        motor4.configure(config, ResetMode.kResetSafeParameters, PersistMode.kPersistParameters);

    }

    public void Drive(double lSpeed, double rSpeed){
        motor1.set(lSpeed);
        motor3.set(rSpeed);
    }

}
