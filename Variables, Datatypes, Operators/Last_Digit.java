import java.util.Scanner;

class Last_Digit {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
		long number = scanner.nextLong();

		System.out.println("Last digit: " + (number % 10));
		System.out.println("Number without last digit: " + (number / 10));

		scanner.close();
	}
}
