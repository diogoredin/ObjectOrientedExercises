package editor.app;

import pt.tecnico.po.ui.Command;
import pt.tecnico.po.ui.Display;

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
        
    }
}