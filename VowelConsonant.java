package company;
import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Enter character here to check vowel or consonant : ");
        char ch=sc.next().charAt(0);


        String result= (ch== 'A' || ch == 'E' || ch== 'I' || ch=='O'|| ch=='U') ? "Vowel":"consonanat";
        System.out.println(result);
        
    }
}
