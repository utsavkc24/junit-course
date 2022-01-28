package com.example.in28minutes.helper;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/*
 * Console Output
 * Before running each test
 * Test 1 is running...
 * Before running each test
 * Test 2 is running...
 * 
 */

public class QuickBeforeAfterTest {

    @BeforeEach
    public void beforeEach() {
        System.out.println("Before running each test");
    }

    @Test
    public void test1() {
        System.out.println("Test 1 is running...");
    }

    @Test
    public void test2() {
        System.out.println("Test 2 is running...");
    }

}