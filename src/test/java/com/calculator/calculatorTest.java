package com.calculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class calculatorTest 
{
    /**
     * Rigorous Test :-)
     */

     //Adding numbers

    @Test
    public void AddTwoNumbersTest()
    {
        assertEquals(3, calculator.addTwoNumbers(1, 2)); 
        assertEquals(-2, calculator.addTwoNumbers(-1, -1));
    }
    
    @Test
    public void AddMultipleNumbersTest(){
        assertEquals(15, calculator.addMultipleNumbers(1, 2, 3, 4, 5)); 
        assertEquals(3, calculator.addMultipleNumbers(1, 2)); 
        assertEquals(-2, calculator.addMultipleNumbers(-1, -1));
    }

    //Multiplying numbers

    @Test
    public void MultiplyTwoNumbersTest()
    {
        assertEquals(3, calculator.MultiplyTwoNumbers(1, 3)); 
        assertEquals(-3, calculator.MultiplyTwoNumbers(-1, 3));
    }

    @Test
    public void MultiplyMultipleNumbersTest(){
        assertEquals(120, calculator.MultiplyMultipleNumbers(1, 2, 3, 4, 5)); 
        assertEquals(3, calculator.MultiplyMultipleNumbers(1, 3)); 
        assertEquals(3, calculator.MultiplyMultipleNumbers(-1, -3));
    } 
}
