package Exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

import Exam.Practice;


public class Examj050_class_Collections01 {
    public static void main(String[] args) {
        Practice p = new Practice();
        p.split();
        ArrayList list1 = new ArrayList(10);
        list1.add(new Integer(5));
        list1.add(4);      // autoboxing 을 해주기 때문에 이렇게 써도 된다.
        list1.add(3);       // 값의 생성 겸  추가
        list1.add(2);
        list1.add(1);

        ArrayList list2 = new ArrayList<>(list1.subList(1, 4));
        p.split();
        print(list1, list2);

        p.split();
        System.out.println("오름차순으로 정렬하기...");
        Collections.sort(list1);
        Collections.sort(list2);
        print(list1, list2);    // update 값의 updates

        p.split();
        System.out.println(list1.get(0));
        System.out.println(list1.indexOf(5));
        System.out.println(list1.set(0, 4));
        System.out.println(list1.remove(1));
        System.out.println(list1);

        p.split();
        System.out.println(list1.size());
        Collections.sort(list1, Collections.reverseOrder());
        Collections.sort(list2, Collections.reverseOrder());
        print(list1, list2);

        p.split();
        list1.add(2);
        print(list1, list2);
        System.out.println(list1.containsAll(list2));

        for (int i = list2.size() - 1; i >= 0; i--) {
            if (list1.contains(list2.get(i))) {
                list2.remove(i);
            }
        }
        System.out.println(list2);


    }

    static void print(ArrayList list1, ArrayList list2) {
        System.out.println("list1" + list1);
        System.out.println("list2" + list2);
        System.out.println();
    }
}
