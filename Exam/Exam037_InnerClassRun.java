package Exam;

class Outer2 {
    int outerCv = 50;
    class InstanceInner {
        int iv = 100;
    }
    static class StaticInner {
        int iv = 200;
        static int cv = 300;
    }

    void myMethod() {
        int lv = 0;
        final int LV = 0;
        class LocalInner {
            int iv = 400;
            int liv2 = outerCv;
        }
    }
}

public class Exam037_InnerClassRun {
    public static void main(String[] args) {
        Practice pc = new Practice();

        pc.split();
        Outer2 oc = new Outer2();
        Outer2.InstanceInner li = oc.new InstanceInner();
        System.out.println(li.iv);

        pc.split();
        System.out.println(Outer2.StaticInner.cv);
        Outer2.StaticInner.cv = 350;
        System.out.println(Outer2.StaticInner.cv);

        pc.split();
        Outer2.StaticInner si = new Outer2.StaticInner();
        System.out.println(si.iv);

        pc.split();
        Outer2 ouou = new Outer2();
        ouou.myMethod();

    }
}
