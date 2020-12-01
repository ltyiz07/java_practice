package Exam;

import java.util.function.Predicate;
import java.util.function.Supplier;

@FunctionalInterface
interface MyFunction {
    void run();
}

public class Exam91_class_lambda {

    static void execute(MyFunction f) {
        System.out.print("execute! ");
        f.run();
    }
    static MyFunction getMyFunction() {
        return () -> System.out.println("f2.run()!");
    }

    public static void main(String[] args) {
        MyFunction f1 = () -> System.out.println("f1.run()!");
        MyFunction f2 = new MyFunction() {
            @Override
            public void run() {
                System.out.println("f2.run()!!");
            }
        };
        MyFunction f3 = getMyFunction();
        f1.run();

        f2.run();

        execute(f1);
        f3.run();
    }
}
