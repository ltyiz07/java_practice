package Exam;

import java.util.Arrays;
import Exam.Practice;

public class Exam054_class_Queue3 {
    public static void main(String[] args) {
        Practice p = new Practice();

        int[] arr = {0, 1, 2, 3, 4, 5};
        int[][] arr2D = {{10, 11, 12}, {100, 101, 102}};
        int[][][] arr3D = {{{10, 11}, {12}}, {{100}, {101, 102}}};
        int[][][] arr3D2 = {{{10, 11}, {12}}, {{100}, {101, 102}}};

        p.split();
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2D[0]) + Arrays.toString(arr2D[1]));
        System.out.println(Arrays.toString(arr3D[0][1]));

        p.split();
        System.out.println(Arrays.equals(arr3D, arr3D2));
        System.out.println(Arrays.deepEquals(arr3D, arr3D2));

        p.split();
        System.out.println(Arrays.deepToString(arr3D));
        int[][][] arr3D3 = Arrays.copyOfRange(arr3D, 0, 2);
        System.out.println(Arrays.deepToString(arr3D3));

        p.split();
        int[] arr2 = new int[5];
        Arrays.fill(arr2, 7);
        System.out.println(Arrays.toString(arr2));

        p.split();
        Arrays.setAll(arr2, i -> (int)(Math.random() * 6) + 1);
        System.out.println(Arrays.toString(arr2));

        p.split();
        for (int i : arr2) {
            char[] bar = new char[i];
            Arrays.fill(bar, '#');
            System.out.println(new String(bar) + "" + i);
        }

        p.split();
        String[][] str2D = new String[][] {{"aaa", "bbb"}, {"AAA", "BBB"}};
        String[][] str2D2 = new String[][] {{"aaa", "bbb"}, {"AAA", "BBB"}};
        System.out.println(Arrays.equals(str2D, str2D2));
        System.out.println(Arrays.deepEquals(str2D, str2D2));

    }
}
