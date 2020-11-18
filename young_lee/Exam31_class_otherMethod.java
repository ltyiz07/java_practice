package young_lee;

public class Exam31_class_otherMethod {
    public static void main(String[] args) {
        AA aa = new AA();
        aa.method(new BB());
        System.out.println("***********************");
        aa.method(new CC());


    }
}

interface I {
    public void method();

}

class AA {
    public void method(I i) {
        i.method();

    }
}

class BB  implements I {
    public void method() {
        System.out.println("call method BB");
    }
}
class CC  implements I {
    public void method() {
        System.out.println("call method CC");
    }
}
