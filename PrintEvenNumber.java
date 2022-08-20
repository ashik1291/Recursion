package com.recursionPractice;

public class PrintEvenNumber {
    static final int LIMIT = 20;

    public static void main(String[] args) {
        printEven(LIMIT);
    }

    public static void printEven(int limit){
        if(limit == 0) return;
        printEven(limit - 2);
        System.out.println(limit);
    }
}
