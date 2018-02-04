
public class Projectile extends GameObject{
	double xVel, yVel;
	public Projectile(double x, double y, double xVel, double yVel) {
		this.xVel = xVel;
		this.yVel = yVel;
		this.x = x;
		this.y = y;
		this.type = 2;
	}
	@Override
	public GameObject update(boolean[] keys) {
		this.x += this.xVel;
		this.y += this.yVel;
		return null;
	}
}
