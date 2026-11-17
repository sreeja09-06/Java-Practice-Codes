import java.util.Scanner;

public class Read_Name {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		

		System.out.print("Enter your name: ");
		String name = scanner.nextLine();
		System.out.print("Enter your age: ");
		int age = scanner.nextInt();

		System.out.println("My name is " + name + " and I am " + age + " years old.");
		scanner.close();
	}
}
