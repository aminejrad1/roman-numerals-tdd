package com.example.romannumerals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanNumeralsApplicationTests {
    @Test
    void testWithNumberIs1() {
        assertEquals("I", RomanConvertor.convert(1));
    }
}
