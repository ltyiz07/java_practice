package Exam;

class Value {
    int value;

    Value(int value) {
        this.value = value;
    }
}

public class Exam040_class_ObjectMethod {
    public static void main(String[] args) {
        Practice p = new Practice();
        String str = new String("abc");
        String str1 = "abc";
        String str2 = "abc";

        p.split("start");
        if (str == str1) {
            System.out.println("Same");

        } else {
            System.out.println("difffrenr");
        }
        Value v1 = new Value(10);
        Value v2 = new Value(10);

        if (v1 == v2) {
            System.out.println("Same");
        }
        else {
            System.out.println("difff");
        }

        p.split();


    }
}
