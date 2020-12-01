package Exam;

import java.util.Arrays;
import java.util.Objects;

class Card {
    String kind;
    int number;
    long id;

    Card() {
        this("SPACE", 1);
    }

    Card(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    public String toString() {
        return "kind: " + kind + ", number: " + number;
    }

    public int hashCode () {
        return Objects.hash(id);
    }
}

class Basic {
    @SuppressWarnings("unused")
    int number = 1;
}

public class Exam042_class_ObjectMe {
    public static void main(String[] args) {
        Practice p = new Practice();
        Card c1 = new Card();
        Card c2 = new Card("spade", 3);

        p.split();
        System.out.println(c1.toString());
        System.out.println(c2.toString());

        p.split();
        System.out.println(c1.kind);
        System.out.println(c1.number);

        p.split();
        if (c1 == c2) {
            System.out.println("c1 == c2");
        } else {
            System.out.println("c1 != c2");
        }

        p.split();
        if (c1.hashCode() == c2.hashCode()) {
            System.out.println("c1.hashCode() == c2.hashCode()");
            System.out.println(c1.hashCode());
        } else {
            System.out.println("c1.hashCode() != c2.hashCode()");
            System.out.println(c1.hashCode());
            System.out.println(c2.hashCode());
        }

        p.split();
        if (c1.equals(c2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        p.split();
        System.out.println(Objects.hashCode(c1));
        System.out.println(Objects.hashCode(c2));
        Basic b = new Basic();
        System.out.println(Objects.hashCode(b));

        p.split();
        String str1 = "figha";
        String str2 = "fighc";

        p.split();
        System.out.println(str2.indexOf("g"));
        System.out.println(str1.compareTo(str2));

        p.split();
        String animal = "dog, cat, bear, tiger, elephant, whild dog";
        String[] ani_arr = animal.split(",");
        System.out.println(Arrays.toString(ani_arr));
        for (String s : ani_arr) {
            System.out.println(s.strip());
        }
        String str = String.join(",", ani_arr);
        System.out.println(str + "mMMmmHHhhhh");
        System.out.println("M" + (char)9 + "M   9");
        System.out.println("M" + (char)32 + "M  32 space");
        System.out.println("M" + (char)8197 + "M    8197");

        p.split();
        double d1 = 5.0;
        double d2 = 3.0;
        System.out.println(d1 / d2);

    }
}

