import java.util.*;

public class Read_Double {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a double value: ");
		double value = scanner.nextDouble();
		System.out.println((int) value);
		scanner.close();
	}
}
