package Exam;

import Exam.Practice;

import java.util.Calendar;

public class Exam045_class_Math2 {
    public static void main(String[] args) {
        Practice p = new Practice();

        p.split();
        int i = 5;
        Integer iObj = new Integer(7);

        p.split();
        int sum = i + iObj;
        System.out.println(i);
        System.out.println(iObj);
        System.out.println(sum);

        p.split();
        int k = Integer.parseInt("100");
        System.out.println(k);

        p.split();
        System.out.println(Integer.parseInt("100", 2));
        System.out.println(Integer.parseInt("100", 10));
        System.out.println(Integer.parseInt("FF", 16));

        p.split();
        try {
            System.out.println(Integer.parseInt("FF", 8));

        } catch (Exception e) {
            System.out.println(e);
        }

        p.split();
        Calendar today = Calendar.getInstance();
        System.out.println(today.get(Calendar.YEAR) + "년");
        System.out.println(today.get(Calendar.MONTH) + 1 + "월");
        System.out.println(today.get(Calendar.DATE) + "일");
        System.out.println(today.get(Calendar.DAY_OF_WEEK) + "요일");
        System.out.println(today.get(Calendar.WEEK_OF_YEAR) + "week of year");
        System.out.println(today.get(Calendar.MILLISECOND));

        p.split();
        String[] week = {"", "일", "월", "화", "수", "목", "금", "토"};
        Calendar date1 = Calendar.getInstance();
        Calendar date2 = Calendar.getInstance();

        date1.set(1995, 5, 17);     //1995 년 6월 17일
        date2.set(2020, 10, 20);    //2020 년 11월 20일

        System.out.println(toString(date1));
        System.out.println(toString(date2));

        long difference = (date2.getTimeInMillis()-date1.getTimeInMillis()) / 1000;
        System.out.println(difference / 60/60/24);


    }

    public static String toString(Calendar date) {
        String[] week = {"", "일", "월", "화", "수", "목", "금", "토"};
        return date.get(Calendar.YEAR) + "년 " + (date.get(Calendar.MONTH) + 1) + "월 "
                + date.get(Calendar.DATE) + "일 " + week[date.get(Calendar.DAY_OF_WEEK)] + "요일";
    }

}
