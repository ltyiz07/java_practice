package Exam;

import java.util.function.Function;
import java.util.function.Predicate;

public class Exam100_class_FunctionPackage2 {
    public static void main(String[] args) {
        Function<String, Integer> f = (s) -> Integer.parseInt(s, 16);
        Function<Integer, String> g = Integer::toBinaryString;

        Function<String, String> h = f.andThen(g);
        Function<Integer, Integer> h2 = f.compose(g);

        System.out.println(f.apply("FF"));
        System.out.println(h.apply("FF"));
        for (int i = 0; i < 10; i++) {
            System.out.println(h2.apply(i));
        }

        Predicate<Integer> p = i -> i < 200;
        Predicate<Integer> q = i -> i < 100;
        Predicate<Integer> r = i -> i % 2 == 0;
        Predicate<Integer> notP = p.negate();

        Predicate<Integer> all = notP.and(q.or(r));
        System.out.println(all.test(162));
    }
}
