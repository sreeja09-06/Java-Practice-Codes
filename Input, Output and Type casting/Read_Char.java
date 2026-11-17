import java.util.Scanner;

public class Read_Char {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
		char character = scanner.next().charAt(0);
		System.out.println((int) character);

		int number = scanner.nextInt();
		System.out.println((char) number);

		scanner.close();
	}
}
