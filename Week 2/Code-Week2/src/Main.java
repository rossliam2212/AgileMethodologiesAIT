import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1, num2, num3, result;

        System.out.print("Enter the first number: ");
        num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        num3 = scanner.nextInt();

        if (num1 > 0 && num2 > 0 && num3 > 0) {
            result = num1 * num2 * num3;
            System.out.println("\nResult: " + result);
        }
        else
            System.out.println("\nInvalid values");
    }
}
