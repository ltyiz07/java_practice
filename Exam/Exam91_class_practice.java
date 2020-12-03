package Exam;

@FunctionalInterface
interface Print {
    void print();
}
public class Exam91_class_practice {
    public static void main(String[] args) {
        Print p = () -> {System.out.println("this is line");};
        p.print();
    }
}
