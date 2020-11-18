package Exam;

public class Exam38_TryCatch_test01 {
    public static void main(String[] args) {
        System.out.println(1);
        try {
            System.out.println(2);
            myMethod();
            System.out.println(3);
        } catch(Exception e) {
            System.out.println(4);
            System.out.println(e);
            e.printStackTrace();
            System.out.println("eeeeeee");
        }

        System.out.println(5);
    }
    public static void myMethod() {
        int a = 5;
        int b = 0;
        System.out.println(a / b);
    }
}