package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAdd() {
        AddCalculator calculator = new AddCalculator();
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    public void testSubtract() {
        AddCalculator calculator = new AddCalculator();
        assertEquals(1, calculator.subtract(4, 3));
    }
}
