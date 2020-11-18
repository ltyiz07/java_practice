package Exam;

import java.util.Arrays;
import java.util.Scanner;

public class Exam008_score_processing {

    public static void main(String[] args) {
        String[] name;
        int[][] score;
        int[] total;
        int heads;

        Scanner sc = new Scanner(System.in);

        //  처리할 학생의 인원수를 입력받는다.

        do {
            System.out.print("처리할 학생수는?");
//            heads = sc.nextInt();
            heads = (int) (Math.random() * 100 + 1);
        } while (heads < 1 || heads > 100);

        System.out.println(heads + "명의 국, 영, 수 점수를 입력하세요.");

        name = new String[heads];
        score = new int[heads][3];
        total = new int[heads];

        String[] subjects = {"국어=>", "영어=>", "수학=>"};

        for (int i = 0; i < heads; i++) {
            System.out.println("이름=>");
//            name[i] = sc.next();
            name[i] = "0" + i;

            for (int j = 0; j < subjects.length; j++) {
                System.out.println(subjects[j]);
//                score[i][j] = sc.nextInt();
                score[i][j] = (int) (Math.random() * 100 + 1);
                total[i] += score[i][j];

            }
            System.out.println();
        }
        for (int i = 0; i < heads; i++) {
            System.out.println(name[i] + "\t");
            for (int j = 0; j < score[i].length; j++) {
                System.out.printf("%s \t", name[i]);
                System.out.printf("%s %4d \t", subjects[j], score[i][j]);
            }
            System.out.printf("total: %4d average: %2.2f \n", total[i], (float) total[i] / 3);
        }
        sc.close();
        for ( int i = 0; i < heads; i++ ) {
            for ( int j = i; j < heads; j++ ) {
                System.out.print(j + " ");
            }
        }

    }
}