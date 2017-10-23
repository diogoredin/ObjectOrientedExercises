
/**
 * Form editor: allows the creation and manipulation of graphical forms such as
 * squares, circles, and lines. Forms can be created, moved, and deleted.
 * 
 * @author Programação com Objectos
 * @version 3.1
 */

public class Editor {

    /**
     * Give each form an unique identifier.
     */
    private int _nextId;

    /**
     * Add a form.
     * 
     * @param the form to add.
     * 
     * @return the added form's id.
     */
    public final int addForm(Form f) {
	int id = ++_nextId;
        // it is not ccompleted yet
	return id;
    }

    /**
     * Remove a given form (by id).
     * 
     * @param id the identifier of the form to be removed.
     */
    public void remove(int id) {
	// not implemented yet
    }
}
