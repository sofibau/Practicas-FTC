// package orignal de los ejemplos:
// package org.firstinspires.ftc.robotcontroller.external.samples;

// package para la simulación:
// package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.util.Range;

/**
 * Plantilla para los cogigos de práctica
 * En name escribe tu nombre y UNA palabra que describa
 * el código, o la versión
 * En group, escribe "TwoWheel", "Mechanum" o "ArmBot"
 */

@TeleOp(name="TuNombre: Plantilla", group="TwoWheel")
// @Disabled
public class Plantilla extends OpMode{
    // Declare OpMode members.
    private ElapsedTime runtime = new ElapsedTime();
    private DcMotor leftDrive = null;
    private DcMotor rightDrive = null;

    /*
     * Code to run ONCE when the driver hits INIT
     */
    @Override
    public void init() {
        telemetry.addData("Status", "Initialized");

        // Initialize the hardware variables. 
        // Aseguráte de que los nombres coincidan con la configuración
        // Si estás en la simulación: checa el final de esta plantilla
        // para conocer los detalles
        // Si estás con el robot real: revisa que coincidan en el 
        // Robot configuration

        // Tell the driver that initialization is complete.
        telemetry.addData("Status", "Initialized");
    }

    /*
     * Code to run REPEATEDLY after the driver hits INIT, but before they hit PLAY
     */
    @Override
    public void init_loop() {
    }

    /*
     * Code to run ONCE when the driver hits PLAY
     */
    @Override
    public void start() {
        runtime.reset();
    }

    /*
     * Code to run REPEATEDLY after the driver hits PLAY but before they hit STOP
     */
    @Override
    public void loop() {
        /**
         * Tu código aquí
         */
    }

    /*
     * Code to run ONCE after the driver hits STOP
     */
    @Override
    public void stop() {
    }

    /**
     * CONFIG: Mechanum
             Motors:
               back_right_motor
               front_right_motor
               front_left_motor
               back_left_motor
             Servos:
               back_servo
             Color Sensors:
               color_sensor
             BNO055IMU Sensors:
               imu
             Distance Sensors:
               left_distance
               right_distance
               front_distance
               back_distance
        CONFIG: Two Wheel
            Motors:
              left_motor
              right_motor
            Servos:
              back_servo
            Color Sensors:
              color_sensor
            Gyro Sensors:
              gyro_sensor
            Distance Sensors:
              left_distance
              right_distance
              front_distance
              back_distance
        CONFIG: ArmBot
            Motors:
            back_right_motor
            front_right_motor
            arm_motor
            front_left_motor
            back_left_motor
            Servos:
            hand_servo
            Color Sensors:
            color_sensor
            BNO055IMU Sensors:
            imu
            Distance Sensors:
            left_distance
            right_distance
            front_distance
            back_distance
     * 
     */
}
