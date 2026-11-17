import java.util.Scanner;

public class CheckPrime {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		if (isPrime(n)) {
			System.out.println(n + " is prime.");
		} else {
			System.out.println(n + " is not prime.");
		}

		System.out.println("Primes up to " + n + ":");
		for (int number = 2; number <= n; number++) {
			if (isPrime(number)) {
				System.out.print(number + " ");
			}
		}
		System.out.println();
		scanner.close();
	}

	private static boolean isPrime(int number) {
		if (number < 2) {
			return false;
		}
		for (int divisor = 2; divisor <= number / divisor; divisor++) {
			if (number % divisor == 0) {
				return false;
			}
		}
		return true;
	}
}
