package Exam;

class Car {
    String color;
    String gearType;
    int door;

    Car() {}
    Car(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
        // 만일 local var 과 instance var 의 이름을 다르게한다면 this.
    }
}

public class Ex6_12 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.color = "white";
        c1.gearType = "auto";
        c1.door = 4;

        Car c2 = new Car("blue", "bar", 4);
        System.out.print("\nc1's color: " + c1.color + ", gearType: " + c1.gearType);
        System.out.print("\nc2's color: " + c2.color + ", gearType: " + c2.gearType);
    }

}
// 지갑만들기.