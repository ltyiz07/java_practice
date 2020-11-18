package Exam;

public class Exam035_innerClassoo_scope2 {
    class InstanceInner {}
    static class StaticInner {}
    InstanceInner iv = new InstanceInner();
    StaticInner cv = new StaticInner();

    static void staticMethod() {
//        InstanceInner obj1 = new InstanceInner();
        StaticInner obj2 = new StaticInner();

//        방법은 있지만 권장하지 않음.
//        Exam035_innerClassoo_scope2 outer = new Exam035_innerClassoo_scope2();
//        InstanceInner obj1 = outer.new InstanceInner();

    }
}
