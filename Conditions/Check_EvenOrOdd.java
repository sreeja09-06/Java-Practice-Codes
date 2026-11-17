import java.util.*;
public class Check_EvenOrOdd {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		if (!scanner.hasNextInt()) {
			System.out.println("Invalid input");
			scanner.close();
			return;
		}
		int number = scanner.nextInt();

		if (number % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}

		scanner.close();
	}
}
