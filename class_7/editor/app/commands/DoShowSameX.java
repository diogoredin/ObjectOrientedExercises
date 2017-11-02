package editor.app.commands;

import java.util.*;

import pt.tecnico.po.ui.Command;
import pt.tecnico.po.ui.Input;

import editor.core.Form;
import editor.core.Editor;

/**
 * Command for showing the number of forms of the graphical editor.
 *
 * @author PO
 * @version 3.1
 */
public class DoShowSameX extends Command<Editor> {

	/**
	 * Constructor.
	 *
	 * @param editor the target editor.
	 */
	public DoShowSameX(Editor editor) {
		super(Label.SHOW_SAME_X, editor);
	}

	/**
	 * Execute the command.
	 */
	@Override
	@SuppressWarnings("nls")
	public final void execute() {

		/* Temporary list to hold our values */
		List<Form> forms = new ArrayList<Form>();

		/* Gets user X-axis value to search for */
		Input<Integer> x = _form.addIntegerInput("Insert the x coordinate: ");
		_form.parse();

		/* Goes through all forms on our editor and saves those that have the same X-axis value */
		for (Form form : _receiver.getForms() ) {
			if ( x.value() == form.getOrigin().getX() ) {
				forms.add(form);
			}
		}

		/* Sorts the list based on the Y-axis value */
		Collections.sort( forms );

		/* Finally draws the forms */
		for (Form form : forms ) {
			_display.addLine(form.draw());
		}

		_display.display();
		_form.clear();
		
		return;
	}

}