
import java.util.*;
public class Check_Character {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        if (!scanner.hasNext()) {
            System.out.println("Invalid input");
            scanner.close();
            return;
        }
        char ch = scanner.next().charAt(0);

        if (Character.isLetter(ch)) {
            if (Character.isUpperCase(ch)) {
                System.out.println("Uppercase letter");
            } else {
                System.out.println("Lowercase letter");
            }
        } else if (Character.isDigit(ch)) {
            System.out.println("Digit");
        } else {
            System.out.println("Special character");
        }

        scanner.close();
    }
}