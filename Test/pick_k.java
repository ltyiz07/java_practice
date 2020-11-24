package Test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class pick_k {
    public static void main(String[] args) {
        System.out.println("hello");

        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        System.out.println(commands.length);
        solution(array, commands);
    }

    public static int[] solution(int[] array, int[][] commands) {
        int[] temp_arr = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int[] temp_list = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1] + 1);
            Arrays.sort(temp_list);

            temp_arr[i] = temp_list[commands[i][2] - 1];
        }
        return temp_arr;
    }
}
