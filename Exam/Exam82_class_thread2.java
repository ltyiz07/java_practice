package Exam;

public class Exam82_class_thread2 {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        System.out.println();

        ThreadEx1 t1 = new ThreadEx1();
        Runnable r = new ThreadEx2();
        Thread t2 = new Thread(r);

        t1.start();
        t2.start();
    }
}



class ThreadEx1 extends Thread {
    public void run() {
        for (int i = 0; i < 500; i++) {
            System.out.print("😊");
        }
    }
}

class ThreadEx2 implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.print(Thread.currentThread().getName());
        }
    }
}

