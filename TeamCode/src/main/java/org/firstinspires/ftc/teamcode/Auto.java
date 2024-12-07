package org.firstinspires.ftc.teamcode;

import com.qualcomm.hardware.lynx.LynxModule;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.robot.Robot;

import org.firstinspires.ftc.robotcore.external.Telemetry;

import java.util.List;

public abstract class Auto extends LinearOpMode {

    // Subsystems
    public Chassis chassis;
    public OdometryPinpoint odometryPinpoint;
    public Telemetry telemetry;

}