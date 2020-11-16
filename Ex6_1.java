public class Ex6_1 {
    public static void main(String args[]) {
        Radio radio1;
        radio1 = new Radio();
        radio1.power();
        radio1.channel = 3;
        radio1.counting();
        Radio radio2 = new Radio();
        radio2.power();
        radio2.channel = 55;
        radio2.counting();

        if ( radio1.power == true ) {
            System.out.print("====power is On");
            System.out.print("\t channel is " + radio1.channel);
            System.out.print("    " + radio1.counter);
        }
        else {
            System.out.print("power is Down");
        }
    }
}

class Radio {

    static int counter = 0;

    String version;
    boolean power = false;
    int channel;
    int volume;

    void power() { power = !power; }
    void channelUp() { ++channel; }
    void channelDown() { --channel; }
    void counting() { ++counter; }
}