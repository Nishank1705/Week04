import java.util.Scanner;

public class NestedTryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();
            int[] array = new int[size];
            
            System.out.println("Enter the elements of the array: ");
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }

            System.out.print("Enter the index to retrieve the value: ");
            int index = scanner.nextInt();

            try {
                int value = array[index];

                System.out.print("Enter the divisor: ");
                int divisor = scanner.nextInt();

                try {
                    int result = value / divisor;
                    System.out.println("Result: " + result);
                } catch (ArithmeticException e) {
                    System.out.println("Cannot divide by zero!");
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid array index!");
            }
        } finally {
            scanner.close();
        }
    }
}
