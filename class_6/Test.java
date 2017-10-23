public class Test {

  public static void main(String[] args) {
    Square sq = new Square(4, 5, 20);
    Line li = new Line(2, -4, 34, 40);
    Circle ci = new Circle(0, 0, 30);

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
