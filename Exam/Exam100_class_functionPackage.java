package Exam;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Exam100_class_functionPackage {
    public static void main(String[] args) {
        Supplier<Integer> s = () -> (int)(Math.random() * 100) + 1;
        Consumer<Integer> c = System.out::println;
        Predicate<Integer> p = i -> i % 2 == 0;
        Function<Integer, Integer> f = i -> i / 10 * 10;
        Predicate<Integer> com = i -> 100 < i && i < 200;

        System.out.println(s.get());

        c.accept(23);

        System.out.println(p.test(34));

        System.out.println(f.apply(145));


        List<Integer> list = new ArrayList<Integer>();
        printEvenNum(p, c, list);

    }

    static <T> void makeRandomList (Supplier<T> s, List<T> list) {
        for (int i = 0; i < 10; i++) {
            list.add(s.get());
        }
    }

    static <T> void printEvenNum(Predicate<T> p, Consumer<T> c, List<T> list) {
        System.out.println("[");
        for (T i : list) {
            if (p.test(i)) {
                c.accept(i);
            }
        }
        System.out.println("]");
    }
}
