package editor.core;

/**
 * Class representing a point.
 * 
 * @author Programação com Objectos
 * @version 3.1
 */
public class Point {
    /** The point's x coordinate. */
    private int _x;

    /** The point's y coordinate. */
    private int _y;

    /**
     * Constructor.
     * 
     * @param x the point's x coordinate.
     * @param y the point's y coordinate.
     */
    public Point(int x, int y) {
	_x = x;
	_y = y;
    }

    /**
     * Move point by vector (x, y).
     * 
     * @param x shift along x axis.
     * @param y shift along y axis.
     */
    public void move(int x, int y) {
	_x += x;
	_y += y;
    }

    /**
     * @return this point's x coordinate.
     */
    public final int getX() {
	return _x;
    }

    /**
     * @return this point's y coordinate.
     */
    public final int getY() {
	return _y;
    }

    /**
     * Compares this Point with another one.
     *
     * @return true if both points has the same x and y coordinates, false otherwise.
     */
    public final boolean equals(Point p) {
	return this._x == p._x && this._y == p._y;
    }

    /**
     * @return a string presenting the point's coordinates.
     * @see java.lang.Object#toString()
     */
    @Override
    @SuppressWarnings("nls")
    public String toString() {
	return "(" + _x + "," + _y + ")";
    }
}
