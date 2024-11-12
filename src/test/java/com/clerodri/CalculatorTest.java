package com.clerodri;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Simple  multiplication should work")
    void testMultiply() {
        assertEquals(20,calculator.multiply(4,5), "Regular multiplication should work");
    }

    @RepeatedTest(5)
    @DisplayName("Ensure correct handling of zero")
    void testMultipleWithZero(){
        assertEquals(0, calculator.multiply(0,5),"Multiply with zero should work");
        assertEquals(0, calculator.multiply(5,0),"Multiply with zero should work");
    }
}