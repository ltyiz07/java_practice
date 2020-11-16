public
public class test {
    public static void main(String[] args) {
        int a = 2147483647;
        String ab = Integer.toBinaryString(a);
        Integer b = a;
        System.out.println(b.longValue());
        System.out.println(a);
        System.out.println(a + 1);
        System.out.printf("%s\n", Integer.toBinaryString(a));
        System.out.println(ab.length());
        for (int i = 0; i < 50; i++) {
            System.out.print('*');
        }; System.out.println('\n');

        String first = new String("apple");
        String second = "apple";
        String third = new String("apple");

        System.out.println(first);
        System.out.println(second);
        if (first == second) {
            System.out.println("first == second");
        } else if (second == third) {
            System.out.println("second == third");
        }

        for (int i = 0; i < 50; i++) {
            System.out.print('*');
        }; System.out.println('\n');



    }
}
