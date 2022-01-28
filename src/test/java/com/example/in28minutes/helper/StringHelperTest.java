package com.example.in28minutes.helper;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class StringHelperTest {

    private StringHelper stringHelper = new StringHelper();

    @Test
    public void testTruncateAInFirst2Positions() {
        assertEquals(stringHelper.truncateAInFirst2Positions("AACD"), "CD"); // assertMethod() test expected value with
                                                                             // acutal value.
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_NegativeScenario() {
        assertFalse(stringHelper.areFirstAndLastTwoCharactersTheSame("ABABC"));
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_PositiveScenario() {
        assertTrue(stringHelper.areFirstAndLastTwoCharactersTheSame("ABAB"));
    }

}