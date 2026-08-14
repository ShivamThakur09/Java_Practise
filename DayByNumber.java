package ShivamJava;

import java.util.Scanner;

public class DayByNumber {
    //Q: Write a program that takes a number from 1–7 and prints the corresponding day of the week using a switch statement.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean x=true;
        while (x){
            System.out.println("Enter Number from 1 to 7");
            System.out.print("Enter number : ");
            int n=sc.nextInt();
            switch (n){
                case 1: System.out.println("Sunday");
                break;
                case 2: System.out.println("Monday");
                break;
                case 3: System.out.println("Tuesday");
                break;
                case 4: System.out.println("Wednesday");
                break;
                case 5: System.out.println("Thrusday");
                break;
                case 6: System.out.println("Friday");
                break;
                case 7: System.out.println("Saturday");
                break;
                default: System.out.println("Enter a valid input...........");
            }
        }
    }
}
