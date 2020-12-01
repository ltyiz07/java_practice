package Exam;

import java.util.HashMap;
import java.util.Scanner;

public class Exam70_class_Hashmap {
    public static void main(String[] args) {

        HashMap map = new HashMap();
        map.put("John", "john1234");
        map.put("Paul", "paul1234");
        map.put("Young", "young1234");
        map.put("Terminator", "terminator1234");

        System.out.println(map);
        System.out.println("key set= " + map.keySet());
        System.out.println("key values= " + map.values());
        System.out.println("Entry= " + map.entrySet());



        System.out.println(map);
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("input ID and Password");
            System.out.println("ID: ");
            String id;
            id = s.nextLine().trim();

            System.out.println("Password: ");
            String password = s.nextLine().trim();
            System.out.println();

            if (! map.containsKey(id)) {
                System.out.println("don't have ID... re-input");
                continue;
            } else if (! (map.get(id)).equals(password)) {
                System.out.println("Password not exist");
            } else {
                System.out.println("hello");
                break;
            }
        }

        System.out.println("log in!!!");
    }
}
