package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class Zaehlen {//Diese Klasse sorgt für die Animation des Feuerwerks
	Timer Hochrunter;

	public Zaehlen() {
		Hochrunter=new Timer();//Timer
		Hochrunter.scheduleAtFixedRate(new TimerTask() {
			
			@Override
			public void run() {
				if(Var.win==1) {
					try {
						Thread.sleep(600);
					} catch (InterruptedException e) {
						e.printStackTrace();
						}
					Var.z=2;
					try {
						Thread.sleep(600);
					} catch (InterruptedException e) {
						e.printStackTrace();
						}
					Var.z=3;
					try {
						Thread.sleep(600);
					} catch (InterruptedException e) {
						e.printStackTrace();
						}
					Var.z=4;
					try {
						Thread.sleep(1500);
					} catch (InterruptedException e) {
						e.printStackTrace();
						}
				}
			}

			
		}, 0, 100);
	}

}
