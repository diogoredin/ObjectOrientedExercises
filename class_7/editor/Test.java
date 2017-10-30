package editor;

import editor.core.Editor;
import editor.core.Form;
import editor.core.Line;
import editor.core.Circle;
import editor.core.Square;
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

    draw(editor);
    
    editor.getForm(1).move(1, 2);
    editor.getForm(2).move(2, 1);
    editor.getForm(3).move(3, 2);

    draw(editor);

    editor.putAsFirst(2);
    editor.putAsLast(1);
    
    draw(editor);
  }
}
