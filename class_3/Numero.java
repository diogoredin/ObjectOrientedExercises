class Numero extends Object {

    private int _value;
    public Numero() { _value = 0; }
    public Numero( int val ) { set(val); }
    public int get() { return _value; }
    public void set( int val ) { _value = val; }
    public String toString() { return "" + _value + " " + super.toString(); } /* Gets reference of the parent class */
    public boolean equals( Object other ) {
        if ( other instanceof Numero == false ) return false; /* allows sub-class */
        return ( this._value == ((Numero) other).get() );
    }

    public static void main(String[] args) {
        NumeroWithMemory number = new NumeroWithMemory(5);
        number.set(10);
        System.out.println( number.toString() );
        number.undo();
        System.out.println( number.toString() );
        number.set(20);
        System.out.println( number.toString() );
        number.undo();
        System.out.println( number.toString() );
    }

}

class NumeroWithMemory extends Numero {

    private int _prev;

    public NumeroWithMemory( int val ) {
        set(val);
    }

    public void set( int val ) {
        _prev = get();
        super.set(val);
    }

    public int getPrev() {
        return _prev;
    }

    public void undo() {
        set( getPrev() );
    }

}