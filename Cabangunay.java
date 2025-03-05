import java.util.Scanner;

public class Cabangunay {
    public static void display() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Hello! This is DelaCruz contributing to the project.");
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("My current age is: " + age);
        System.out.println("Next year, I will be: " + (age + 1));
        
        scanner.close();
    }
}
