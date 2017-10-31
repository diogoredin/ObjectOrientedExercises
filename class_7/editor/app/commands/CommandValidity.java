package editor.app.commands;

import pt.tecnico.po.ui.ValidityPredicate;
import editor.core.Editor;

/**
 * Class that verifies if a command may appear in the main menu. 
 */

public class CommandValidity extends ValidityPredicate<Editor> {

	/**
	 * Constructor.
	 *
	 * @param editor the target editor which will be used to check the command visibility.
	 */
	public CommandValidity (Editor editor) {
		super(editor);
	}

	/**
	 * Checks whether or not a command is visible and valid.
	 *
	 * @return if the command is visible, returns true, else returns false.
	 */
	public boolean isValid() {
		return _receiver.length() > 0;
	}
}