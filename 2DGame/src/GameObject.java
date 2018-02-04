import java.util.ArrayList;

abstract class GameObject {
	abstract public ArrayList<GameObject> update(boolean[] keys);

	boolean delete = false;
	public int type = 1;
	public double x = 0, y = 0;
}
