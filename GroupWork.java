import java.util.Scanner;

public class GroupWork   {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       System.out.println("\nCOLLABORATIVE CALCULATOR");
        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
       
        // Calling methods from Calculator.java
        System.out.println("Remainder: " + Calculator.mod(num1, num2));  // Group 5's method

    }
}