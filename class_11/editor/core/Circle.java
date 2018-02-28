package editor.core;

/**
 * Class representing a circle. In the case of a circle, the origin of a circle represents the center of the circle.
 * 
 * @author Programação com Objectos
 * @version 3.1
 */

public class Circle extends Form {
  /** Radius of the circle. */
  private int _radius;
  
  /**
   * Creates a circle that does not belong to any editor.
   *
   * @param x circle center's x coordinate.
   * @param y circle center's y coordinate.
   * @param radius the circle radius.
   */
  public Circle(int x, int y, int radius) {
    super(x, y);
    _radius = radius;
  }
  
  /**
   * Constructor.
   * 
   * @param x circle center's x coordinate.
   * @param y circle center's y coordinate.
   * @param radius the circle radius.
   */
  public Circle(Editor edt, int x, int y, int radius) {
    super(edt, x, y);
    _radius = radius;
  }
  
  /**
   * Draw the circle.
   * 
   * @see editor.core.Form#draw()
   */
  @Override
  @SuppressWarnings("nls")
  public String draw() {
    return _id + " - Circle: [" + _origin + "," + _radius + "]\n";
  }
}
