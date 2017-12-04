package editor.core;

import java.util.Collection;


public class Test {

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
