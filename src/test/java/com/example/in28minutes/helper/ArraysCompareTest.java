package com.example.in28minutes.helper;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

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

    // This method test whether this loop run under a alloted time(Using @Timeout)
    @Test
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    public void testSort_Performance() {
        int[] array = { 1, 2, 3, 5, 7 };
        for (int i = 0; i < 100000; i++) {
            array[0] = (int) new Random().nextInt(1000);
            Arrays.sort(array);
        }
    }
}