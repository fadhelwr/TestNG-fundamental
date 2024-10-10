package com.juaracoding;

import org.testng.Assert;
import org.testng.annotations.*;


public class ProcedureTest {
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method");
    }

    @Test(priority = 1)
    public void testOne(){
        System.out.println("Test One");
    }

    @Test(priority = 2, enabled = false)
    public void testTwo(){
        System.out.println("Test Two");
    }

    @Test(priority = 3)
    public void testThree(){
        System.out.println("Test Two");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("After Method");
    }

    @AfterClass
    public void finish(){
        System.out.println("After Class");
    }


}
