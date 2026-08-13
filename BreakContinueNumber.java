package ShivamJava;
//Q: Print all numbers from 1 to 50, but skip multiples of 3 and stop completely if the number exceeds 40.
public class BreakContinueNumber {
    public static void main(String[] args){
        for(int i=1; i<=50; i++){

            if(i%3==0){
                continue;
            }
            if(i>40){
                break;
            }
            System.out.println(i);
        }
    }
}
