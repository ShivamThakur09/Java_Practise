package ShivamJava;

public class LargestNumber {
    //Q: Write a program that takes three numbers as input and prints the largest among them

    public static void main(String[] args){
        int num1=32;
        int num2=19;
        int num3=21;

        if(num1>num2 && num1> num3){
            System.out.println("Num1 is bigger");
        }
        else if(num2>num1 && num2>num3) {
            System.out.println("Num2 is bigger");
        }
        else{
            System.out.println("Num3 is bigger");
        }
    }
}
