package com.orangehrmlive.orangehrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeavePage {
    //01.Get all element need for test

    //Verify assign leave button
    @FindBy (linkText = "Assign Leave")
    private WebElement lblAssignLeave;

    //02.Write the action method for element

    //Verify assign leave button
    public boolean AssignLeaveButtonDisplay(){
        return lblAssignLeave.isDisplayed();
    }
}

