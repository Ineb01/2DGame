
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
		if(x<5 || x>1915) {
			xVel = - xVel;
		}
		if(y<5 || y>1075) {
			yVel = - yVel;
		}
		this.x += this.xVel;
		this.y += this.yVel;
		return null;
	}
}
