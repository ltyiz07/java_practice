package young_lee;

import java.util.*;

public class comb_pick_2 {
    public static void main(String[] args) {
        int[] arr = new int[] {2,1,3,4,1};
        ArrayList<Integer> new_arr = new ArrayList<>();

        for (int l : arr) {
            new_arr.add(l);
        }

        new_arr = combi(new_arr);
        Set<Integer> set = new HashSet<>(new_arr);
        int[] answer = new int[(int) set.size()];
        System.out.println(set);


        @SuppressWarnings("rawtypes")
        Iterator it = set.iterator();
        int count = 0;
        while (it.hasNext()) {
            answer[count++]= (int) it.next();
        }

        System.out.println(Arrays.toString(answer));
        Arrays.sort(answer);
    }

    public static ArrayList<Integer> combi (ArrayList<Integer> get_arr) {

        ArrayList<Integer> answer = new ArrayList<>();

        if (get_arr.size() == 2) {
            answer.add(get_arr.get(0) + get_arr.get(1));
            return answer;
        }
        for (int i = 1; i < get_arr.size(); i++) {
            answer.add(get_arr.get(0) + get_arr.get(i));
        }

        get_arr.remove(0);
        ArrayList<Integer> push = combi(get_arr);
        answer.addAll(push);
        return answer;

    }
}
