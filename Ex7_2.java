import java.awt.*;

public class Ex7_2 {
    public static void main(String[] args) {
        Child c = new Child();
        Baby b = new Baby();
        c.method();
        //아래의 메소드는 부르는 메소드가 Child 에 속해있어 가장 가까운 변수인 Child 에서 정의된 변수를 가져와 사용한다.
        //만일 Baby 에서 정의된 변수를 사용하고 싶다면 Baby 에서 method overriding 을 해주고 하용해야한다.
        b.method();
    }
}

class Parent extends Object
{ int x = 20; }

class Child extends Parent {

    int x = 10;
    void method() {
        System.out.println("x = " + x);
        System.out.println("this.x = " + this.x);
        System.out.println("super.x = " + super.x);

    }
}

class Baby extends Child {
    int x = 4;
}