package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    WebDriver driver;

    By myAccount = By.className("ico-account");
    By logout = By.className("ico-logout");

    public HomePage(WebDriver driver){
        this.driver=driver;
    }

    public String getHomePageTitle(){
        return driver.getTitle();
    }

    public boolean isLogOutLinkPresent(){
        return driver.findElement(logout).isDisplayed();
    }
    public String getLogOutText(){
        return driver.findElement(logout).getText();
    }
    public boolean isMyAccountPresent(){
        return driver.findElement(myAccount).isDisplayed();
    }
    public String getMyAccountText(){
        return driver.findElement(myAccount).getText();
    }
}
