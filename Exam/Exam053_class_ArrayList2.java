package Exam;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import Exam.Practice;

public class Exam053_class_ArrayList2 {
    public static void main(String[] args) {
        Practice p = new Practice();

        ArrayList<Object> list = new ArrayList<>();
        ArrayList<Integer> list01 = new ArrayList<>();


        for (int i = 1; i <= 5; i++) {
            list.add(i);
        }
        System.out.println(list);

        for (Object o : list) {
            System.out.println(o);
        }

        p.split();
        for (int i = 1; i <= 5; i++){
            list01.add(i);
        }
        for (Integer k : list01) {
            System.out.println(k);
        }

        p.split();
        System.out.println(list);
        Iterator<Object> iter = list.iterator();
        while (iter.hasNext()) {
            Object object = iter.next();
            System.out.println(object);
        }


    }
}
