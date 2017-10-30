package editor.app;

import pt.tecnico.po.ui.Command;
import pt.tecnico.po.ui.Display;

import editor.core.Editor;

/**
 * Command for showing the number of forms of the graphical editor.
 *
 * @author PO
 * @version 3.1
 */
public class DoShowTotal extends Command<Editor> {
    /**
     * Constructor.
     *
     * @param editor the target editor.
     */
    public DoShowTotal(Editor editor) {
        super(Label.SHOW_NUMBER_FORMS, editor);
    }

    /**
     * Execute the command.
     */
    @Override
    @SuppressWarnings("nls")
    public final void execute() {
        // add code here
    }
}