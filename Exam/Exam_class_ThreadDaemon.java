package Exam;

public class Exam_class_ThreadDaemon implements Runnable{
    static boolean autoSave = false;

    public static void main(String[] args) {
        Thread t = new Thread( new Exam_class_ThreadDaemon() );
        t.setDaemon(true);
        t.start();

        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.toString());
            }
            System.out.println(i);
            if (i == 5) autoSave = true;
        }
        System.out.println("end program!!");


    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(3 * 1000);
            } catch (InterruptedException e) {
                System.out.println(e.toString());
            }
            if (autoSave) {
                System.out.println("saved is on");
            }

        }

    }
}
