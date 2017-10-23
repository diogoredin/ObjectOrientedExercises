package number;
import number.Numero;


class NumeroComMemoria extends Numero {

    private int _prev;

    public NumeroComMemoria ( int val ) {
        set(val);
    }

    public void set ( int val ) {
        _prev = get();
        super.set(val);
    }

    public int getPrev () {
        return _prev;
    }

    public void undo () {
        set( getPrev() );
    }

}