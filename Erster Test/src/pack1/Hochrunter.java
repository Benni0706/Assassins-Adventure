package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class Hochrunter {//Sorgt dafür, dass sich der Feuerball hoch und runter bewegt
	Timer Hochrunter;

	public Hochrunter() {
		Hochrunter=new Timer();//Timer
		Hochrunter.scheduleAtFixedRate(new TimerTask() {
			
			@Override
			public void run() {
				if(Var.c==1) {
					//Var.ybew=100;
					for(int i=0;i<450;i++) {
						Var.ybew=Var.ybew-1;
						try {
							Thread.sleep(10);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					Var.c=2;
					
				}else {
					//Var.ybew=550;
					for(int i=0;i<450;i++) {
						Var.ybew=Var.ybew+1;
						try {
							Thread.sleep(10);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					Var.c=1;
					
				}

			}
		}, 0, 100);
		
	}

}
