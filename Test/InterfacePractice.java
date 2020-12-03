package Test;

public class InterfacePractice {
    public static void main(String[] args) {

        ThirdInterface t = new ThirdInterface();
        System.out.println(t.getA());
        System.out.println(t.getB());

        System.out.println(t.old());

   }
}

interface FirstInterface {
    int a = 1;
    String b = "First";

    default int getA () {
        return a;
    }

    public String getB();
}

interface SecondInterface extends FirstInterface {
    int a = 2;
    String b = "Second";

    default int getA () {
        return a;
    }
}

class ThirdInterface implements SecondInterface {
    int a = 3;
    String b = "Third";

    public String getB() {
        return b;
    }

    public String old() {
        return super.toString();
    }

}

