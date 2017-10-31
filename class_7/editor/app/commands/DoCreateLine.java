package editor.app.commands;

import pt.tecnico.po.ui.Command;
import pt.tecnico.po.ui.Input;

import editor.core.Editor;
import editor.core.Line;

/**
 * Command for creating a square.
 *
 * @author Grupo 22
 * @version 1.0
 */
public class DoCreateLine extends Command<Editor> {
	/**
	 * Constructor.
	 *
	 * @param editor the target editor.
	 */
	public DoCreateLine(Editor editor) {
		super(Label.CREATE_LINE, editor);
	}

	/**
	 * Execute the command.
	 */
	@Override
	@SuppressWarnings("nls")
	public final void execute() {
		Input<Integer> origx = _form.addIntegerInput("Insert the origin's x coordinate: ");
		Input<Integer> origy = _form.addIntegerInput("Insert the origin's y coordinate: ");
		Input<Integer> endx = _form.addIntegerInput("Insert the end's x coordinate: ");
		Input<Integer> endy = _form.addIntegerInput("Insert the end's y coordinate: ");
		_form.parse();

		Line line = new Line(_receiver, origx.value(), origy.value(), endx.value(), endy.value());
		_display.addLine(line.draw());
		_display.display();

		_form.clear();

		return;		
	}
}