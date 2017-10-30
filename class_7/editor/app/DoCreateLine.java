package editor.app;

import pt.tecnico.po.ui.Command;
import pt.tecnico.po.ui.Display;

import editor.core.Editor;
import editor.core.Form;

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
        
    }
}