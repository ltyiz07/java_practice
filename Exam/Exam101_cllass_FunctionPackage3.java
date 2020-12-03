package Exam;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import Exam.Practice;

public class Exam101_cllass_FunctionPackage3 {
    public static void main(String[] args) {
        Practice p = new Practice();
        List<String> list = Arrays.asList("Fight the feeling", "Into the club", "X-cape", "Flight", "Fly me to the moon");
        for (String s : list) {
            System.out.println(s);
        }
        p.split();

//        Stream<String> streamNames = list.stream();
//        streamNames.forEach(System.out::println);
//        p.split();
        Stream<String> parrelelStream = list.parallelStream();
        parrelelStream.forEach(Exam101_cllass_FunctionPackage3::print);

        IntStream intStream = new Random().ints(1, 46);
        System.out.println(intStream.limit(100).average().toString());
//        intStream.forEach(i -> i == 10 ? System.out.println(i) : intStream.close(););
//        p.split();


    }

    public static void print(String str) {
        System.out.println(str + ": " + Thread.currentThread().getName());
    }

}
