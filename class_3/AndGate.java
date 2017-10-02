public class AndGate {

	// Attributes

	private boolean _entry1;
	private boolean _entry2;

	// Methods 

	public AndGate () {
		setGate1 (false);
		setGate2 (false);
	}

	public AndGate (boolean ent1, boolean ent2) {
		setGate1 (ent1);
		setGate2 (ent2);
	}


	public void setGate1 (boolean ent) { _entry1 = ent;	}

	public void setGate2 (boolean ent) { _entry2 = ent;	}

	public boolean getGate1 () { return _entry1; }

	public boolean getGate2 () { return _entry2; }

	public boolean getOutput () { return ( getGate1() && getGate2() ); }

	}
}

class TrenaryAndGate extends AndGate {

	// Attributes

	private boolean _entry3;

	// Methods

	public TrenaryAndGate () {
		setGate1 (true);
		setGate2 (true);
		setGate3 (true);
	}

	public void setGate3 (boolean ent3) { _entry3 = ent3; }

	public boolean getGate3 () { return _entry3; }

	public boolean getOutput () { return ( getGate1 () && getGate2 () && getGate3 () ); }
}