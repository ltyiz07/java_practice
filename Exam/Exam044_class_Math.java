package Exam;

public class Exam044_class_Math {
    public static void main(String[] args) {
        double sum = 0, sum1 = 0, sum2 = 0;

        for (double d = 1.4; d <= 10.4; d++) {
            double d1 = Math.round(d);
            double d2 = Math.rint(d);

            System.out.printf("%4.1f   %4.1f   %4.1f\n", d, d1, d2);

            sum += d;
            sum1 += d1;
            sum2 += d2;
        }

        System.out.println("----------------------");
        System.out.printf("%4.1f   %4.1f   %4.1f\n", sum, sum1, sum2);
        System.out.println(Math.rint(3.4));
    }
}
