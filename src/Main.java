import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Change this number to test different cases (e.g., 9, 10, 15, or 7)
        int number = 0;
        while (true) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");

        // Read the integer input
        number = scanner.nextInt();


        // 1. MUST check if divisible by BOTH 3 and 5 first
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("FIZZBUZZ");
        }
        // 2. Check if divisible by 3 only
        else if (number % 3 == 0) {
            System.out.println("FIZZ");
        }
        // 3. Check if divisible by 5 only
        else if (number % 5 == 0) {
            System.out.println("BUZZ");
        }
        // Optional: Print the number itself if it doesn't match any of the rules
        else {
            System.out.println(number);
        }}
    }
}