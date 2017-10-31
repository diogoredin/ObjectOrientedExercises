package editor.app.commands;

import pt.tecnico.po.ui.Command;
import pt.tecnico.po.ui.Input;

import editor.core.Editor;
import editor.core.Square;

/**
 * Command for creating a square.
 *
 * @author Grupo 22
 * @version 1.0
 */
public class DoCreateSquare extends Command<Editor> {
	/**
	 * Constructor.
	 *
	 * @param editor the target editor.
	 */
	public DoCreateSquare(Editor editor) {
		super(Label.CREATE_SQUARE, editor);
	}

	/**
	 * Execute the command.
	 */
	@Override
	@SuppressWarnings("nls")
	public final void execute() {

		Input<Integer> x = _form.addIntegerInput("Insert the origin's x coordinate: ");
		Input<Integer> y = _form.addIntegerInput("Insert the origin's y coordinate: ");
		Input<Integer> side = _form.addIntegerInput("Insert the side's length: ");
		_form.parse();

		Square square = new Square (_receiver, x.value(), y.value(), side.value());
		_display.addLine(square.draw());
		_display.display();

		_form.clear();

		return;
		
	}
}