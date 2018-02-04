import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class Character extends GameObject {

	public Character() {
		this.type = 1;
	}

	public ArrayList<GameObject> update(boolean[] keys) {
		double yold = y;
		double xold = x;
		ArrayList<GameObject> returnObjects = new ArrayList<GameObject>();
		int speed = 3;
		if(keys[KeyEvent.VK_SHIFT]) {
			speed = 5;
		} else {
			speed = 3;
		}
		if (keys[KeyEvent.VK_S]) {
			if(y < 1060) {
				y += speed;
			}
		}
		if (keys[KeyEvent.VK_W]) {
			if(y > 20) {
				y -= speed;
			}
		}
		if (keys[KeyEvent.VK_D]) {
			if(x < 1900) {
				x += speed;
			}
		}
		if (keys[KeyEvent.VK_A]) {
			if(x > 20) {
				x -= speed;
			}
		}
		if (keys[KeyEvent.VK_UP]) {
			returnObjects.add(new Projectile(this.x, this.y, (x - xold), (y - yold) - 5));
		}
		if (keys[KeyEvent.VK_DOWN]) {
			returnObjects.add(new Projectile(this.x, this.y, (x - xold), (y - yold) + 5));
		}
		if (keys[KeyEvent.VK_RIGHT]) {
			returnObjects.add(new Projectile(this.x, this.y, (x - xold) + 5, (y - yold)));
		}
		if (keys[KeyEvent.VK_LEFT]) {
			returnObjects.add(new Projectile(this.x, this.y, (x - xold) - 5, (y - yold)));
		}
		return returnObjects;
	}

}
