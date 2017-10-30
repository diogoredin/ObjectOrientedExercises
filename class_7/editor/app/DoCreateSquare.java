package editor.app;

import pt.tecnico.po.ui.Command;
import pt.tecnico.po.ui.Display;

import editor.core.Editor;
import editor.core.Form;

/**
 * Command for drawing all forms held by the editor.
 *
 * @author Programação com Objectos
 * @version 3.1
 */
public class DoCreateSquare extends Command<Editor> {
    /**
     * Constructor.
     *
     * @param editor the target editor.
     */
    public DoCreateSquare(Editor editor) {
        super("Square", editor);
    }

    /**
     * Execute the command.
     */
    @Override
    @SuppressWarnings("nls")
    public final void execute() {
        
        Square sq = new Square(4, 5, 20);
        _editor.addForm(sq);
        _display.add(sq.draw());
        _display.Display();

    }
}