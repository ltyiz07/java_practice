package Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TeachersSinkingShip {
    public static void main(String[] args) {
        int first, end;
        int n = 10, weight_limit=150;
        int[] weight = {86, 95, 107, 67, 38, 49, 116, 22, 78, 53};

        List lst = new ArrayList();

        for (int i = 0; i < weight.length; i++) {
            lst.add(weight[i]);
        }

        Collections.sort(lst);
        System.out.println(lst);
        System.out.println("=>Singking Tatanic's rescue boat");
        System.out.println("n: " + n + " weight_limit: " + weight_limit);

        int cnt = 0;
        while (lst.size() != 0) {
            if (lst.size() == 1) { cnt += 1; break; }
            first = (int) lst.get(0);
            end = (int) lst.get(lst.size() - 1);
            if ( first + end > weight_limit ) {
                cnt++;
                lst.remove(lst.size() - 1);
            } else {
                cnt++;
                lst.remove(0);
                lst.remove(lst.size() - 1);
            }
        }

        System.out.println("minimum necessity of boat is " + cnt);
    }
}
