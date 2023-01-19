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
}
