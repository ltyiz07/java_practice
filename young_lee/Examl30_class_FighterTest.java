package young_lee;

abstract class UnitA {
    int x, y;
    abstract void move(int x, int y);

    void stop() {
        System.out.println("Stop!");
    }
}

interface Fightable {
    void move(int x, int y);    // public abstract 가 생략되어 있음.
    void attack(Fightable f);
}

class Fighter extends UnitA implements Fightable {
    // 오버라이딩 규칙 위반: 오버라이딩 조건 2전째에 접근제어자의 범위가 좁아져서는 안된다. 여기 default로 제한됨.
    public void move(int x, int y) {
        System.out.println("[" + x + ", " + y + "] 좌표로 이동!");
    }
    public void attack(Fightable f) {
        System.out.println("Attack " + f);
    }
    Fightable getFightable() {
        Fighter f = new Fighter();
        return f;
    }
}

public class Examl30_class_FighterTest {
    public static void main(String[] args) {
        System.out.println("hello");

        Fighter f = new Fighter();
        f.move(200, 200);
        f.stop();
        f.attack(new Fighter());

    }
}
