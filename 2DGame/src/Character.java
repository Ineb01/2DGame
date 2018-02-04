import java.awt.event.KeyEvent;

public class Character extends GameObject{

	public Character() {
		this.type = 1;
	}
	
	public GameObject update(boolean[] keys) {
		
		if(keys[KeyEvent.VK_S]) {
			y += 3;
		}
		if(keys[KeyEvent.VK_W]) {
			y -= 3;
		}
		if(keys[KeyEvent.VK_D]) {
			x += 3;
		}
		if(keys[KeyEvent.VK_A]) {
			x -= 3;
		}
		if(keys[KeyEvent.VK_UP]) {
			return new Projectile(this.x, this.y, 0, -1);
		}
		if(keys[KeyEvent.VK_DOWN]) {
			return new Projectile(this.x, this.y, 0, 1);
		}
		if(keys[KeyEvent.VK_RIGHT]) {
			return new Projectile(this.x, this.y, 1, 0);
		}
		if(keys[KeyEvent.VK_LEFT]) {
			return new Projectile(this.x, this.y, -1, 0);
		}
		return null;
	}

}
