package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class Gravity {//Diese Klasse regelt die Schwerkraft, ohne diese w�re ein Jump'n'Run relativ sinnlos
	Timer gravity;

	public Gravity() {
		gravity = new Timer();
		gravity.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {//Wenn sich der Spieler nicht auf einer Plattform befindet, setzt die Schwerkraft ein und sorgt daf�r, dass er es bald wieder tut
				if (Var.y < Var.bodenh�he || Var.y > (Var.bodenh�he+5)) {
					Var.steht=false;
					Var.fallspeed = Var.fallspeed + 1;
				}

				if(Var.y<(Var.bodenh�he+20) && Var.y>(Var.bodenh�he-20)) {
					Var.steht=true;
					Var.fallspeed=0;
					Var.y=Var.bodenh�he;
				}
				
				Var.y = Var.y + Var.fallspeed;//Die Fallgeschwindigkeit nimmt zu, je l�nger der Spieler f�llt

			}
			

		}, 0, 30);//Zeit, nach der sich der Timer wiederholt
	}

}
