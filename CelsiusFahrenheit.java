package company;
import  java.util.Scanner;
public class CelsiusFahrenheit {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter value for Celsius to Fahrenheit : ");
        float c=sc.nextFloat();
        System.out.print("/nEnter value for Fahrenheit to Celsius : ");
        float f=sc.nextFloat();

        float celsius;
        celsius=(c*9/5)+32;
        float fahrenheit;
        fahrenheit= (f - 32)*5/9;
        System.out.println(" Celsius to Fahrenheit : "+ celsius);
        System.out.println("Fahrenheit to Celsius : "+ fahrenheit);
    }
}
