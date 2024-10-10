package com.juaracoding;

import com.juaracoding.login.Login;
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

    @Test(priority = 3)
    public void testShowLogo(){
        Assert.assertTrue(login.showLogo("C:\\Picture\\image.png"));
    }

    @Test(priority = 4)
    public void testForgotPassword(){
        String actual = login.forgotPassword("admin","654321","654321","654321");
        String expected = "Password berhasil diubah";

        Assert.assertEquals(actual,expected);
    }
}
