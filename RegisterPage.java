package com.demo.nopcommerce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
    WebDriver driver;


    //1. Creating page object/object repository in the form of By Locators.

    By email = By.id("Email");
    By password = By.id("Password");
    By genderButton = By.id("gender-female");
    By firstName = By.id("FirstName");
    By lastName = By.id("LastName");
    By birthDay = By.name("DateOfBirthDay");
    By birthMonth = By.name("DateOfBirthMonth");
    By birthYear = By.name("DateOfBirthYear");
    By companyName = By.id("Company");
    By newsLetter = By.id("Newsletter");
    By confirmPassword = By.id("ConfirmPassword");
    By register = By.className("ico-register");
    By reg = By.id("register-button");

    //2. Create constructor of Page class

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    //3. Page Actions/Page methods

    public String getRegisterPageTitle() throws InterruptedException {
        return driver.getTitle();
    }

    public boolean isConfirmPasswordColumnPresent() {
        return driver.findElement(confirmPassword).isDisplayed();
    }


    public void doRegister(String firstname,String lastname, String day, String month,String year,String Email,
                           String cname, String pwd,
                           String cpassword) throws InterruptedException {
        driver.findElement(register).click();
        Thread.sleep(3000);
        driver.findElement(genderButton).click();
        Thread.sleep(3000);
        driver.findElement(firstName).sendKeys(firstname);
        Thread.sleep(3000);
        driver.findElement(lastName).sendKeys(lastname);
        Thread.sleep(3000);
        driver.findElement(birthDay).sendKeys(day);
        Thread.sleep(2000);
        driver.findElement(birthMonth).sendKeys(month);
        Thread.sleep(2000);
        driver.findElement(birthYear).sendKeys(year);
        Thread.sleep(3000);
        driver.findElement(email).sendKeys(Email);
        Thread.sleep(3000);
        driver.findElement(companyName).sendKeys(cname);
        Thread.sleep(3000);
        driver.findElement(newsLetter).click();
        Thread.sleep(3000);
        driver.findElement(password).sendKeys(pwd);
        Thread.sleep(3000);
        driver.findElement(confirmPassword).sendKeys(cpassword);
        driver.findElement(reg).click();


    }
}