package Exam;

class AAA{
    int i = 100;
    BBB b = new BBB();
}

class BBB {
    void method() {
        AAA a = new AAA();
        System.out.println(a.i);
    }
}

public class Exam033_innercalss_test {
    public static void main(String[] args) {
        BBB b = new BBB();
        b.method();
    }
}
