import java.util.ArrayList;

public class Projectile extends GameObject{
	double xVel, yVel;
	int bounces=0;
	public Projectile(double x, double y, double xVel, double yVel) {
		this.xVel = xVel;
		this.yVel = yVel;
		this.x = x;
		this.y = y;
		this.type = 2;
	}
	@Override
	public ArrayList<GameObject> update(boolean[] keys) {
		if(x<5 || x>1915) {
			xVel = - xVel;
			bounces++;
		}
		if(y<5 || y>1075) {
			yVel = - yVel;
			bounces++;
		}
		if(bounces > 10) {
			this.delete = true;
		}
		this.x += this.xVel;
		this.y += this.yVel;
		return new ArrayList<GameObject>();
	}
}
