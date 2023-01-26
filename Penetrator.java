package WiederkehrNils;
import robocode.*;

// API help : https://robocode.sourceforge.io/docs/robocode/robocode/JuniorRobot.html

/**
 * Penetrator - a robot by (your name here)
 */
public class Penetrator extends JuniorRobot
{
	/**
	 * run: Penetrator's default behavior
	 */
	public void run() {
		// Initialization of the robot should be put here

		// Some color codes: blue, yellow, black, white, red, pink, brown, grey, orange...
		// Sets these colors (robot parts): body, gun, radar, bullet, scan_arc
		setColors(black, red, yellow, black, red);

		// Robot main loop
		while(true) {
			// Replace the next 4 lines with any behavior you would like
			turnLeft(25);
			back(100);
			turnGunRight(30);
			
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot() {

		turnGunTo(scannedAngle);
		fire(3);
		
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet() {
		// Replace the next line with any behavior you would like
		turnGunRight(180);
		
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall() {
		// Replace the next line with any behavior you would like
		ahead(100);
	}	
}
