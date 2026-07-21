package com.company;

public class LogicalOperator {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=30;

        if(a>b && a>c){
            System.out.println("A is greater in 3.");
        }
        else if(b>a && b>c){
            System.out.println("B is greater in 3.");
        }
        else if(c>a && c>b){
            System.out.println("C is greater in 3.");
        }
        else {
            System.out.println("It's mess-up in 3.");
        }
    }
}
