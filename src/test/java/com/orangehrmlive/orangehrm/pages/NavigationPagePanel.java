package com.orangehrmlive.orangehrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavigationPagePanel {

    //01.Get all element need for test
    @FindBy(linkText = "Leave")
    private WebElement btnLeave;

    //verify Nav myInfoButton
    @FindBy(linkText = "My Info")
    private WebElement NavMyInfo;

    //Verify NavAdmin Button
    @FindBy(linkText = "Admin")
    private WebElement NavAdmin;


    //02.Write the action method for element
    public void ClickButtonLeave(){
        btnLeave.click();
    }

    //Verify NavMyInfo
    public boolean IsDisplayedMyInfoButton(){
        return NavMyInfo.isDisplayed();
    }

    //Verify NavAdmin
    public void ClickButtonAdmin(){
        NavAdmin.click();
    }
}
