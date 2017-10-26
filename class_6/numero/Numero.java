package numero;

/**
 * Standard Numero Class. Stores an integer number, which can retrieved
 * and compared with other Numeros.
 * 
 * @author Grupo 22
 * @version 1.0
 * @see <a href="https://fenix.tecnico.ulisboa.pt/disciplinas/PO171795/2017-2018/1-semestre/aula-pratica-3">Exercise Paper</a>
 *
 */

public class Numero extends Object {

	/**
	 * Numero's value.
	 */
	private int _value;

	/**
	 * Constructor for default Numero with value set to 0.
	 */
	public Numero() {
		_value = 0; 
	}

	/**
	 * Constructs a Numero with value set to val.
	 *
	 * @param val value of created Numero.
	 */
	public Numero( int val ) {
		set(val);
	}

	/**
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
	 * @return String identifier.
	 */
	public String toString() {
		return "" + _value + " " + super.toString();
	}

	/**
	 * Compares a Numero's value with another Numero, and checks if it's the same.
	 *
	 * @param other object to be compared.
	 * @return logical value of comparison.
	 */
	public boolean equals( Object other ) {
		if ( other instanceof Numero == false ) {
			return false;
		}
		return ( this._value == ((Numero) other).get() );
	}
}
