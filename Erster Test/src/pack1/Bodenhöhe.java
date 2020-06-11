package pack1;

import java.util.Timer;
import java.util.TimerTask;

public class Bodenhöhe {//Diese Klasse sorgt dafür, dass die Plattformen nicht nur Bilder sind, sondern auch fester Boden unter den Füßen
	Timer Bodenhöhe;

	public Bodenhöhe() {
		Bodenhöhe = new Timer();//Timer
		Bodenhöhe.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {//Fester Boden wird erzeugt
				if(Var.backgroundX1>-1500) {
					Var.bodenhöhe=680;
				}
				if(Var.backgroundX1<-1500 && Var.backgroundX1>-2500) {//Das sind jeweils einzelne Plattformen, bzw. Lücken, in denen der Boden so weit unten ist, dass man vorher verliert
					Var.bodenhöhe=530;
				}
				if(Var.backgroundX1<-2500 && Var.backgroundX1>-3000) {
					Var.bodenhöhe=370;
				}
				if(Var.backgroundX1<-3000 && Var.backgroundX1>-3500) {
					Var.bodenhöhe=620;
				}
				if(Var.backgroundX1<-3500 && Var.backgroundX1>-3800) {//Lücke 1
					Var.bodenhöhe=1200;
				}
				if(Var.backgroundX1<-3750 && Var.backgroundX1>-4050) {
					Var.bodenhöhe=620;
				}
				if(Var.backgroundX1<-4000 && Var.backgroundX1>-4300) {//Lücke 2
					Var.bodenhöhe=1200;
				}
				if(Var.backgroundX1<-4300 && Var.backgroundX1>-5000) {
					Var.bodenhöhe=620;
				}
				if(Var.backgroundX1<-5000 && Var.backgroundX1 >-5100) {//Lücke 3
					Var.bodenhöhe=1200;
				}
				if(Var.backgroundX1<-5100 && Var.backgroundX1>-6000) {
					Var.bodenhöhe=500;
				}
				if(Var.backgroundX1<-6000 && Var.backgroundX1 >-6600) {//Lücke 4
					Var.bodenhöhe=1200;
				}
				if(Var.backgroundX1<-6600 && Var.backgroundX1 >-8000) {
					Var.bodenhöhe=600;
				}
				if(Var.backgroundX1<-8000 && Var.backgroundX1 >-8500) {
					Var.bodenhöhe=420;
				}
				if(Var.backgroundX1<-8500 && Var.backgroundX1 >-8700) {//Lücke 5
					Var.bodenhöhe=1200;
				}
				if(Var.backgroundX1<-8700 && Var.backgroundX1 >-9000) {
					Var.bodenhöhe=600;
				}
				if(Var.backgroundX1<-9000 && Var.backgroundX1 >-9200) {//Lücke 6
					Var.bodenhöhe=1200;
				}
				if(Var.backgroundX1<-9200 && Var.backgroundX1 >-11000) {
					Var.bodenhöhe=600;
				}
				if(Var.backgroundX1<-11000) {//Lücke am Ende
					Var.bodenhöhe=1200;
				}
				
				
			}
					
		}, 0, 10);//Zeit, nach der sich der Timer wiederholt
	}

}
