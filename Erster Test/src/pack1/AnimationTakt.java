package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class AnimationTakt {//Hier wird die Animation der Spielfigur geregelt, d.h. die Variable b bestimmt, welche Animation in der Label-Klasse gezeigt wird, beim Laufen wird dies ständig gewechselt
	Timer AnimationTakt;

	public AnimationTakt() {
		AnimationTakt = new Timer();//Timer
		AnimationTakt.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {
				if(Var.steht==true) {
					if(Var.b==1) {
						Var.b=2;
					}else {
						Var.b=1;
					}
				}
					
			}
		}, 0, 150);//Zeit, nach der sich der Timer wiederholt
		
	}

}
