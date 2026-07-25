package company;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter value to check odd or even : ");
        int value= sc.nextInt();

        String result = (value & 1)==0 ? "even":"odd";

        System.out.println(result);
    }
}
