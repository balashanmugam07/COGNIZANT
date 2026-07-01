package com.cognizant;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AAAExampleTest {

    private StringUtils utils;

    @Before
    public void setup() {

        System.out.println("Setup");

        utils = new StringUtils();

    }

    @Test
    public void testReverse() {

        // Arrange
        String input = "Java";

        // Act
        String result = utils.reverse(input);

        // Assert
        assertEquals("avaJ", result);

    }

    @After
    public void tearDown() {

        System.out.println("Teardown");

    }

}