package com.recursionPractice;

public class TowerOfHanoi {

    public static void main(String[] args) {
        towerOfHanoi(3,'A','C','B');
    }

    public static void towerOfHanoi(int tower, char source, char destination, char helper){
        if(tower == 0) return;

        towerOfHanoi(tower-1, source, helper, destination);
        System.out.println("Moving from "+source+" to "+destination);
        towerOfHanoi(tower-1,helper, destination, source );
    }
}
