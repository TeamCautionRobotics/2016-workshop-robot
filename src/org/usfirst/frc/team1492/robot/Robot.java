
package org.usfirst.frc.team1492.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Solenoid;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {

	Solenoid liftPiston;
	Solenoid ejectorPiston;
	Joystick joystick;
    
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
        liftPiston = new Solenoid(0);
        ejectorPiston = new Solenoid(1);
        joystick = new Joystick(0);
    }
    
	/**
	 * This function is called once before the start of autonomous
	 */
    public void autonomousInit() {

    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        // Controls for the lift
        if (joystick.getRawButton(Buttons.Y)) {
            // Lift up button is pressed
            liftPiston.set(true);
        } else if (joystick.getRawButton(Buttons.A)) {
            // Lift down button is pressed
            liftPiston.set(false);
        }
        
        // Controls for the ejector
        if (joystick.getRawButton(Buttons.B)) {
            // Ejector out button is pressed
            ejectorPiston.set(true);
        } else if (joystick.getRawButton(Buttons.X)) {
            ejectorPiston.set(false);
        }
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
    
    }
    
    
    class Buttons {
        public final static int A = 1;
        public final static int B = 2;
        public final static int X = 3;
        public final static int Y = 4;

        // Above analog triggers
        public final static int LEFT_BUMPER = 5, RIGHT_BUMPER = 6;

        public final static int BACK = 7, START = 8;

        // Joystick click
        public final static int LEFT_JOYSTICK = 9, RIGHT_JOYSTICK = 10;
    }

    class Axises {
        public final static int LEFT_X = 0, LEFT_Y = 1;
        public final static int LEFT_TRIGGER = 2, RIGHT_TRIGGER = 3;
        public final static int RIGHT_X = 4, RIGHT_Y = 5;
    }
}
