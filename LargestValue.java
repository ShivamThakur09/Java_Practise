package company;
import java.util.Scanner;

public class LargestValue {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Input 3 number to check which is greater.");
        System.out.println("Enter value below: ");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();

        int result;
        result= (a>b)? (a>c)? a:c: (b>c)? b:c;

        System.out.println(result+" Largest");
    }
}
