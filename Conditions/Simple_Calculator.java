import java.util.*;

public class Simple_Calculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter first number: ");
		double first = scanner.nextDouble();
		System.out.print("Enter an operator (+, -, *, /): ");
		char operator = scanner.next().charAt(0);
		System.out.print("Enter second number: ");
		double second = scanner.nextDouble();

		switch (operator) {
			case '+':
				System.out.println("Result: " + (first + second));
				break;
			case '-':
				System.out.println("Result: " + (first - second));
				break;
			case '*':
				System.out.println("Result: " + (first * second));
				break;
			case '/':
				if (second == 0) {
					System.out.println("Error: Cannot divide by zero.");
				} else {
					System.out.println("Result: " + (first / second));
				}
				break;
			default:
				System.out.println("Error: Invalid operator.");
		}

		scanner.close();
	}
}
