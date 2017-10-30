package editor.core;

/**
 * Class representing a line. A line is represented by two point. The first point
 * is represented by the origin of a form.
 * 
 * @author Programação com Objectos
 * @version 3.1
 */

public class Line extends Form {
  /**
   * The end of the line.
   */
  private Point _end;

  /**
   * Creates a line that does not belong to any editor.
   * 
   * @param x1 origin's x coordinate.
   * @param y1 origin's y coordinate.
   * @param x2 end's x coordinate.
   * @param y2 end's y coordinate.
   */
  public Line(int x1, int y1, int x2, int y2) {
    super(x1, y1);
    _end = new Point(x2, y2);
  }

  /**
   * Builds a line that is part of an editor.
   *
   * @param edt the editor to contain the new line
   * @param x1 origin's x coordinate.
   * @param y1 origin's y coordinate.
   * @param x2 end's x coordinate.
   * @param y2 end's y coordinate.
   */
  public Line(Editor edt, int x1, int y1, int x2, int y2) {
    super(edt, x1, y1);
    _end = new Point(x2, y2);
  }

  /**
   * Draw the line.
   * 
   * @see Form#draw()
   */
  @Override
  @SuppressWarnings("nls")
  public String draw() {
    return _id + " - Line: [" + _origin + "," + _end + "]\n";
  }
  
  /**
   * Move line by vector (x, y).
   * 
   * @param x shift along x axis.
   * @param y shift along y axis.
   *  @see editor.core.Form#move()
   */
  @Override
  public void move(int x, int y) {
    super.move(x, y);
    _end.move(x, y);
  }
}
