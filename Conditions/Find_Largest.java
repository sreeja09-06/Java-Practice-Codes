import java.util.*;

public class Find_Largest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Invalid input");
            scanner.close();
            return;
        }
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Invalid input");
            scanner.close();
            return;
        }
        double num2 = scanner.nextDouble();

        System.out.print("Enter the third number: ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Invalid input");
            scanner.close();
            return;
        }
        double num3 = scanner.nextDouble();

        double largest;

        if (num1 >= num2 && num1 >= num3) {
            largest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            largest = num2;
        } else {
            largest = num3;
        }

        System.out.println("The largest number is: " + largest);

        scanner.close();
    }
}