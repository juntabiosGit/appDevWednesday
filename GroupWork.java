import java.util.Scanner;

public class GroupWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nCOLLABORATIVE CALCULATOR");
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        
        System.out.println("Quotient: " + Calculator.divide(num1, num2)); 

        scanner.close();
    }
}
