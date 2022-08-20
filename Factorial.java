package com.recursionPractice;

import java.math.BigInteger;

public class Factorial {

    public static void main(String[] args) {
        System.out.println( calculateFactorial(new BigInteger("100")));
    }

    public static BigInteger calculateFactorial(BigInteger limit){
        if(limit.equals(BigInteger.ZERO)) return BigInteger.ONE;

        return limit.multiply(calculateFactorial(limit.subtract(BigInteger.ONE)));

    }
}
