import java.util.Scanner;

public class Simple_Interest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter principal: ");
		double principal = scanner.nextDouble();

		System.out.print("Enter annual interest rate (percent): ");
		double rate = scanner.nextDouble();

		System.out.print("Enter time (years): ");
		double time = scanner.nextDouble();

		double simpleInterest = principal * rate * time / 100;
		System.out.println("Simple interest: " + simpleInterest);

		scanner.close();
	}
}
