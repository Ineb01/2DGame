import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.MouseInfo;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePlane extends JPanel implements ActionListener {

	Timer t = new Timer(5, this);
	ArrayList<GameObject> allObjects = new ArrayList<GameObject>();

	public GamePlane() {
		super();
		allObjects.add(new Keyboard());
		allObjects.add(new Character());
		allObjects.add(new Projectile(0,0,1,1));
		this.setBackground(Color.WHITE);
		t.start();
		this.addKeyListener((KeyListener) allObjects.get(0));
		this.setFocusable(true);
		this.setFocusTraversalKeysEnabled(false);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (GameObject gameObject : allObjects) {
			if (gameObject.type == 1) {
				((Graphics2D) g).fill(new Ellipse2D.Double(gameObject.x-20, gameObject.y-20, 40, 40));
			} else if (gameObject.type == 2) {
				((Graphics2D) g).fill(new Ellipse2D.Double(gameObject.x-5, gameObject.y-5, 10, 10));
			}
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		for (int i = allObjects.size()-1;i>=0;i--) {
			GameObject temp = allObjects.get(i).update(((Keyboard) allObjects.get(0)).keys);
			if(temp != null) {
				allObjects.add(temp);
			}
		}
		repaint();
		
	}

}
