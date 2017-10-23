package number;
import number.Numero;

/**
 * Class which extends the standart Numero Class. Can revert previous set changes since it
 * stores its last set number in memory. Its previous number can also be gotten.
 *
 * @author Grupo 22
 */

class NumeroComMemoria extends Numero {

    private int _prev;

    /**
     * Creates a number with memory with value val, and sets the previous value to val.
     *
     * @param val value of new number.
     */

    public NumeroComMemoria ( int val ) {
        set(val);
    }

    /**
     * Sets the number's value to val, and leaves the number's previous value in memory.
     * <p>
     * The previous number stored in memory is lost.
     * 
     * @param val new value to be set.
     */

    public void set ( int val ) {
        _prev = get();
        super.set(val);
    }

    /**
     * Gets the previous number stored in memory.
     *
     * @return the previous number's value.
     */

    public int getPrev () {
        return _prev;
    }

    /**
     * Reverts the previous change to the number, and stores its current value in memory.
     * <p>
     * This can be reverted if the method is called again.
     */

    public void undo () {
        set( getPrev() );
    }

}