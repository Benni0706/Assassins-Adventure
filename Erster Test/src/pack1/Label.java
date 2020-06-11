package pack1;

import java.awt.Graphics;

import javax.swing.JLabel;

public class Label extends JLabel { // Hier werden die Bilder an die richtigen Positionen gesetzt
	private static final long serialVersionUID = 1L;

	protected void paintComponent(Graphics g) {//Vorraussetzung für das "Zeichnen"
		super.paintComponent(g);
		
		
		//Hintergrund
		g.drawImage(Var.ib1, Var.backgroundX1, 0, 1920, 1080, null);
		g.drawImage(Var.ib1, Var.backgroundX1+1910, 0, 1920, 1080, null);
		g.drawImage(Var.ib1, Var.backgroundX1+3820, 0, 1920, 1080, null);
		g.drawImage(Var.ib1, Var.backgroundX1+5730, 0, 1920, 1080, null);
		g.drawImage(Var.ib1, Var.backgroundX1+7640, 0, 1920, 1080, null);
		g.drawImage(Var.ib1, Var.backgroundX1+9550, 0, 1920, 1080, null);
		g.drawImage(Var.ib1, Var.backgroundX1+11460, 0, 1920, 1080, null);
		
		//Plattformen
		g.drawImage(Var.pl1, Var.backgroundX1, 760, 2460, 40, null);
		g.drawImage(Var.pl1, Var.backgroundX1+2490, 610, 980, 40, null);
		g.drawImage(Var.pl1, Var.backgroundX1+3490, 450, 480, 40, null);
		g.drawImage(Var.pl1, Var.backgroundX1+3990, 700, 480, 40, null);
		//Lücke 1
		g.drawImage(Var.pl1, Var.backgroundX1+4740, 700, 230, 40, null);
		//Lücke 2
		g.drawImage(Var.pl1, Var.backgroundX1+5290, 700, 680, 40, null);
		//Lücke 3
		g.drawImage(Var.pl1, Var.backgroundX1+6090, 580, 880, 40, null);
		//Lücke 4
		g.drawImage(Var.pl1, Var.backgroundX1+7590, 680, 1380, 40, null);
		g.drawImage(Var.pl1, Var.backgroundX1+8990, 500, 480, 40, null);
		//Lücke 5
		g.drawImage(Var.pl1, Var.backgroundX1+9690, 680, 280, 40, null);
		//Lücke 6
		g.drawImage(Var.pl1, Var.backgroundX1+10190, 680, 1780, 40, null);
		//Lücke 7
		
		
		//Spielerfigur
		if(Var.moveleft==true || Var.moveright==true) {//Aufgrund der Variable b wird entschieden, welche Animation gezeigt wird um ein Laufen zu simulieren
			if(Var.moveleft==true) {//bewegt sich nach links
				if(Var.b==1) {
					g.drawImage(Var.spielerleft1, Var.x, Var.y, 100, 100, null);
				}
				if(Var.b==2) {
					g.drawImage(Var.spielerleft2, Var.x, Var.y, 100, 100, null);
				}
			}else{//bewegt sich nach rechts
				if(Var.b==1) {
					g.drawImage(Var.spielerright1, Var.x, Var.y, 100, 100, null);
				}
				if(Var.b==2) {
					g.drawImage(Var.spielerright2, Var.x, Var.y, 100, 100, null);
				}
			}
		}else {//bewegt sich nicht
			g.drawImage(Var.spielersteht, Var.x, Var.y, 100, 100, null);
		}
		
		//Specials
		g.drawImage(Var.po1, Var.backgroundX1+6200, 300, 100, 100, null);
		g.drawImage(Var.st1, Var.backgroundX1+7900, 650, 240, 50, null);
		g.drawImage(Var.st1, Var.backgroundX1+8000, 650, 240, 50, null);
		g.drawImage(Var.st1, Var.backgroundX1+8300, 650, 240, 50, null);
		g.drawImage(Var.st1, Var.backgroundX1+8400, 650, 240, 50, null);
		
		//Special Feuerball
		if(Var.u==1) {
			g.drawImage(Var.fe1, Var.backgroundX1+9775, Var.ybew, 100, 100, null);
		}else {
			g.drawImage(Var.fe2, Var.backgroundX1+9775, Var.ybew, 100, 100, null);
		}
		
		//Special Feuerwerk
		if(Var.win==1) {
			if(Var.z==1) {
				g.drawImage(Var.fw1, Var.backgroundX1+11000, 200, 400, 400, null);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
					}
			}
			if(Var.z==2) {
				g.drawImage(Var.fw2, Var.backgroundX1+11000, 200, 400, 400, null);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
					}
			}
			if(Var.z==3) {
				g.drawImage(Var.fw3, Var.backgroundX1+11000, 200, 400, 400, null);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
					}
			}
			if(Var.z==4) {
				g.drawImage(Var.fw4, Var.backgroundX1+11000, 200, 400, 400, null);
			}
			
		}
		
		

		repaint();
	}

}
