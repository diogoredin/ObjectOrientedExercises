public class Numero extends Object {

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

}