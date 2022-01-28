package com.example.in28minutes.helper;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/*
  * Console Output
  * Test 1 is running...
  * After running each test
  * Test 2 is running...
  * After running each test
  * 
  * 
  */
public class QuickBeforeAfterTest {

    @AfterEach
    public void afterach() {
        System.out.println("After running each test");
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