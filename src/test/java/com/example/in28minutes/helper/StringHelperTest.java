package com.example.in28minutes.helper;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StringHelperTest {

    private StringHelper stringHelper = new StringHelper();

    @Test
    public void testTruncateAInFirst2Positions() {
        assertEquals(stringHelper.truncateAInFirst2Positions("AACD"), "CD"); // assertMethod() test expected value with
                                                                             // acutal value.
    }

}