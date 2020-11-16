package young_lee;

public class Exam017_class_abstract_game {
    public static void main(String[] args) {
        Unit[] group = { new Marine(), new Tank(), new Dropship() };
        for (int i = 0; i < group.length; i++) {
            group[i].move(500, 500);
        }
    }
}


abstract class Unit {
    int x, y;
    abstract void move (int x, int y);
    void stop() {
        System.out.println("Stop at current position");
    }
}


class Marine extends Unit {
    void move (int x, int y) {
        System.out.println("Marine move to x: " + x + ", y: " + y);
        System.out.println("With Fooooootlol");
    }

    void stimPack() {
        System.out.println("it is kind of Drug");
    }
}

class Tank extends Unit {
    void move (int x, int y) {
        System.out.println("tank move heavily x: " + x + ", y: " + y);
        System.out.println("with heavy wheel");
    }
    void changeMode () {
        System.out.println("시즈모드, 일반모드 토글링");
    }
}

class Dropship extends Unit {
    void move (int x, int y) {
        System.out.println("airplane move x: " + x + ", y: " + y);
        System.out.println("with huge whings");

    }


}
