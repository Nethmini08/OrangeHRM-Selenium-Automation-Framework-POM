package com.orangehrmlive.orangehrm.tests;

import com.orangehrmlive.orangehrm.pages.AdminPage;
import com.orangehrmlive.orangehrm.pages.LoginPage;
import com.orangehrmlive.orangehrm.pages.NavigationPagePanel;
import com.orangehrmlive.orangehrm.utils.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class AdminPageTest extends TestBase {
    //write test case
    @Test
    public void TC_01(){
        //User Login
        LoginPage loginpage = PageFactory.initElements(driver,LoginPage.class);
        loginpage.typeUsername("Admin");
        loginpage.typePassword("admin123");
        loginpage.clickLoginButton();

        //Click Admin Button
        NavigationPagePanel navigationPagePanel = PageFactory.initElements(driver,NavigationPagePanel.class);
        navigationPagePanel.ClickButtonAdmin();

        //Click on Add Button
        AdminPage adminPage = PageFactory.initElements(driver, AdminPage.class);
        adminPage.ClickButtonAdd();

        //Add User details
        adminPage.ClickDropDownUserRole();
        adminPage.SetValueUserRole();
        adminPage.SetValueEmployeeName();
        adminPage.ClickEmployeeName();
        adminPage.ClickDropdownStatus();
        adminPage.SetValueStatus();
        adminPage.SetValueUsername();
        adminPage.SetValuePassword();
        adminPage.SetConfirmPassword();

        //Click on Save Button
        adminPage.ClickBtnSave();
    }
}
