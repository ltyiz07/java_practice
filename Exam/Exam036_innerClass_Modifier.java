package Exam;

public class Exam036_innerClass_Modifier {
    private int outerIv = 0;
    static int outerCv = 0;

    class InstanceInner {
        int iiv = outerIv;
        int iiv2 = outerCv;
    }

    static class StaticInner {
//        int siv = outerIv;    //static class 는 외부 클래스의 인스턴스에 접근할 수 없다.
        static int scv = outerCv;
    }

    void myMethod() {
        int lv = 0;
        final int LV = 0;

        class LocalInner {
            int liv = outerIv;
            int liv2 = outerCv;
            int liv3 = lv;  //원칙은 Error 그런데 JDK1.8 부터는 에러가 아님 단 상수로 인정함.
//            lv += 3;  //lv 는 상수로 인정되어서 Error
        }
    }
}
