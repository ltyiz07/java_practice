package Exam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import Exam.Practice;

public class Exam101_class_FunctionPackage3 {
    public static void main(String[] args) {
        Practice p = new Practice();
        ArrayList<Integer> list = new ArrayList<> ();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }


        list.forEach(i -> System.out.print(i + " "));
        p.split();

        for (Integer i : list) {
            System.out.print(i);
        }
        p.split();

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next());
        }
        p.split();

        list.removeIf(xx -> xx % 2 == 0 || xx % 3 == 0);
        System.out.println(list);
        p.split();

        Map<String, String> map = new HashMap<>();
        map.put("정원준", "191-2873-2873");
        map.put("타이거", "233-2394-2934");
        map.put("마이클", "238-2396-4441");
        map.forEach((String k, String v) -> System.out.println(k + " : " + v));
        p.split();

        for (Map.Entry<String, String> stringStringEntry : map.entrySet()) {
            System.out.println(stringStringEntry.toString().replace("=", " : "));
        }
        p.split();

    }
}
