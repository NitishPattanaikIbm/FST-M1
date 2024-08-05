package com.example.fst_m1_junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;

public class Activity1 {
    ArrayList<String> list;

    @BeforeEach
    public void setUp() {
        list = new ArrayList<>();
        list.add("Value1");
        list.add("Value2");
    }

    @Test
    public void insertTest() {
        // Check the initial size of the ArrayList
        Assertions.assertEquals(2, list.size(), "Size should be 2");

        // Add a new value to the list
        list.add("Value3");

        // Check the size after insertion
        Assertions.assertEquals(3, list.size(), "Size should be 3");

        // Check the values in the ArrayList
        Assertions.assertEquals("Value1", list.get(0), "First element should be 'Value1'");
        Assertions.assertEquals("Value2", list.get(1), "Second element should be 'Value2'");
        Assertions.assertEquals("Value3", list.get(2), "Third element should be 'Value3'");
    }

    @Test
    public void replaceTest() {
        // Check the initial size of the ArrayList
        Assertions.assertEquals(2, list.size(), "Size should be 2");

        // Add a new value to the list
        list.add("Value3");

        // Check the size after insertion
        Assertions.assertEquals(3, list.size(), "Size should be 3");

        // Replace the value at index 1
        list.set(1, "NewValue");

        // Check the values in the ArrayList
        Assertions.assertEquals("Value1", list.get(0), "First element should be 'Value1'");
        Assertions.assertEquals("NewValue", list.get(1), "Second element should be 'NewValue'");
        Assertions.assertEquals("Value3", list.get(2), "Third element should be 'Value3'");
    }
}
