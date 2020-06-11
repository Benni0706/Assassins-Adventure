package pack1;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {//Sorgt dafür, dass auch etwas passiert, wenn man Tsten drückt

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {//Die Taste wird gedrückt

		if (e.getKeyCode() == KeyEvent.VK_UP) {
			Var.moveup = true;
		}

		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			Var.movedown = true;
		}

		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			Var.moveleft = true;
		}

		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			Var.moveright = true;
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {//Die Taste wird wieder losgelassen

		if (e.getKeyCode() == KeyEvent.VK_UP) {
			Var.moveup = false;
		}
		
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			Var.movedown = false;
		}
		
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			Var.moveleft = false;
		}
		
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			Var.moveright = false;
		} 

	}

}
