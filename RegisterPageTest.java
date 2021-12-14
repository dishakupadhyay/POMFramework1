package com.demo.nopcommerce.tests;

import com.demo.nopcommerce.base.BasePage;
import com.demo.nopcommerce.pages.RegisterPage;
import com.demo.nopcommerce.utils.Constants;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Properties;

public class RegisterPageTest {

    BasePage basePage;
    WebDriver driver;
    Properties prop;
    RegisterPage registerPage;

    @BeforeTest
    public void openBrowser() throws InterruptedException {
        basePage = new BasePage();
        prop = basePage.initialiseProperties();
        String webEngine = prop.getProperty("browser");
        driver = basePage.initialiseDriver(webEngine);
        driver.get(prop.getProperty("url"));
       driver.get(prop.getProperty("urlreg"));
        registerPage = new RegisterPage(driver);

    }


    @Test(priority=1)
    public void verifyRegisterPageTitleTest() throws InterruptedException {
        String rpTitle = registerPage.getRegisterPageTitle();
        System.out.println(rpTitle);
        Assert.assertEquals(rpTitle, Constants.REGISTER_PAGE_TITLE,"RegisterPage title is missing");
    }

    @Test(priority = 2)
    public void verifyConfirmPasswordTest() throws InterruptedException{
        Assert.assertTrue(registerPage.isConfirmPasswordColumnPresent(),"Confirm Password column missing");
    }

    @Test(priority = 3)
    public void registerTest() throws InterruptedException{
        registerPage.doRegister(prop.getProperty("firstname"), prop.getProperty("lastname"),
                prop.getProperty("day"),prop.getProperty("month"), prop.getProperty("year"), prop.getProperty("Email")
                , prop.getProperty("cname"), prop.getProperty("pwd"), prop.getProperty("cpassword") );
    }
}