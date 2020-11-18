package Test;

import Exam.Practice;

public class Test001 {
    public static void main(String[] args) {
        Practice p = new Practice();

        System.out.println(p instanceof Practice);
        p.split();

        Third a = new Third();
        System.out.println(a.a);
        System.out.println(a.method());
    }
}

class First {
    int a = 1;
}

class Second extends First {
    int a = 2;
}

class Third extends Second {
    int a = 3;

    int method() {
        int b = super.a;
        return b;
    }
}