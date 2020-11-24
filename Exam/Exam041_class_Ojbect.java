package Exam;

import java.util.Objects;

class Person {
    long id;

    Person () {
        this(971212000000L);
    }

    Person (long id) {
        this.id = id;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Person)
            return this.id == ((Person) obj).id;
        else
            return false;
    }

    public int hashCode() {
        return Objects.hash(id);
    }

}

public class Exam041_class_Ojbect {
    public static void main(String[] args) {
        Person p1 = new Person(9506172323232L);
        Person p2 = new Person(9506172323232L);

        if (p1.equals(p2)) {
            System.out.println("sasasasame");
        } else {
            System.out.println("not same");
        }

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());

    }
}
