package com.orangehrmlive.orangehrm.tests;

import com.aventstack.chaintest.plugins.ChainTestListener;
import com.orangehrmlive.orangehrm.pages.LoginPage;
import com.orangehrmlive.orangehrm.utils.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ChainTestListener.class)
public class LoginPageTest extends TestBase {

    private static final Logger log = LoggerFactory.getLogger(LoginPageTest.class);

    //01 write test case
    @Test
    public void TC_01(){
        LoginPage loginpage = PageFactory.initElements(driver,LoginPage.class);
        loginpage.typeUsername("Admin");
        loginpage.typePassword("123");
        loginpage.clickLoginButton();
        Assert.assertEquals(loginpage.getErrorMessageText(),"Invalid credentials");
    }

    @Test
    public void TC_02(){
        LoginPage loginpage = PageFactory.initElements(driver,LoginPage.class);
        loginpage.typeUsername("User 01");
        loginpage.typePassword("12345");
        loginpage.clickLoginButton();
        Assert.assertEquals(loginpage.loginButtonDisplay(),true);
    }

    @Test
    public void TC_03() {
        LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
        loginpage.typeUsername("User 03");
        loginpage.typePassword("");
        loginpage.clickLoginButton();
        Assert.assertEquals(loginpage.getRequiredErrorMessage(), "Required");
    }

}
