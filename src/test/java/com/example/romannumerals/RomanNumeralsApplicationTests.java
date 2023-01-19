package com.example.romannumerals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanNumeralsApplicationTests {
    @Test
    void testWithNumberIs1() {
        assertEquals("I", RomanConvertor.convert(1));
    }

    @Test
    void testWithNumberIs2() {
        assertEquals("II", RomanConvertor.convert(2));
    }

    @Test
    void testWithNumberIs3() {
        assertEquals("III", RomanConvertor.convert(3));
    }

    /*
    @Test
    void testWithNumberIs4() { assertEquals("IV", RomanConvertor.convert(4));}
     */

    @Test
    void testWithNumberIs5() { assertEquals("V", RomanConvertor.convert(5));}

    @Test
    void testWithNumberIs6() { assertEquals("VI", RomanConvertor.convert(6));}
}
