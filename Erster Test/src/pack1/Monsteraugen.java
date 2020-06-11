package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class Monsteraugen {
	Timer Hochrunter;

	public Monsteraugen() {
		Hochrunter=new Timer();//Timer
		Hochrunter.scheduleAtFixedRate(new TimerTask() {
			
			@Override
			public void run() {
				if(Var.u==1) {
					Var.u=2;
				}else {
					Var.u=1;
				}
			}

			
		}, 0, 400);
	}

}
