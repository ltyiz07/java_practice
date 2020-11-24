package Exam;

import java.util.Calendar;

public class Exam045_class_Calandar {
    public static void main(String[] args) {

        for (int i = 1; i < 13; i++) {
            gen_calendar(new String[] {"2020", Integer.toString(i)});
        }
    }

    public static void gen_calendar (String[] args) {
        int year = Integer.parseInt(args[0]);
        int month = Integer.parseInt(args[1]);
        int START_DAY_OF_WEEK = 0;
        int END_DAY = 0;

        System.out.println();
        System.out.println();
        Calendar sDay = Calendar.getInstance();
        Calendar eDay = Calendar.getInstance();

        sDay.set(year, month - 1, 1);
        eDay.set(year, month, 1);   //다음달의 첫날로 셋.

        eDay.add(Calendar.DATE, -1);    //전달의 마지막날이된다.

        START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK);
        END_DAY = eDay.get(Calendar.DATE);

        System.out.println("    " + year + "년 " + month + "월");
        System.out.println("    sun    mon    tue    wed    thu    fri    sat    ");


        for (int i = 1; i < START_DAY_OF_WEEK; i++) {
            System.out.print("       ");
        }

        for (int i = 1, n = START_DAY_OF_WEEK; i <= END_DAY; i++, n++) {
            System.out.print((i < 10) ? "      " + i : "     " + i);
            if (n % 7 == 0) System.out.println();
        }
    }
}
