package Test;

import java.util.ArrayList;

public class Exam72_class_GenericType {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("lee", 4, 35));
        list.add(new Student("you", 5, 33));
        list.add(new Student("lkje", 2, 32));
        list.add(new Student("elkjr", 6, 31));
        list.add(new Student("erererer", 1, 30));

        System.out.println(list);
        for (Student s : list) {
            System.out.println(s.name + s.grade + s.no);

        }
    }
}

class Student {
    String name;
    int grade;
    int no;

    Student (String name, int grade, int no) {
        this.name = name;
        this.grade = grade;
        this.no = no;
    }
}