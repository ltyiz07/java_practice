package Exam;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public class Exam61_class_Hash {
    public static void main(String[] args) {
        HashSet setA = new HashSet();
        HashSet setB = new HashSet();
        HashSet setUnion = new HashSet();
        HashSet setIntersection = new HashSet();
        HashSet setDifference = new HashSet();

        for ( int i = 1 ; i <= 6 ; i++ ) setA.add(i + "");

            setB.add("4");
            setB.add("5");
            setB.add("6");
            setB.add("7");
            setB.add("8");
            setB.add("9");

        System.out.println("setA" + setA);
        System.out.println("setB" + setB);


        System.out.println("A intersection B" + intersection(setA, setB));
        System.out.println("A union B" + union(setA, setB));
    }

    static HashSet intersection(HashSet A,HashSet B) {
        Iterator it = B.iterator();
        HashSet setIntersection = new HashSet();
        while (it.hasNext()) {
            Object tmp = it.next();
            if ( A.contains(tmp) ) {
                setIntersection.add(tmp);
            }
        }
        return setIntersection;
    }

    static HashSet union(HashSet A, HashSet B) {
        Iterator it = B.iterator();
        while ( it.hasNext() ) {
            Object tmp = it.next();
            if ( !A.contains(tmp) ) {
                A.add(tmp);
            }
        }
        return A;
    }
}
