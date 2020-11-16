class Point {
    int x;
    int y;

    Point () {}
    Point (int x, int y) {
        this.x = x;
        this.y = y;
    }
}

// 상속관계
class Circle extends Point {
    int r;

    Circle () {}
    Circle (int x, int y, int r) {
        super(x, y);
        this.r = r;
    }
}

// 포함관계
//class Circle {
//    Point p = new Point();
//    int r;

public class Exam013_class_inheritance_01 {
    public static void main(String[] args) {
        Circle c = new Circle(10, 10, 10);

        System.out.println(c.x + "\t" + c.y + "\t" + c.r);
    }
}
