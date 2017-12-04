package editor;

import editor.core.Editor;
import editor.core.Form;
import editor.core.Line;
import editor.core.Circle;
import editor.core.Square;
import editor.core.FormGroup;
import java.util.Collection;

public class Test {

	public static void draw(Editor editor) {
		Collection<Form> forms = editor.getForms();

		System.out.println("Drawing forms\n");

		for (Form form : forms)
			System.out.println(form.draw());
	}


	public static void main(String[] args) {
		Editor editor = new Editor();

		Square sq = new Square(editor, 1, 1, 20);
		Line li = new Line(editor, 2, 2, 34, 40);
		Circle ci = new Circle(editor, 3, 3, 30);

		FormGroup group = new FormGroup();
		
		group.add(editor.getForm(1));
		group.add(editor.getForm(2));
		group.add(editor.getForm(3));

		System.out.println(group.draw());

		group.move(2, 2);

		System.out.println(group.draw());

		group.move(-2, -2);

		System.out.println(group.draw());
		
	}
}
