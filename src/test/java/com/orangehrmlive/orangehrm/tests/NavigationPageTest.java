package com.orangehrmlive.orangehrm.tests;

import com.aventstack.chaintest.plugins.ChainTestListener;
import com.orangehrmlive.orangehrm.pages.LoginPage;
import com.orangehrmlive.orangehrm.pages.NavigationPagePanel;
import com.orangehrmlive.orangehrm.utils.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ChainTestListener.class)
public class NavigationPageTest extends TestBase {

    //Write test cases
    @Test
    public void TC_01(){

        //User Login
        LoginPage loginpage = PageFactory.initElements(driver,LoginPage.class);
        loginpage.typeUsername("Admin");
        loginpage.typePassword("admin123");
        loginpage.clickLoginButton();

        //Verify MyInfo button
        NavigationPagePanel navigationPagePanel = PageFactory.initElements(driver, NavigationPagePanel.class);
        Assert.assertEquals(navigationPagePanel.IsDisplayedMyInfoButton(),true);
    }
}
