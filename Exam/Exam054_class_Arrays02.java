package Exam;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import Exam.Practice;

public class Exam054_class_Arrays02 {
    public static void main(String[] args) {
        Practice p = new Practice();

        String[] strArray = {"cat", "Monkey", "dog", "tiger", "dog", "Elephant"};

        p.split();
        Arrays.sort(strArray);
        System.out.println(Arrays.toString(strArray));

        p.split();
        Arrays.sort(strArray, String.CASE_INSENSITIVE_ORDER);
        System.out.println(Arrays.toString(strArray));

        p.split();
        Arrays.sort(strArray, Collections.reverseOrder());
        System.out.println(Arrays.toString(strArray));

        p.split();
        Arrays.sort(strArray, new Descending());
        System.out.println(Arrays.toString(strArray));
    }
}

class Descending implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        if (o1 instanceof Comparable && o2 instanceof Comparable) {
            Comparable c1 = (Comparable) o1;
            Comparable c2 = (Comparable) o2;
            return c1.compareTo(c2) * -1;
        }
        return -1;
    }
}