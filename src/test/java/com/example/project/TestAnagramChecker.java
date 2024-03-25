package com.example.project;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestAnagramChecker {

    @Test
    public void testAreAnagrams() {
        AnagramChecker checker = new AnagramChecker();
        assertTrue(checker.areAnagrams("listen", "silent"));
        assertFalse(checker.areAnagrams("hello", "world"));
        assertTrue(checker.areAnagrams("anagram", "nag a ram"));
    }

}
