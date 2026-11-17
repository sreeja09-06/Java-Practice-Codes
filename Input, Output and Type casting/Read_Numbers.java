import java.util.*;

class Read_Numbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
		double first = scanner.nextDouble();
		double second = scanner.nextDouble();

		System.out.println("Sum: " + (first + second));
		System.out.println("Difference: " + (first - second));
		System.out.println("Product: " + (first * second));
		if (second != 0) {
			System.out.println("Quotient: " + (first / second));
		} else {
			System.out.println("Quotient: undefined (division by zero)");
		}

		scanner.close();
	}
}
