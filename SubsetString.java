package com.recursionPractice;

import java.nio.charset.Charset;
import java.util.Scanner;

public class SubsetString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        subset(input, "");
    }

    static void subset(String input, String resultString){

        if(input.length() == 0){
            System.out.println(resultString);
            return;
        }
        subset(input.substring(1), resultString);
        subset(input.substring(1), resultString+input.charAt(0));
    }
}
