package com.juaracoding;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EmployeeTest {

    Employee employee;

    @BeforeClass
    public void setup(){
        employee = new Employee();
    }

    @Test
    public void testGetName(){
        employee.setName("Naomi");
        Assert.assertEquals(employee.getName(),"Naomi");
    }

    @Test
    public void testGetAddress(){
        employee.setAddress("Jakarta");
        Assert.assertEquals(employee.getAddress(),"Jakarta");
    }

    @Test
    public void testGetIsActive(){
        employee.setAcitve(true);
        Assert.assertTrue(employee.isActive());
    }

    @Test
    public void testGetSalary(){
        employee.setSalary(7000);
        Assert.assertEquals(employee.getSalary(),7000.0);
    }

    // negative test salary, exception
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testExceptionSalary(){
        employee.setSalary(-1);
    }
}
