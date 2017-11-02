package editor.core;
import editor.core.*;
import java.util.Comparator;

/**
 * Class representing an abstract form.
 * 
 * @author Programação com Objectos
 * @version 3.1
 */

public abstract class Form implements Comparator<Form>, Comparable<Form> {

	/** The Editor to which this Form belongs to. */
	private Editor _edt;
	
	/** The form's unique identifier. */
	protected int _id;
	
	/** The form's origin point. */
	protected Point _origin;
	
	/**
	 * Creates a form that does not belong to any editor.
	 *
	 * @param x origin's x coordinate.
	 * @param y origin's y coordinate.
	 */
	public Form(int x, int y) {
		_origin = new Point(x, y);
	}
	
	/**
	 * Builds a form that is part of an editor.
	 *
	 * @param edt the editor to contain the new line
	 * @param x origin's x coordinate.
	 * @param y origin's y coordinate.
	 */
	public Form(Editor edt, int x, int y) {
		this(x, y);
		_edt = edt;
		_id = _edt.addForm(this);
	}
	
	/**
	 * @return the form's identifier.
	 */
	public final int getId() {
		return _id;
	}
	
	/**
	 * @return the form's origin.
	 */
	public final Point getOrigin() {
		return _origin;
	}
	
	/**
	 * Method for drawing a form. Each type of form has its specific way of drawing.
	 */
	public abstract String draw();
	
	/**
	 * Move form by vector (x, y). This implementation offers a default behavior: shift the
	 * origin of this form. Other specific behaviors should be implemented by overidding this method.
	 *
	 * @param x shift along x axis.
	 * @param y shift along y axis.
	 */
	public void move(int x, int y) {
		_origin.move(x, y);
	}

	/**
	* Overriding the compareTo method. Compares two forms based on their Y-axis value.
	*
	* @param form a form to compare to.
	*/
	@Override
	public int compareTo(Form f) {
		return ( this.getOrigin().getY() - f.getOrigin().getY() );
	}

	/**
	* Overriding the compare method to sort. Compares two forms based on their Y-axis value.
	*
	* @param form a form to compare to.
	*/
	@Override
	public int compare(Form f1, Form f2) {
		return ( f1.getOrigin().getY() - f2.getOrigin().getY() );
	}

}