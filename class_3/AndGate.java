public class AndGate extends Object {

	/* Attributes */

	private boolean _entry1;
	private boolean _entry2;

	/* Methods */ 

	public AndGate () {
		setGate1(false);
		setGate2(false);
	}

	public AndGate(boolean ent1, boolean ent2) {
		setGate1(ent1);
		setGate2(ent2);
	}

	public void setGate1(boolean ent) { 
		_entry1 = ent;	
	}

	public void setGate2(boolean ent) { 
		_entry2 = ent;
	}

	public boolean getGate1() {
		return _entry1;
	}

	public boolean getGate2() { 
		return _entry2; 
	}

	public boolean getOutput () {
		return ( getGate1() && getGate2() );
	}

	public String toString() {

		String TRUE_VAL = "TRUE";
		String FALSE_VAL = "FALSE";
		
		String gate1;
		String gate2;
		String output;
		
		if ( getGate1() ) {
			gate1 = TRUE_VAL;
		} else {
			gate1 = FALSE_VAL;
		}

		if ( getGate2() ) {
			gate2 = TRUE_VAL;
		} else {
			gate2 = FALSE_VAL;
		}

		if ( getOutput() ) {
			output = TRUE_VAL;
		} else {
			output = FALSE_VAL;
		}
		
		return "" + gate1 + " AND " + gate2 + " = " + output;
	}

	public static void main(String[] args) {
		AndGate gate = new AndGate(true, true);
		System.out.println(gate.toString());
		
		gate.setGate1(false);
		System.out.println(gate.toString());
		
		gate.setGate2(false);
		System.out.println(gate.toString());
		
		gate.setGate1(true);
		gate.setGate2(true);
		System.out.println(gate.toString());
	}
}