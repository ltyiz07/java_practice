package young_lee;

class Product {
    int price;
    int bonusPoint;

    Product () {};
    Product (int price) {
        this.price = price;
        bonusPoint = (int) (price/10.0);    //10% of bonus point product.
    }
}

class Tv1 extends Product {
    Tv1 () {
        super(100);
    }

    public String toString() { return "tv buy"; }
}

class Computer extends Product {
    Computer () {
        super(200);
    }
}

class Audio extends Product {
    Audio() {
        super(50 );
    }
    public String toString() { return "but Audio"; }
}

class Buyer {
    int money = 1000;
    int point = 0;

    public void buy (Product p) {
        if ( money < p.price ) {
             System.out.println("Not enough money");
             return;
        }
        this.money -= p.price;
        this.point += p.bonusPoint;
    }
}

public class Exam016 {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        Tv1 t = new Tv1();

        // product t 앞에 (Product) 가 생략 가능한 이유는 Product 가 Tv1 의 조상이기 때문이다.
        b.buy(t);
        b.buy(new Computer());

        System.out.println("current" + b.money);
    }
}
