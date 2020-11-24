package Exam;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Exam051_class_Stack1 {
        public static void main(String[] args) {
            Stack st = new Stack<>();
            Queue q = new LinkedList();


            st.push("0");
            st.push("1");
            st.push("2");
            st.push("3");
            st.push("4");
            System.out.println(st);

            q.offer("0");
            q.offer("1");
            q.offer("2");
            q.offer("3");
            q.offer("4");
            System.out.println(q);

            while (!st.empty()) {
                System.out.println(st.pop());
            }
            System.out.println(st);

            while (!q.isEmpty()) {
                System.out.println(q.poll());
            }
    }
}
