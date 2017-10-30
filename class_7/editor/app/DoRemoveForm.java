package editor.app;

import pt.tecnico.po.ui.Command;
import pt.tecnico.po.ui.Display;

import editor.core.Editor;
import editor.core.Form;

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
        super(Label.REMOVE_FORM, editor);
    }

    /**
     * Execute the command.
     */
    @Override
    @SuppressWarnings("nls")
    public final void execute() {
        
    }
}