import java.util.Scanner;

public class Area_Perimeter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter rectangle length: ");
		double length = scanner.nextDouble();
		System.out.print("Enter rectangle width: ");
		double width = scanner.nextDouble();
		System.out.print("Enter circle radius: ");
		double radius = scanner.nextDouble();

		double rectangleArea = length * width;
		double rectanglePerimeter = 2 * (length + width);
		double circleArea = Math.PI * radius * radius;

		System.out.println("Rectangle area: " + rectangleArea);
		System.out.println("Rectangle perimeter: " + rectanglePerimeter);
		System.out.println("Circle area: " + circleArea);

		scanner.close();
	}
}
