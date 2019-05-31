package com.johncross;

public class Main {

    public static void main(String[] args) {

        // char has witdth of 16 (2bytes)
        char myChar = '\u00A9';
        System.out.println("unicode output was: " + myChar);

        boolean myBoolean = false;
        boolean isMale = true;

        char myOtherChar = '\u00AE';
        System.out.println("unicode output was: " + myOtherChar);

    }
}
