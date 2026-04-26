package com.orangehrmlive.orangehrm.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class TestBase {

    //01. Create public web instance
    public WebDriver driver;

    //02.Open Browser
    @BeforeMethod
    public void OpenBrowser(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    //03.Close Browser
    @AfterMethod
    public void CloseBrowser(){
        driver.close();
    }
}
