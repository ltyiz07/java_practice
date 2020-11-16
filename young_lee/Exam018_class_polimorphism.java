package young_lee;

abstract class Player { // 추상 클레스 : 추상 메서드가 한개라도 있어야 추상 클래스가 된다.
    abstract void play(int pos);    // 메서드 선언부만 있고 구현부(body)없는 것이 추상 메서드.
    abstract void stop();
}
// 추상 클래스는 상속을 통해서 그리고 메서드가 완성되어 책체가 인스턴스화가 된다.
class AudioPlayer extends Player {
    void play (int pos) {
        System.out.println(pos + "지점으로 부터 play합니다.");
    }
    void stop () {
        System.out.println("play 를 멈춤니다.");
    }
}

public class Exam018_class_polimorphism {
    public static void main(String[] args) {
        AudioPlayer ap = new AudioPlayer();
    }
}
