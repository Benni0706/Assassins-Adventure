package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class Bodenh�he {//Diese Klasse sorgt daf�r, dass die Plattformen nicht nur Bilder sind, sondern auch fester Boden unter den F��en
	Timer Bodenh�he;

	public Bodenh�he() {
		Bodenh�he = new Timer();//Timer
		Bodenh�he.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {//Fester Boden wird erzeugt
				if(Var.backgroundX1>-1500) {
					Var.bodenh�he=680;
				}
				if(Var.backgroundX1<-1500 && Var.backgroundX1>-2500) {//Das sind jeweils einzelne Plattformen, bzw. L�cken, in denen der Boden so weit unten ist, dass man vorher verliert
					Var.bodenh�he=530;
				}
				if(Var.backgroundX1<-2500 && Var.backgroundX1>-3000) {
					Var.bodenh�he=370;
				}
				if(Var.backgroundX1<-3000 && Var.backgroundX1>-3500) {
					Var.bodenh�he=620;
				}
				if(Var.backgroundX1<-3500 && Var.backgroundX1>-3800) {//L�cke 1
					Var.bodenh�he=1200;
				}
				if(Var.backgroundX1<-3750 && Var.backgroundX1>-4050) {
					Var.bodenh�he=620;
				}
				if(Var.backgroundX1<-4000 && Var.backgroundX1>-4300) {//L�cke 2
					Var.bodenh�he=1200;
				}
				if(Var.backgroundX1<-4300 && Var.backgroundX1>-5000) {
					Var.bodenh�he=620;
				}
				if(Var.backgroundX1<-5000 && Var.backgroundX1 >-5100) {//L�cke 3
					Var.bodenh�he=1200;
				}
				if(Var.backgroundX1<-5100 && Var.backgroundX1>-6000) {
					Var.bodenh�he=500;
				}
				if(Var.backgroundX1<-6000 && Var.backgroundX1 >-6600) {//L�cke 4
					Var.bodenh�he=1200;
				}
				if(Var.backgroundX1<-6600 && Var.backgroundX1 >-8000) {
					Var.bodenh�he=600;
				}
				if(Var.backgroundX1<-8000 && Var.backgroundX1 >-8500) {
					Var.bodenh�he=420;
				}
				if(Var.backgroundX1<-8500 && Var.backgroundX1 >-8700) {//L�cke 5
					Var.bodenh�he=1200;
				}
				if(Var.backgroundX1<-8700 && Var.backgroundX1 >-9000) {
					Var.bodenh�he=600;
				}
				if(Var.backgroundX1<-9000 && Var.backgroundX1 >-9200) {//L�cke 6
					Var.bodenh�he=1200;
				}
				if(Var.backgroundX1<-9200 && Var.backgroundX1 >-11000) {
					Var.bodenh�he=600;
				}
				if(Var.backgroundX1<-11000) {//L�cke am Ende
					Var.bodenh�he=1200;
				}
				
				
			}
					
		}, 0, 10);//Zeit, nach der sich der Timer wiederholt
	}

}
