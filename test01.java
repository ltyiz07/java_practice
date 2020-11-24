public class test01 {
    public static void main(String[] args) {

        Cat cat = new Cat(3);
        Animal myCat = cat;

        cat.breath();
        myCat.breath();

        System.out.println(cat.age);
        System.out.println(myCat.age);

        cat.jump();
        if (cat == myCat) {
            System.out.println("SSSamememem");
        }


    }
}

class Animal {
    int age;

    Animal (int age) {
        this.age = age;
    }
    public void breath() {
        System.out.println("zzZZZZ");
    }
}


class Cat extends Animal {
    public void breath() {
        System.out.println("mmewwwww");
    }

    public void jump() {
        System.out.println("jjjummmpppp");
    }
    Cat (int age) {
        super(age);
    }
}
