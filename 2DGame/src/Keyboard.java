import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class Keyboard extends GameObject implements KeyListener {

	public boolean[] keys = new boolean[120];

	public boolean up, down, left, right, interact;

	public Keyboard() {
		this.type = 0;
	}

	public ArrayList<GameObject> update(boolean[] keys) {
		return new ArrayList<GameObject>();
	}

	public void keyPressed(KeyEvent e) {
		keys[e.getKeyCode()] = true;
	}

	public void keyReleased(KeyEvent e) {
		keys[e.getKeyCode()] = false;
	}

	@Override
	public void keyTyped(KeyEvent arg0) {

	}
}