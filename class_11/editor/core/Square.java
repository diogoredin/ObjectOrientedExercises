package editor.core;

/**
 * Class representing a square.
 * 
 * @author Programação com Objectos
 * @version 3.1
 */

public class Square extends Form {
  /** Length of the side of the square. */
  private int _side;
  
  /**
   * Creates a line that does not belong to any editor.
   *
   * @param x lower-left corner x coordinate.
   * @param y lower-left corner y coordinate.
   * @param side length of the side of the square.
   */
  public Square(int x, int y, int side) {
    super(x, y); 
    _side = side;
  }
  
  /**
   * Creates  a square that is part of an editor.
   * 
   * @param edt the editor to contain the new square
   * @param x lower-left corner x coordinate.
   * @param y lower-left corner y coordinate.
   * @param side length of the side of the square.
   */
  public Square(Editor edt, int x, int y, int side) {
    super(edt, x, y);
    _side = side;
  }
  
  /**
   * Draw the square.
   * 
   * @see Form#draw()
   */
  @Override
  @SuppressWarnings("nls")
  public String draw() {
    return _id + " - Square: [" + _origin+"," + _side + "]\n";
  }
}
