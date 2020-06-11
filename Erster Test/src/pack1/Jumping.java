package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class Jumping {//Hier wird der Sprung ausgeführt, sofern der Spieler auf dem Boden steht
	Timer jumping;//Timer

	public Jumping() {
		jumping = new Timer();
		jumping.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {
				if (Var.moveup == true && Var.steht == true) {
					Var.y = Var.y - 25;

					try {
						Thread.sleep(20);//Dies sind Verzögerungen, da der Sprung sonst extrem ruckartig wäre
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					Var.y = Var.y - 25;

					try {
						Thread.sleep(20);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					Var.y = Var.y - 25;

					try {
						Thread.sleep(20);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					Var.y = Var.y - 25;

					try {
						Thread.sleep(20);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					Var.y = Var.y - 20;

					try {
						Thread.sleep(20);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					Var.y = Var.y - 20;

					try {
						Thread.sleep(20);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					Var.y = Var.y - 20;

					try {
						Thread.sleep(20);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					Var.y = Var.y - 20;

					try {
						Thread.sleep(20);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					Var.y = Var.y - 15;

					try {
						Thread.sleep(20);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					Var.y = Var.y - 15;
					try {
						Thread.sleep(20);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					Var.y = Var.y - 15;
					try {
						Thread.sleep(20);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					Var.y = Var.y - 15;
					try {
						Thread.sleep(20);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					Var.y = Var.y - 10;
					try {
						Thread.sleep(20);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					Var.y = Var.y - 10;
				}
			}

		}, 0, 20);//Zeit, nach der sich der Timer wiederholt

	}

}
