package com.company;

public class UnaryOperator {
    public static void main(String[] args) {
        int x=10;
        int y=10;

        System.out.println("Actual Number: "+x);
        System.out.println("Post Increment Number: "+(x++));
        System.out.println("Now Post Increment Number: "+x);
        System.out.println("Pre Increment Number: "+(++x)+"\n");

        System.out.println("Actual Number: "+y);
        System.out.println("Post Decrement Number: "+(y--));
        System.out.println("Now Post Decrement Number: "+y);
        System.out.print("Pre-decrement Number: "+(--y));
    }
}
