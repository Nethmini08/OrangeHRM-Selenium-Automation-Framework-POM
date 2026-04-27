package com.orangehrmlive.orangehrm.tests;

import com.aventstack.chaintest.plugins.ChainTestListener;
import com.orangehrmlive.orangehrm.pages.DashboardPage;
import com.orangehrmlive.orangehrm.pages.LeavePage;
import com.orangehrmlive.orangehrm.pages.LoginPage;
import com.orangehrmlive.orangehrm.pages.NavigationPagePanel;
import com.orangehrmlive.orangehrm.utils.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ChainTestListener.class)
public class DashboardPageTest extends TestBase {

    //01.Write test cases
    @Test
    public void TC_01() {
        //User Login
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.typeUsername("Admin");
        loginPage.typePassword("admin123");
        loginPage.clickLoginButton();

        //verify the dashboard Text
        DashboardPage dashboardpage = PageFactory.initElements(driver, DashboardPage.class);
        Assert.assertEquals(dashboardpage.getDashboardText(), "Dashboard");

    }

    @Test
    public void TC_02(){
        //User Login
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.typeUsername("Admin");
        loginPage.typePassword("admin123");
        loginPage.clickLoginButton();

        //Click Leave Button
        NavigationPagePanel navigationPagePanel = PageFactory.initElements(driver,NavigationPagePanel.class);
        navigationPagePanel.ClickButtonLeave();

        //Verify Assign leave
        LeavePage leavePage = PageFactory.initElements(driver,LeavePage.class);
        Assert.assertEquals(leavePage.AssignLeaveButtonDisplay(),false);

    }

}
