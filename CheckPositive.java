package company;

import java.util.Scanner;

public class CheckPositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a value to check if it is Positive, negative or Zero: ");
        int data = sc.nextInt();

        // Nested ternary operator logic
        String result = (data > 0) ? "Positive" : (data == 0) ? "Zero" : "Negative";

        System.out.println(result);
        
        sc.close(); // Good practice to close the scanner
    }
}
