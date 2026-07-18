package com.company;

public class AssignmentOperator {
    public static void main(String[] args){
        int x=10;

        System.out.println("Addition is: "+(x+=2));
        System.out.println("Substraction is: "+(x-=5));// 10+2=12, It's uses updated value of x.
        System.out.println("Multipliaction is: "+(x*=10));
        System.out.println("division is: "+(x/=4));
        System.out.println("Mudulo is: "+(x%= 3));
    }
}
