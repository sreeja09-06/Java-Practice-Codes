public class Swapping_Variables {
    public static void main(String[] args) {
        int a = 10, b = 20;
        int temp;

        System.out.println("Before swap using third variable:");
        System.out.println("a = " + a + ", b = " + b);

        temp = a;
        a = b;
        b = temp;

        System.out.println("After swap using third variable:");
        System.out.println("a = " + a + ", b = " + b);

        a = 30;
        b = 40;

        System.out.println("\nBefore swap without third variable:");
        System.out.println("a = " + a + ", b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swap without third variable:");
        System.out.println("a = " + a + ", b = " + b);
    }
}
