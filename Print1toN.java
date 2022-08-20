package com.recursionPractice;

public class Print1toN {
    public static void main(String[] args) {
        print1toN(20);
    }

    public static void print1toN(int limit){
        if(limit == 0)
            return;
        print1toN(limit - 1);
        System.out.println(limit);
    }
}
