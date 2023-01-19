package com.example.romannumerals;

public class RomanConvertor {
    public static String convert(int arabic) {
        StringBuilder romanNumeral = new StringBuilder();
        for(int i=0;i<arabic;i++) {
            romanNumeral.append("I");
        }
        return romanNumeral.toString();
    }
}
