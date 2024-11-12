package com.clerodri;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailValidatorTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void isValid() {
    }

    @Test
    void isValidEmail() {
    }

    @Test
    public void ensureThatEmailValidatorReturnsTrueForValidEmail() {
        assertTrue(EmailValidator.isValidEmail("lars.vogel@gmail.com"));
    }

    @Test
    @DisplayName("Ensure that the usage of a subdomain is still valid, see https://en.wikipedia.org/wiki/Subdomain")
    public void emailValidator_CorrectEmailSubDomain_ReturnsTrue() {
        String mainDomain="example.com";
        String mysubdommain="shop.example.com";
        assertTrue(EmailValidator.isValidSubDomain(mainDomain,mysubdommain));

    }
}