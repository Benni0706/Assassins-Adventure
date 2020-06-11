package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class Gravity {//Diese Klasse regelt die Schwerkraft, ohne diese wäre ein Jump'n'Run relativ sinnlos
	Timer gravity;

	public Gravity() {
		gravity = new Timer();
		gravity.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {//Wenn sich der Spieler nicht auf einer Plattform befindet, setzt die Schwerkraft ein und sorgt dafür, dass er es bald wieder tut
				if (Var.y < Var.bodenhöhe || Var.y > (Var.bodenhöhe+5)) {
					Var.steht=false;
					Var.fallspeed = Var.fallspeed + 1;
				}

				if(Var.y<(Var.bodenhöhe+20) && Var.y>(Var.bodenhöhe-20)) {
					Var.steht=true;
					Var.fallspeed=0;
					Var.y=Var.bodenhöhe;
				}
				
				Var.y = Var.y + Var.fallspeed;//Die Fallgeschwindigkeit nimmt zu, je länger der Spieler fällt

			}
			

		}, 0, 30);//Zeit, nach der sich der Timer wiederholt
	}

}
