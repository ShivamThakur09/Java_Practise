package company;
import  java.util.Scanner;
public class MinuteHour {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.print("Enter minute to convert in hour and minute : ");
        int x=scanner.nextInt();

        int hour= x/60;
        int minute = x%60;

        System.out.println("Output is "+hour+" Hour "+minute+" minutes.");
    }
}
