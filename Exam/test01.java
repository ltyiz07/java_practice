package Exam;

import java.util.Objects;

public class test01 {
    public static void main(String[] args) {
        Practice p = new Practice();

        p.split();
        int a = 2147483647;
        String ab = Integer.toBinaryString(a);
        Integer b = a;
        System.out.println(b.longValue());
        System.out.println(a);
        System.out.println(a + 1);
        System.out.printf("%s\n", Integer.toBinaryString(a));
        System.out.println(ab.length());

        p.split();
        String first = new String("apple");
        String second = "apple";
        String third = new String("apple");

        System.out.println(first);
        System.out.println(second);
        if (first == second) {
            System.out.println("first == second");
        } else if (second == third) {
            System.out.println("second == third");
        }

        p.split();
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        p.split();
        int get_class_test = 34;
        System.out.println(((Object) get_class_test).getClass());
    }
}

