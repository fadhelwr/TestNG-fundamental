package com.juaracoding;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {

    Login login;

    @BeforeClass
    public void setUp(){
        login = new Login();
    }

    //positive
    @Test(priority = 1)
    public void testLoginValid(){
        String actual = login.loginUser("admin","123456");
        String expected = "Login berhasil";
        Assert.assertEquals(actual,expected);

    }

    //negatif
    @Test(priority = 2)
    public void testLoginInvalid(){
        String actual = login.loginUser("invalid","123456");
        String expected = "Invalid login";
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testShowLogo(){
        Assert.assertTrue(login.showLogo("C:\\Picture\\image.png"));
    }
}
