package com.example.in28minutes.helper;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class ArraysCompareTest {

    @Test
    public void testArraySort_RandomArray() {
        int[] number = { 98, 76, 54, 32 };
        int[] expected = { 32, 54, 76, 98 };

        Arrays.sort(number);

        assertArrayEquals(expected, number);
    }

    @Test
    public void testArraySort_NullArray() {
        int[] number = null;
        assertThrows(NullPointerException.class, () -> Arrays.sort(number));
    }
}