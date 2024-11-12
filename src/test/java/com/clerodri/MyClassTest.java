package com.clerodri;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyClassTest {

    MyClass myClass;
    @BeforeEach
    void setUp() {
        myClass = new MyClass();
    }

    @Test
    @DisplayName("Testing bad arguments passed")
    void testExceptionIsThrown(){
        assertThrows(IllegalArgumentException.class,()->myClass.multiply(1000,5));
    }

    @Test
    @DisplayName("Testing if multiply works")
    void multiply() {
        assertEquals(2,myClass.multiply(10,5),"Dividee 10 /5 should be 2");
    }
}