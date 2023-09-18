package org.firstinspires.ftc.teamcode;

import com.acmerobotics.dashboard.telemetry.MultipleTelemetry;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp()
public class GamepadAssignment extends OpMode {
    @Override
    public void init() {
    }

    @Override
    public void loop() {0

        //speed variables
        double speedForward = -gamepad1.left_stick_y / 2.0;
        double sideSpeed = -gamepad1.right_stick_y / 2.0;
        boolean aButton;
        boolean bButton;
        boolean xButton;
        boolean yButton;

        //left stick controls and variables
        telemetry.addData("Left stick x", gamepad1.left_stick_x);
        telemetry.addData("Left stick y", gamepad1.left_stick_y);
        if (gamepad1.left_stick_y < -0.5) {
            telemetry.addData("Left stick", "is negative and large");
        }
        if (gamepad1.left_stick_y > 0.5) {
            telemetry.addData("Right stick", "is positive and large");
        }
        //A-B-X-Y buttons
        telemetry.addData("A button", gamepad1.a);
        telemetry.addData("B button", gamepad1.b);
        telemetry.addData("X button", gamepad1.x);
        telemetry.addData("Y button", gamepad1.y);
        //trigger buttons and trigger sum
        telemetry.addData("Right trigger", gamepad1.right_trigger);
        telemetry.addData("Left trigger", gamepad1.left_trigger);
        float triggerSum = gamepad1.left_trigger + gamepad1.right_trigger;
        telemetry.addData("Trigger sum", triggerSum);
        //speedForward reporting
        telemetry.addData("speed Forward", speedForward);
        //right stick controls and variable
        telemetry.addData("speed Sideways", sideSpeed);
        telemetry.addData("Right stick x", gamepad1.right_stick_x);
        telemetry.addData("Right stick y", gamepad1.right_stick_y);
        if (gamepad1.right_stick_y < -0.5) {
            telemetry.addData("Right stick", "is negative and large");
        }
        if (gamepad1.right_stick_y > 0.5) {
            telemetry.addData("Right stick", "is positive and large");
        }
        //turbo mode
        if(!gamepad1.a) {
            speedForward *= 0.5;
        }
        //crazy mode code
        if (gamepad1.a) {
            speedForward = gamepad1.left_stick_x;
            sideSpeed = gamepad1.left_stick_y;
        }
    }
}
