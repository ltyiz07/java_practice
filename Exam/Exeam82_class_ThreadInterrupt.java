package Exam;

public class Exeam82_class_ThreadInterrupt {
    public static void main(String[] args) {
        ThreadEx83_1 t1 = new Thread(ThreadEx83_1);
        t1

    }
}

class ThreadEx83_1 extends Thread {
    public void run() {
        int i = 10;
        while (i != 0 && interrupted()) {
            System.out.println(i--);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }
        System.out.println();
        System.out.println("end countdown");
    }
}