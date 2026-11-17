import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		long first = 0;
		long second = 1;

		for (int i = 0; i < n; i++) {
			System.out.print(first);
			if (i < n - 1) {
				System.out.print(" ");
			}

			long next = first + second;
			first = second;
			second = next;
		}

		sc.close();
	}
}
