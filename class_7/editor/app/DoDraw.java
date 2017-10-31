package editor.app;

import pt.tecnico.po.ui.Command;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

import editor.core.Form;
import editor.core.Editor;

/**
 * Command for drawing all forms held by the editor.
 *
 * @author Programação com Objectos
 * @version 3.1
 */
public class DoDraw extends Command<Editor> {
	/**
	 * Constructor.
	 *
	 * @param editor the target editor.
	 */
	public DoDraw(Editor editor) {
		super(Label.DRAW_ALL, editor, new CommandValidity(editor));
	}

	/**
	 * Execute the command.
	 */
	@Override
	@SuppressWarnings("nls")
	public final void execute() {
		Form form;
		int i;

		Collection<Form> forms = _receiver.getForms();
		int length = _receiver.length();

		Iterator<Form> iter = forms.iterator();
		
		while (iter.hasNext()) {
			form = iter.next();
			_display.addLine(form.draw());
		}

		_display.display();

		return;
	}
}