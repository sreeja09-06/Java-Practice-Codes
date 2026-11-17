import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a non-negative integer: ");
		int number = scanner.nextInt();

		if (number < 0) {
			System.out.println(number + " is not an Armstrong number.");
		} else {
			int digitCount = String.valueOf(number).length();
			int remaining = number;
			long sum = 0;

			do {
				int digit = remaining % 10;
				long digitPower = 1;
				for (int i = 0; i < digitCount; i++) {
					digitPower *= digit;
				}
				sum += digitPower;
				remaining /= 10;
			} while (remaining > 0);

			if (sum == number) {
				System.out.println(number + " is an Armstrong number.");
			} else {
				System.out.println(number + " is not an Armstrong number.");
			}
		}

		scanner.close();
	}
}
