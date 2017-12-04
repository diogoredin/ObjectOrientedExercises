package editor.core;

import java.util.ArrayList;

public class FormGroup implements ShapeFunc {

	private ArrayList<Form> _forms;

	public FormGroup() {
		_forms = new ArrayList<Form>();
	}

	public void add(Form form) {
		_forms.add(form);
	}

	public String draw() {
		String result = "";

		for(Form form : _forms) {
			result = result + form.draw();
		}

		return result;
	}

	public void move(int x, int y) {
		_forms.forEach((Form form) -> {
			form.move(x, y);
		});
	}

	public void remove(Form form) {
		_forms.remove(form);
	}
}