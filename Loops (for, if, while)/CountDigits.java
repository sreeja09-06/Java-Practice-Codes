import java.util.Scanner;

public class CountDigits {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long number = scanner.nextLong();

		int count = 0;
		do {
			count++;
			number /= 10;
		} while (number != 0);

		System.out.println(count);
		scanner.close();
	}
}
