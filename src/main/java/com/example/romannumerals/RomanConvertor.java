package com.example.romannumerals;

public class RomanConvertor {
    public static String convert(int arabic) {
        StringBuilder romanNumeral = new StringBuilder();

        if(arabic>=10) {
            romanNumeral.append("X");
            arabic -= 10;
        }

        if(arabic>=5) {
            romanNumeral.append("V");
            arabic -= 5;
        }

        for(int i=0;i<arabic;i++) {
            romanNumeral.append("I");
        }
        return romanNumeral.toString();
    }
}
