package editor;
import editor.core.*;

public class Test {
  public static void main(String[] args) {

    Editor editor = new Editor();

    Square sq = new Square(4, 5, 20);
    Line li = new Line(2, -4, 34, 40);
    Circle ci = new Circle(0, 0, 30);

    editor.addForm(sq);
    editor.addForm(li);
    editor.addForm(ci);

    System.out.println(sq.draw());
    System.out.println(li.draw());
    System.out.println(ci.draw());

    sq.move(5, 6);
    li.move(5, 6);
    ci.move(5, 6);

    System.out.println(sq.draw());
    System.out.println(li.draw());
    System.out.println(ci.draw());
  }
}
