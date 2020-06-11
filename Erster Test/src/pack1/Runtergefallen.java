package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class Runtergefallen {//Kontrolliert, ob der Spieler heruntergefallen ist und somit verloren hat
	Timer Runtergefallen;

	public Runtergefallen() {
		Runtergefallen = new Timer();//Timer
		Runtergefallen.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {
				if(Var.y>1000) {//Ist der Spieler heruntergefallen?
					System.out.print("Runtergefallen!");
					Var.backgroundX1=0;//setzt den Spieler wieder an den Anfang
					Var.y=0;
					Var.fallspeed=0;
				}
			}
					
		}, 0, 500);//Zeit, nach der sich der Timer wiederholt
		
	}

}
