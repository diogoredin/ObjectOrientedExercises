package editor.app;

import pt.tecnico.po.ui.ValidityPredicate;
import editor.core.Editor;

public class CommandValidity extends ValidityPredicate<Editor> {

	public CommandValidity (Editor receiver) {
		super(receiver);
	}

	public boolean isValid() {
		return _receiver.length() > 0;
	}
}