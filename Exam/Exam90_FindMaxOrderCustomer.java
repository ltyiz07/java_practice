package Exam;

import java.util.*;

public class Exam90_FindMaxOrderCustomer {
    public static void main(String[] args) {
        List<String> orders = new ArrayList<String>(
        Arrays.asList("alex pizza pasta steak", "bob noodle sandwich pasta", "choi pizza sandwich pizza", "alex pizza pasta steak"));
        System.out.println(orders.toString());

        ArrayList<String> name_list = new ArrayList<>();
        ArrayList<String> menu_list = new ArrayList<>();
        ArrayList<String> menu_cnt_list = new ArrayList<>();
        HashMap<String, Integer> name_menu = new HashMap<>();

        for (String xx : orders) {
            String[] name = xx.split(" ");
            if (! name_list.contains(name[0]))
                name_list.add(name[0]);
        }
        System.out.println(name_list);

        for ( String name : name_list) {
            for (String xx : orders) {
                String[] order = xx.split(" ");
                if (name.equals(order[0])) {
                    for (int j = 1; j < order.length; j++) {
                        if (! menu_list.contains(order[j])) {
                            menu_list.add(order[j]);
                        }
                    }
                }
            }
            System.out.println(name + ": " + menu_list);
            name_menu.put(name, menu_list.size());
//            menu_cnt_list.put()
            menu_list.clear();
        }
        System.out.println(name_menu);
        Collections.sort(menu_cnt_list);
//        int top_cnt = menu_cnt_list.get(menu_cnt_list.size() - 1);

//        for (String name : name_menu.keySet()) {
//            if (name_menu.get(name) == top_cnt) {
//                System.out.println(name);
//            }
//        }

    }
}
