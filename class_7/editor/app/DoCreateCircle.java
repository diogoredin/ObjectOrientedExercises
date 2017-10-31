package editor.app;

import pt.tecnico.po.ui.Command;
import pt.tecnico.po.ui.Input;

import editor.core.Editor;
import editor.core.Circle;

/**
 * Command for creating a circle.
 *
 * @author Grupo 22
 * @version 1.0
 */
public class DoCreateCircle extends Command<Editor> {


	/**
	 * Constructor.
	 *
	 * @param editor the target editor.
	 */
	public DoCreateCircle(Editor editor) {
		super(Label.CREATE_CIRCLE, editor);
	}

	/**
	 * Execute the command.
	 */
	@Override
	@SuppressWarnings("nls")
	public final void execute() {

		Input<Integer> x = _form.addIntegerInput("Insert the center's x coordinate: ");
		Input<Integer> y = _form.addIntegerInput("Insert the center's y coordinate: ");
		Input<Integer> radius = _form.addIntegerInput("Insert the radius: ");
		_form.parse();

		Circle circle = new Circle (_receiver, x.value(), y.value(), radius.value());
		_display.addLine(circle.draw());
		_display.display();

		_form.clear();

		return;
	}
}