package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class Movement {//Hier wird der Spieler bewegt, bzw. der Spieler bleibt immer in der Mitte des Bildschirms und der Hintergrund bewegt sich
	Timer movement;

	public Movement() {// Timer
		movement = new Timer();
		movement.scheduleAtFixedRate(new TimerTask() {
			

			@Override
			public void run() {
				//nach links laufen
				if (Var.moveleft == true && Var.backgroundX1 <= -10) {
					Var.backgroundX1 = Var.backgroundX1 + Var.speed;
				}
				//nach rechts laufen
				if (Var.moveright == true) {
					Var.backgroundX1 = Var.backgroundX1 - Var.speed;
				}

			}
			

		}, 0, 2);//Zeit, nach der sich der Timer wiederholt
		

	}
}
