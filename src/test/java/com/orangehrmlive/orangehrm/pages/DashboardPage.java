package com.orangehrmlive.orangehrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage {

    //01. Get all elements for test case
    @FindBy (xpath = "//h6[text()='Dashboard']")
    private WebElement lblDashboard;


    //02.write the action method for the element
    public String getDashboardText(){
        return lblDashboard.getText();
    }
}
