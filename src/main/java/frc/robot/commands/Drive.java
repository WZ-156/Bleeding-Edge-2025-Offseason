package frc.robot.commands;
//imports
import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.DriveSubsystem;


//this makes it move :)

public class Drive extends Command{
    //declaring variables

    //joystick suppliers
    private DoubleSupplier lSpeed;
    private DoubleSupplier rSpeed;
    private DriveSubsystem drive;

    public Drive(DoubleSupplier lSpeedSup, DoubleSupplier rSpeedSup, DriveSubsystem drive){
        //assigning variables
        lSpeed = lSpeedSup;
        rSpeed = rSpeedSup;
        this.drive = drive;
        //require drive
        addRequirements(drive);
    }

    @Override
    public void execute(){
        drive.Drive(lSpeed.getAsDouble(), rSpeed.getAsDouble());
    }
}
