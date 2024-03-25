package com.example.project;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFibonacciSeries {

    @Test
    public void testGenerateFibonacciSeries() {
        FibonacciSeries series = new FibonacciSeries();
        List<Integer> result = series.generateFibonacciSeries(10);
        assertEquals(Arrays.asList(0, 1, 1, 2, 3, 5, 8), result);
    }

}
