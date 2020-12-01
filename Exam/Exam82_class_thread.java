package Exam;

public class Exam82_class_thread {
    static long startTime = System.currentTimeMillis();
    public static void main(String[] args) {


        ThreadEx1_1 t1 = new ThreadEx1_1();
        Runnable r = new ThreadEx1_2();
        Thread t2 = new Thread(r);

        t1.start();
        t2.start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("0");

        }

        System.out.println("durtime: " + (System.currentTimeMillis() - startTime));

    }
}

class ThreadEx1_1 extends Thread {
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("%");
        }
    }
}

class ThreadEx1_2 implements Runnable {
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("&");
        }
    }

}