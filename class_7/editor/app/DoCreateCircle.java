package editor.app;

import pt.tecnico.po.ui.Command;
import pt.tecnico.po.ui.Display;

import editor.core.Editor;
import editor.core.Form;

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
    }
}