public class Editor extends Object {
	private int _shapes;
}

public abstract class Shape extends Editor {

	/* Attributes */

	private int _id;
	private int _origin;
	private int _name;

	/* Methods */

	abstract void Shape();
	abstract void Draw();

	abstract void getName() {
		return _name;
	}

	abstract void setOrigin(x, y) {
		_origin = New Point(x, y);
	}

	abstract int getOrigin() {
		return _origin;
	}

	abstract void Move(x, y) {
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

	private int _end;

	abstract void setEnd(x, y) {
		_end = New Point(x, y);
	}

	abstract int getEnd() {
		return _end;
	}

	public Move(int x, int y) {
		super.Move(x, y);
		setEnd(getEnd().getX() + x, getEnd().getY() + y);
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