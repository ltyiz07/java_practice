package Test;

import java.util.TreeSet;

public class Exam63_class_TreeSet1 {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();

        String from = "b";
        String to = "g";

        set.add("abc"); set.add("bts"); set.add("big_bang");
        set.add("red_velvet"); set.add("brown"); set.add("zebra");
        set.add("gorila"); set.add("wax");

        System.out.println(set);
        System.out.println("range from " + from + " to " + to);
        System.out.println("Result 1: " + set.subSet(from, to));
        System.out.println("Result 2: " + set.subSet(from, "zzz"));
        System.out.println(set.headSet("red"));
        System.out.println(set.tailSet("red"));



    }
}
