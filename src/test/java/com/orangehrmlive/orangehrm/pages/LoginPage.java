package com.orangehrmlive.orangehrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;

public class LoginPage {

    //01.Get All elements need for test cases
    @FindBy (name="username")
    private WebElement txtUsername;

    @FindBy(name="password")
    private WebElement txtPassword;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement btnLogin;

    //add verification part
    @FindBy(xpath = "//p[text()='Invalid credentials']")
    private WebElement lblErrorMessage;

    //getting required msg
    @FindBy(xpath = "//span[text()='Required']")
    private WebElement lblRequiredErrorMessage;

    //02.write the action method for elements
    public void typeUsername(String UsernameText){
        txtUsername.sendKeys(UsernameText);}

    public void typePassword(String PasswordText){
        txtPassword.sendKeys(PasswordText);
    }

    public void clickLoginButton(){
        btnLogin.click();
    }

    //verify error message
    public String getErrorMessageText(){
       return lblErrorMessage.getText();
    }

    //display login button
    public boolean loginButtonDisplay(){
       return btnLogin.isDisplayed();
    }

    //verify requiredErrorMessage
    public String getRequiredErrorMessage(){
       return lblRequiredErrorMessage.getText();
    }
}
