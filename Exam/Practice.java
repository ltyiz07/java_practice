package Exam;

public class Practice {
    public int number = 0;

    public void split() {
        for (int i = 0; i < 50; i++) {
            System.out.print('*');
        }
        System.out.println("    " + number);
        number++;
    }
    public void split(String k) {
        for (int i = 0; i < 50; i++) {
            System.out.print('*');
        }
        System.out.println("    " + k);
    }
}
