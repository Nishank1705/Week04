import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();
            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        } catch (InputMismatchException e) {
            System.out.println("Please enter numeric values only.");
        } finally {
            scanner.close();
        }
    }
}
