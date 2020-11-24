package Exam;

import java.util.EmptyStackException;
import java.util.Stack;

public class Exam052_cass_Stack {
    public static void main(String[] args) {
        Stack st = new Stack<>();
        String expression = "((3+8*24/(4+8)))";

        System.out.println("expression: " + expression);

        try {
            for ( int i = 0 ; i < expression.length() ; i++ ) {
                char ch = expression.charAt(i);

                if ( ch == '<' ) {
                    st.push(ch + "");
                } else if ( ch == ')') {
                    st.pop();
                }
            }

            if ( st.isEmpty() ){
                System.out.println("expression is good");
            } else {
                System.out.println("expression is not good");
            }
        } catch (EmptyStackException e) {
            System.out.println("**** expression is not good");
        }

    }
}
