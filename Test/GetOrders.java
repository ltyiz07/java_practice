package Test;

import java.util.*;

public class GetOrders {
    public static void main(String[] args) {
        ArrayList<String> answer = new ArrayList<>();
        String[] list = new String[] {"alex pizza pasta steak", "bob noodle sandwich pasta", "choi pizza sandwich pizza", "alex pizza pasta steak"};
//        String[] list = new String[] {"alex pizza pasta", "alex pizza pizza", "alex noodle", "bob pasta", "bob noodle sandwich pasta", "bob steak noodle"};
        Map<String, Set<String>> dict = new HashMap<>();
        for (String s : list) {
            String[] temp_list = s.split(" ");
            for (int j = 1; j < temp_list.length; j++) {
                if (dict.containsKey(temp_list[0])) {
                    dict.get(temp_list[0]).add(temp_list[j]);
                } else {
                    dict.put(temp_list[0], new HashSet<String>(Collections.singleton(temp_list[j])));
                }
            }
        }
        System.out.println(dict.toString());

        Set<String> keySet = dict.keySet();
        Iterator<String> keyIterator = keySet.iterator();
        int temp_length = 0;
        while (keyIterator.hasNext()) {
            String name = keyIterator.next();
            int kind = dict.get(name).size();
            if (temp_length == kind) {
                answer.add(name);
            } else if (temp_length < kind) {
                answer.clear();
                answer.add(name);
                temp_length = kind;
            }
        }
        // ["alex pizza pasta", "alex pizza pizza", "alex noodle", "bob pasta", "bob noodle sandwich pasta", "bob steak noodle"]

        System.out.println(answer);

    }
}
