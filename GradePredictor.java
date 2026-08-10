package ConditionalFlow;

import java.util.Scanner;

public class GradePredictor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] subject = new int[5];
        System.out.println("Enter subject marks");

        for (int i = 0; i < 5; i++) {
            subject[i] = sc.nextInt();
        }

        int s1 = subject[0];
        int s2 = subject[1];
        int s3 = subject[2];
        int s4 = subject[3];
        int s5 = subject[4];
        
        sc.close();
    }
}
