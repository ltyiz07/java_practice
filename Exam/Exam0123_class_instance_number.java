package Exam;

class Product {
    static int  count = 0;
    int serialNo;
    {
        ++count;
        serialNo = count;
    }
    public Product () {}
}
public class Exam0123_class_instance_number {

    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();

        System.out.println("p1's serial number: " + p1.serialNo);
        System.out.println("p2's serial number: " + p2.serialNo);
        System.out.println("p3's serial number: " + p3.serialNo);


    }

}