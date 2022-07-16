package com.bsamuel.exercise.string;

public class DigitsOnly {
    public static void main(String[] args) {

    }

    public boolean digitsOnly(String str) {

        for (int i=0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i)))
                return false;
        }
        return true;
    }
}
