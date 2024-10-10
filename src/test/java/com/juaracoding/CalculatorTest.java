package com.juaracoding;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CalculatorTest {

    //Calculator calculator;

    /**@BeforeClass
    public void setUp(){
        calculator = new Calculator();
    }**/

    @Test
    public void testAdd(){
        //int actual;

        Calculator calculator = new Calculator();
        int actual = calculator.add(10,5);
        int expected = 15;

        Assert.assertEquals(actual,expected);
    }

}
