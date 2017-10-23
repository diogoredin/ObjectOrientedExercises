package editor;
import java.util.*;
import editor.core.*;

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
     * Give each form an unique identifier.
     */
     private Map<Integer,Form> forms = new HashMap<>();

    /**
     * Add a form.
     * 
     * @param the form to add.
     * 
     * @return the added form's id.
     */
    public final int addForm(Form f) {
        int id = ++_nextId;
        forms.put(id, f);
        return id;
    }

    /**
     * Remove a given form (by id).
     * 
     * @param id the identifier of the form to be removed.
     */
    public void removeForm(int id) {
	    forms.remove(id);
    }

    /**
     * Get a given form (by id).
     * 
     * @param id the identifier of the form to be returned.
     */
    public Form getForm(int id) {
        return forms.get(id);
    }

    /**
     * Draws all forms on the editor.
     * 
     */
    public String getForms() {
        String total = "";

        for ( Form form : forms.values() ) {
            total = "" + total + form.draw();
        }

        return total;
    }

}
