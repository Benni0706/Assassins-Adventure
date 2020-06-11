package pack1;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class Var { //versch. Variablen werden initialisiert
	static JFrame jf1;
	static int screenwidth = 1920, screenheight = 1080;//Format des Spielefensters
	static int backgroundX1 =0;//Position der Hintergründe
	static int plattformX1 = 0, plattformX2 = 1910, plattformX3 = 3820;//Positionen der Plattformen
	static int x = 930, y = 0; //Position des Spielers
	static boolean moveup = false, movedown = false, moveleft = false, moveright = false;//bewegt sich der Spieler gerade?
	static Label lbl1; //Label wird erstellt
	static int speed = 1;//Geschwindigkeit des Spielers
	static int fallspeed=0;//Grund-"Schwerkraft"
	static boolean steht = true; //steht der Spieler auf etwas?
	static int b = 2,c=1; //nebensächliche Variablen zum Wechsel versch. Spieleranimationen
	static int bodenhöhe = 1200;//Aktuelle Höhe des Bodens, ändert sich, je nachdem wo sich der Spieler befindet
	static int ybew=600;//Ort des Feuerballs
	static int win=0;//Hat der Spieler es geschafft?
	static int z=1;//Variable für die Feuerwerks-Animation
	static int u=1;//Variable für die Animation des Feuermonsters

	//Initialisierung der Bilder-Variablen
	static BufferedImage ib1, ib2, ib3, ib4, ib5, ib6;
	static BufferedImage spielersteht,spielerleft1,spielerleft2,spielerleft3,spielerright1,spielerright2,spielerright3;
	static BufferedImage pl1,pl2,pl3,pl4,pl5,pl6,pl7,pl8,pl9,pl10,pl11,pl12;
	static BufferedImage po1,st1,st2,fe1,fe2,fw1,fw2,fw3,fw4,sb1;

	public Var() {//Bilder werden eingelesen

		try {
			// Die Hintergründe
			ib1 = ImageIO.read(new File("rsc/Hintergrund.jpg"));
			//Die Spielervarianten
			spielersteht = ImageIO.read(new File("rsc/Spielersteht.png"));
			spielerleft1 = ImageIO.read(new File("rsc/run-to-left1.png"));
			spielerleft2 = ImageIO.read(new File("rsc/run-to-left2.png"));
			spielerright1 = ImageIO.read(new File("rsc/run-to-right-1.png"));
			spielerright2 = ImageIO.read(new File("rsc/run-to-right-2.png"));
			//Die Plattformen
			pl1= ImageIO.read(new File("rsc/Balken.png"));
			//Specials
			po1=ImageIO.read(new File("rsc/Portal.png"));
			st1=ImageIO.read(new File("rsc/Stacheln.png"));
			fe1=ImageIO.read(new File("rsc/Feuerball.png"));
			fe2=ImageIO.read(new File("rsc/Feuerball2.png"));
			fw1=ImageIO.read(new File("rsc/Feuerwerk.png"));
			fw2=ImageIO.read(new File("rsc/Feuerwerk2.png"));
			fw3=ImageIO.read(new File("rsc/Feuerwerk3.png"));
			fw4=ImageIO.read(new File("rsc/Feuerwerk4.png"));

		} catch (IOException r) {
			r.printStackTrace();
			System.out.println("Bilder konnten nicht geladen werden");

		}
	}

}
