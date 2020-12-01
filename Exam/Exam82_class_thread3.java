package Exam;

import javax.swing.*;

public class Exam82_class_thread3 {
    public static void main(String[] args) {
        ThreadEx1_3 t1 = new ThreadEx1_3();
        t1.start();

        String input = JOptionPane.showInputDialog("input your message");
        System.out.println(input);

    }
}


class ThreadEx1_3 extends Thread {
    public void run() {
        for (int i = 20; i > 0; i--) {
            System.out.println("%%%%%%%%" + i + " %%%%%%%");
            try {
                sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}