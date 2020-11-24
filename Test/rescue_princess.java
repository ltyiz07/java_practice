package Test;

import java.util.LinkedList;
import java.util.Scanner;

public class rescue_princess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input member");
        int member = sc.nextInt();
        System.out.println("input k");
        int k = sc.nextInt();
        if (k > member) {
            System.out.println("should be smaller than member");
            k = sc.nextInt();
        }

        System.out.println(pick(member, k));




    }

    public static int pick (int member, int k) {
        LinkedList member_list = new LinkedList();
        int answer = 0;
        for (int i = 1; i <= member; i++){
            member_list.offer(i);
        }
        System.out.println(member_list);
        while (member_list.size() > 1) {
            for (int j = 0; j < k - 1; j++) {
                member_list.offer(member_list.poll());
            }
            member_list.poll();
        }
        answer = (int) member_list.poll();
        return answer;
    }

}
