package com.example.romannumerals;

public class RomanConvertor {
    private static final String[] romanNumerals = { "X", "IX", "V", "IV", "I" };
    private static final int[] arabicNumerals = { 10, 9,    5,   4,    1   };

    public static String convert(int arabic) {
        StringBuilder romanNumeral = new StringBuilder();
        int remaining = arabic;
        for(int i=0;i<arabicNumerals.length;i++) {
            remaining = appendMethod(remaining, arabicNumerals[i], romanNumerals[i], romanNumeral);
        }

        return romanNumeral.toString();
    }

    public static int appendMethod(int arabic, int number, String romanToAppend, StringBuilder romanNumeral) {
        int result = arabic;
        while (result >= number) {
            romanNumeral.append(romanToAppend);
            result -= number;
        }
        return result;
    }
}
