public class Exam011_class_mywallet {
    public static void main(String[] args) {
        Wallet jojo = new Wallet("James", "LV", 2000);
        System.out.println("maker : " + jojo.brand);
        jojo.show_balance();
        Wallet from_ground = new Wallet();
        from_ground.pick_wallet();
        //todo
    }
}

class Wallet {
    String owner;
    String brand;
    private int balance;

    public Wallet() {
        this("Anonymous", "Market", 0);
    }
    public Wallet(String owner, String brand, int balance) {
        this.owner = owner;
        this.brand = brand;
        this.balance =balance;
    }
    public void show_balance() {
        System.out.println("balance :" + balance);
    }

    public void pick_wallet() {
        System.out.println("owner: " + this.owner + "\tbrand: " + this.brand + "\tbalance: " + this.balance);
    }
}