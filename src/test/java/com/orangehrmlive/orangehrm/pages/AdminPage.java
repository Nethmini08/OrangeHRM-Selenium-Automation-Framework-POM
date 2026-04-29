package com.orangehrmlive.orangehrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminPage {

    //01.Get all element need for test

    //Verify the UserManagementButton
    @FindBy (xpath = "//span[text()='Admin']")
    private WebElement lblUserManagement;

    //02.Write the Action method for element

    //Verify UserManagement
    public Boolean UserManagementButtonDisplay(){
        return lblUserManagement.isDisplayed();
    }

}
