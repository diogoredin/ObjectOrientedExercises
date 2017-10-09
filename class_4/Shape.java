public abstract class Shape extends Object {

	/* Attributes */

	private int _id;
	private int _origin;

	/* Methods */

	abstract void Shape();

	abstract void Draw();

	abstract void getName() {

	}

	abstract void setOrigin(x, y) {
		_origin = New Point(x, y);
	}

	abstract int getOrigin() {
		return _origin;
	}

	abstract void Move(x, y) {

		Point point;
		int translatedX;
		int translatedY;

		translatedX = getOrigin().getX() + x;
		translatedY = getOrigin().getY() + y;

		setOrigin(translatedX, translatedY);
	}

}

public class Circle extends Shape {

	public Draw(boolean ent1, boolean ent2) {

		return "" + ;
	}

}

public class Line extends Shape {

	public Move(int x, int y) {
	}

	public Draw(boolean ent1, boolean ent2) {

		return "" + ;
	}

}

public class Square extends Shape {

	public Draw(boolean ent1, boolean ent2) {

		return "" + ;
	}

}

public class Point extends Shape {

	/* Attributes */

	private int _x;
	private int _y;

	/* Methods */

    public Point(x,y) {
		setX(x);
		setY(y);
	}

	public int setX() {
		_x = x;
	}

	 public int setY() {
		_y = y;
	}

	public int getX() {
		return _x;
	}

	 public int getY() {
		return _y;
	}

}