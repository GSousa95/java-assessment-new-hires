package com.example.project;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestPalindromeChecker {

    @Test
    public void testIsPalindrome() {
        PalindromeChecker checker = new PalindromeChecker();
        assertTrue(checker.isPalindrome("racecar"));
        assertFalse(checker.isPalindrome("hello"));
        assertTrue(checker.isPalindrome("A man, a plan, a canal, Panama"));
    }

}
