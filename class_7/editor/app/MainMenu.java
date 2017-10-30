package editor.app;

import editor.core.Editor;
import pt.tecnico.po.ui.Command;
import pt.tecnico.po.ui.Menu;

/**
 * Forms editor application: allows the creation and manipulation of
 * graphical forms such as squares, circles, and lines.
 * Forms can be created, moved, and deleted. The options for draw the forms,
 * moving and removing a form are only visible if the editor has at least one
 * form.
 *
 * @author Programação com Objectos
 * @version 3.1
 */
public class MainMenu extends Menu {
	
	/**
	 * Constructor
	 */
	public MainMenu(Editor edt) {
		super(Label.TITLE, new Command<?>[] {
			// new DoCreateSquare(edt),
			// new DoCreateCircle(edt),
			// new DoCreateLine(edt),
			// new DoMove(edt),
			// new DoRemove(edt),
			new DoDraw(edt),
			new DoShowTotal(edt),
		});
	}
}