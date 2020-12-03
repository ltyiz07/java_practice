package Exam;

import java.awt.geom.Ellipse2D;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class StudentStream {
    private final String name;
    private final int score;

    StudentStream(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }
    public int getScore() {
        return score;
    }
}
public class Student_JAVA {
    public static void main(String[] args) {

        List<StudentStream> list = Arrays.asList(
                new StudentStream("george", 28),
                new StudentStream("gruel", 26),
                new StudentStream("fight", 28),
                new StudentStream("min", 26),
                new StudentStream("ji", 23),
                new StudentStream("eekjr", 28),
                new StudentStream("kei", 19),
                new StudentStream("ski", 27)
        );

        Stream<StudentStream> listStream = list.stream();
        double answer = listStream.mapToInt(StudentStream::getScore).average().getAsDouble();
        System.out.println(answer);


    }
}
