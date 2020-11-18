package Exam;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Ex7_18 {
    public static void main(String[] args) {
        Button b = new Button("Strat");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("AAction EEvnt OOOcurred!");
            }
        });
    }
}

class EventHandler implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("helehelh");
    }
}