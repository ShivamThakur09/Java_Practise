package com.company;

public class TernaryOperator {
    public static void main(String[] args) {
        int a=10, b=20, c=30;
        int result;
        result=((a>b) ? (a>c)? a :c: (b>c)? b :c);
        System.out.println("Largest value is : "+result);
    }
}
