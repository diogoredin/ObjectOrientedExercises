package number;

/**
 * Standart Numero Class. Stores an int number, which can be set or gotten,
 * and can be compared with other Numeros.
 * 
 * @author Grupo 22
 */

class Numero extends Object {

	/**
	 * Numero's value.
	 */
	private int _value;

	/**
	 * Creates a default Numero with value set to 0.
	 */

	public Numero() {
		_value = 0; 
	}

	/**
	 * Creates a Numero with value set to val.
	 *
	 * @param val value of created Numero.
	 */

	public Numero( int val ) {
		set(val);
	}

	/**
	 * Returns Numero's value.
	 *
	 * @return Numero's value.
	 */
	public int get() {
		return _value; 
	}

	/**
	 * Sets Numero's value.
	 *
	 * @param val new value for Numero.
	 */

	public void set( int val ) {
		_value = val;
	}

	/**
	 * Returns a String which identifies the Numero.
	 *
	 * @return String identifier.
	 */

	public String toString() {
		return "" + _value + " " + super.toString();
	}

	/**
	 * Compares a Numero's value with another Numero, and checks if it's the same.
	 *
	 * @return logical value of comparison.
	 */
	
	public boolean equals( Object other ) {
		if ( other instanceof Numero == false ) {
			return false;
		}
		return ( this._value == ((Numero) other).get() );
	}
}
