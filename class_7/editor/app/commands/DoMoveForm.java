package editor.app.commands;

import pt.tecnico.po.ui.Command;
import pt.tecnico.po.ui.Input;

import editor.core.Editor;
import editor.core.Form;

/**
 * Command for moving a form.
 *
 * @author Grupo 22
 * @version 1.0
 */
public class DoMoveForm extends Command<Editor> {
	/**
	 * Constructor.
	 *
	 * @param editor the target editor.
	 */
	public DoMoveForm(Editor editor) {
		super(Label.MOVE_FORM, editor, new CommandValidity(editor));
	}

	/**
	 * Execute the command.
	 */
	@Override
	@SuppressWarnings("nls")
	public final void execute() {
		Input<Integer> identifier = _form.addIntegerInput("Insert the id of the form you wish to move: ");
		_form.parse();
		int id = identifier.value();
		_form.clear();

		Form form;

		if ((form = _receiver.getForm(id)) != null) {
			Input<Integer> x = _form.addIntegerInput("Insert movement in the x coordinate: ");
			Input<Integer> y = _form.addIntegerInput("Insert movement in the y coordinate: ");
			_form.parse();
			_receiver.move(id, x.value(), y.value());
			_display.addLine("Form moved successfully.");
			_display.addLine(form.draw());
		} else {
			_display.addLine("Selected form does not exist.");
		}

		_display.display();
		_form.clear();

		return;

	}
}