package WiederkehrNils;
import robocode.*;

public class Penetrator extends JuniorRobot
{

	public void run() {

		setColors(black, red, yellow, black, red);


		while(true) {

			turnLeft(25);
			back(100);
			turnGunRight(30);
			
		}
	}

	public void onScannedRobot() {

		turnGunTo(scannedAngle);
		fire(3);
		
	}

	public void onHitByBullet() {

		turnGunRight(180);
		
	}
	

	public void onHitWall() {

		ahead(100);
	}	
}
