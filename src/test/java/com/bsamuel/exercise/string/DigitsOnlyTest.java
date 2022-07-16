package com.bsamuel.exercise.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DigitsOnlyTest {

    @Test
    public void TestDigitOnly() {
        DigitsOnly dOnly = new DigitsOnly();
        boolean result = dOnly.digitsOnly("Hellow World");
        assertEquals(false, result);

        result = dOnly.digitsOnly("1231212312331");
        assertEquals(true, result);

    }



}