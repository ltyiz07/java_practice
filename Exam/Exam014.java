package Exam;

class Point2D {
    int x;
    int y;

    String getLocation () {
        return "x: " + x + "\ty:" + y;
    }
}

class Point3D extends Point2D {
    int z;

    String getLocation () {
        return "x: " + x + "\ty: " + y + "\tz: " + y;
    }
}
public class Exam014 {
    public static void main(String[] args) {
        Point2D p = new Point2D();
        p.x = 10;
        p.y = 5;
        System.out.println(p.getLocation());
        System.out.println(p.toString());
        System.out.println(p);

        Point3D q = new Point3D();
        q.x = 10;
        q.y = 10;
        q.z = 4;
        System.out.println(q.getLocation());
    }

}
