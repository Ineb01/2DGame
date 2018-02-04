import java.awt.event.KeyEvent;

public class Character extends GameObject {

	public Character() {
		this.type = 1;
	}

	public GameObject update(boolean[] keys) {
		double yold = y;
		double xold = x;
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
			return new Projectile(this.x, this.y, (x - xold), (y - yold) - 5);
		}
		if (keys[KeyEvent.VK_DOWN]) {
			return new Projectile(this.x, this.y, (x - xold), (y - yold) + 5);
		}
		if (keys[KeyEvent.VK_RIGHT]) {
			return new Projectile(this.x, this.y, (x - xold) + 5, (y - yold));
		}
		if (keys[KeyEvent.VK_LEFT]) {
			return new Projectile(this.x, this.y, (x - xold) - 5, (y - yold));
		}
		return null;
	}

}
