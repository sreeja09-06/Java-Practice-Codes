import java.util.*;

public class Check_number {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		if (!scanner.hasNextDouble()) {
			System.out.println("Invalid input");
			scanner.close();
			return;
		}
		double number = scanner.nextDouble();

		if (number > 0) {
			System.out.println("Positive");
		} else if (number < 0) {
			System.out.println("Negative");
		} else {
			System.out.println("Zero");
		}

		scanner.close();
	}
}
