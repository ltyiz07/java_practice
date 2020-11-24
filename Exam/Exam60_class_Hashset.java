package Exam;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class Exam60_class_Hashset {
    public static void main(String[] args) {
        Object[] objs = {"1", 1, "2", "3", "3", "4", "4"};
        Set set = new HashSet();

        for ( int i = 0 ; i < objs.length ; i++ ) {
            set.add(objs[i]);
        }
        System.out.println(set);
        Iterator it = set.iterator();
        while ( it.hasNext() ) {
//            System.out.println(it.next());
            System.out.println(((Object)it.next()).getClass());
        }
    }
}
