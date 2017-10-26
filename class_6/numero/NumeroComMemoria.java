package numero;
import numero.Numero;

/**
 * Class which extends the standard Numero Class. Can revert previous set changes since it
 * stores the last set number in memory. The previous number can also be retrieved.
 *
 * @author Grupo 22
 * @version 1.0
 * @see <a href="https://fenix.tecnico.ulisboa.pt/disciplinas/PO171795/2017-2018/1-semestre/aula-pratica-3">Exercise Paper</a>
 *
 */

public class NumeroComMemoria extends Numero {

    private int _prev;

    /**
     * Constructor, creates a number with memory with value val, and sets the previous value to val.
     *
     * @param val value of new number.
     */
    public NumeroComMemoria( int val ) {
        set(val);
    }

    /**
     * Sets the number's value to val, and leaves the number's previous value in memory.
     * The previous number stored in memory is lost.
     * 
     * @param val new value to be set.
     */
    public void set( int val ) {
        _prev = get();
        super.set(val);
    }

    /**
     * Returns the previous number stored in memory.
     *
     * @return previous number stored in memory.
     */
    public int getPrev() {
        return _prev;
    }

    /**
     * Reverts the previous change to the number, and stores its current value in memory.
     * This can be reverted if the method is called again.
     */
    public void undo() {
        set( getPrev() );
    }

}