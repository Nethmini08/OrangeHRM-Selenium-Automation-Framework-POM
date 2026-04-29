package com.orangehrmlive.orangehrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminPage {

    //01.Get all element need for test

    //Verify the UserManagementButton
    @FindBy (xpath = "//span[text()='Admin']")
    private WebElement lblUserManagement;

    //Click on Add Button
    @FindBy (xpath = "//button[.//text()=' Add ']")
    private WebElement btnAdd;

    //click dropdown for userRole
    @FindBy (xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[1]")
    private WebElement drpDownUserRole;

    //Set value for User role
    @FindBy (xpath = "(//span[text()='Admin'])[2]")
    private WebElement txtUserRole;

    //Set Value for EmployeeNameHint
    @FindBy (xpath = "//input[@placeholder='Type for hints...']")
    private WebElement txtHintEmployeeName;

    //Click EmployeeName
    @FindBy (xpath = "//span[text()='John David Smith']")
    public WebElement txtEmployeeName;

    //Set Value for StatusDropdown
    @FindBy (xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[2]")
    private WebElement drpDownStatus;

    //Set value for status
    @FindBy (xpath = "//span[text()='Enabled']")
    private WebElement txtStatus;

    //Set value username
    @FindBy (xpath = "(//div[2]/input)[1]")
    private  WebElement txtUsername;

    //Set value password
    @FindBy (xpath = "(//input[@type='password'])[1]")
    private WebElement txtPassword;

    //Set value ConfirmPassword
    @FindBy (xpath = "(//input[@type='password'])[2]")
    private WebElement txtConfirmPassword;

    //Click on Save Button
    @FindBy (xpath = "//button[@type='submit']")
    private WebElement BtnSave;


    //02.Write the Action method for element

    //Verify UserManagement
    public Boolean UserManagementButtonDisplay(){
        return lblUserManagement.isDisplayed();
    }

    //Click btnAdd
    public void ClickButtonAdd(){
        btnAdd.click();
    }

    //click dropdown for userRole
    public void ClickDropDownUserRole(){
        drpDownUserRole.click();
    }
    //value for userRole
    public void SetValueUserRole(){
       txtUserRole.click();
    }

    //value for EmployeeHintName
    public void SetValueEmployeeName(){
        txtHintEmployeeName.sendKeys("John Smith");
    }

    //value for EmployeeName
    public void ClickEmployeeName(){
        txtEmployeeName.click();
    }


    //value for statusDropdown
    public void ClickDropdownStatus(){
        drpDownStatus.click();
    }

    //value for status
    public void SetValueStatus(){
        txtStatus.click();
    }

    //value for username
    public void SetValueUsername(){
        // Generate a random number to make username unique
        int randomNum = (int)(Math.random() * 10000);
        String uniqueUsername = "Tharushi" + randomNum;
        txtUsername.sendKeys(uniqueUsername);
    }

    //value for password
    public void SetValuePassword(){
        txtPassword.sendKeys("Tst1234@");
    }

    //value for ConformPassword
    public void SetConfirmPassword(){
        txtConfirmPassword.sendKeys("Tst1234@");
    }

    //Click BtnSave
    public void ClickBtnSave(){
        BtnSave.click();
    }



}
