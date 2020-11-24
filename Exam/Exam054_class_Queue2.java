package Exam;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;

public class Exam054_class_Queue2 {
    static Queue q = new LinkedList<>();
    static final int MAX_SIZE = 10;

    public static void main(String[] args) {
        System.out.println("help for help");

        while (true) {
            System.out.println(">");
            try {
                Scanner s = new Scanner(System.in);
                String input = s.nextLine().strip();

                if ("".equals(input)) continue;
                if (input.equalsIgnoreCase("q")) {
                    System.out.println("shut down the system.");
                    System.exit(0);
                } else if (input.equalsIgnoreCase("help")) {
                    System.out.println(" help -- show help list");
                    System.out.println(" q or Q key -- exit program");
                    System.out.println(" history -- history" + MAX_SIZE + "no.");
                } else if (input.equalsIgnoreCase("history")) {
                    int i = 0;
                    save(input);

                    LinkedList tmp = (LinkedList) q;
                    ListIterator it = tmp.listIterator();
                    while (it.hasNext())
                        System.out.println(++i + "." + it.next());
                } else {
                    save(input);
                    System.out.println(input);
                }
            } catch(Exception exception) {
                System.out.println("input error errupted");
            }
        }
    }

    public static void save (String input) {
        if (!"".equals(input))
            q.add(input);
        if(q.size() > MAX_SIZE)
            q.poll();
    }
}
