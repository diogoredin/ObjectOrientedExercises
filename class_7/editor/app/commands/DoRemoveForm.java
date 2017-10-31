package editor.app.commands;

import pt.tecnico.po.ui.Command;
import pt.tecnico.po.ui.Input;

import editor.core.Editor;

/**
 * Command for removing a form from the editor.
 *
 * @author Grupo 22
 * @version 1.0
 */
public class DoRemoveForm extends Command<Editor> {
	/**
	 * Constructor.
	 *
	 * @param editor the target editor.
	 */
	public DoRemoveForm(Editor editor) {
		super(Label.REMOVE_FORM, editor, new CommandValidity(editor));
	}

	/**
	 * Execute the command.
	 */
	@Override
	@SuppressWarnings("nls")
	public final void execute() {

		Input<Integer> identifier = _form.addIntegerInput("Insert the identifier of the form you wish to remove: ");
		_form.parse();
		int id = identifier.value();

		if (_receiver.remove(id)) {
			_display.addLine("The form was removed successfully.");
		} else {
			_display.addLine("The form you wish to remove does not exist.");
		}
		_display.display();
		_form.clear();

		return;
	}
}