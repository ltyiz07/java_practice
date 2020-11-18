package young_lee;

class Car {
    String color;
    int door;
    int counter = 0;
    static int wheel  = 4;

    void drive() {
        System.out.println("Drive zzzz");
        counter += 1;
    }

    void stop() {
        System.out.println("Stop!");
    }
}

class fireEngine extends Car {
    int counter_fire = 0;
    void water() {
        System.out.println("Spray water");
        counter_fire += 1;
    }
}

public class Exam015_class_exam01 {
    public static void main(String[] args) {
        Car car = null;
        Car Car1 = new Car();
        fireEngine fe = new fireEngine();
        fireEngine fe2 = null;

        fe.water();
        car = (Car) fe;
        car.drive();

    }
}
