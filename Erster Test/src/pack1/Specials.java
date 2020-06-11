package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class Specials {//Hier werden spezielle Features kontrolliert
	Timer Specials;

	public Specials() {
		Specials=new Timer();//Timer
		Specials.scheduleAtFixedRate(new TimerTask() {
			
			@Override
			public void run() {
				if(Var.backgroundX1<-5200 && Var.backgroundX1>-5300 && Var.y>300 && Var.y<350) {//Springt der Spieler in das Portal?
					Var.y=-100;
					Var.backgroundX1=-6700;
					Var.fallspeed=0;
				}
				
				if(Var.backgroundX1<-6990 && Var.backgroundX1>-7220 && Var.steht==true) {//Läuft der Spieler auf/gegen die Stacheln?
					Var.y=0;
					Var.fallspeed=0;
					Var.backgroundX1=0;
				}
				
				if(Var.backgroundX1<-7390 && Var.backgroundX1>-7620 && Var.steht==true) {//Läuft der Spieler auf/gegen die Stacheln?
					Var.y=0;
					Var.fallspeed=0;
					Var.backgroundX1=0;
				}
				
				if(Var.backgroundX1<-8780 && Var.backgroundX1>-8900 && Var.y<Var.ybew+50 && Var.y>Var.ybew-100) {//Berührt der Spieler den Feuerball?
					Var.y=0;
					Var.fallspeed=0;
					Var.backgroundX1=0;
				}
				
				if(Var.backgroundX1<-10000) {//Hat der Spieler das Ziel erreicht?
					Var.win=1;
					try {
						Thread.sleep(10000);//Verzögerung
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					Var.y=0;
					Var.fallspeed=0;
					Var.backgroundX1=0;
					Var.win=0;
					
					
				}
					
			}
		}, 0, 10);
	}

}
