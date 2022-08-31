package com.easyrest.components.admin;

import com.easyrest.components.Calendar;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateModeratorAccountForm {
    private WebDriver driver;

    private final By nameField = By.xpath("//input[@name='name']");
    private final By emailField = By.xpath("//input[@name='email']");
    private final By phoneNumberField = By.xpath("//input[@name='phoneNumber']");
    private final By birthDateField = By.xpath("//input[@name='birthDate']");
    private final By passwordField = By.xpath("//input[@name='password']");
    private final By confirmPasswordField = By.xpath("//input[@name='repeated_password']");
    private final By createAccountButton = By.xpath("//span[text()='Create account']");
    private final By cancelButton = By.xpath("//span[text()='Cancel']");

    public CreateModeratorAccountForm(WebDriver driver) {
        this.driver = driver;
    }

    public CreateModeratorAccountForm inputName (String name) {
        driver.findElement(nameField).sendKeys(name);
        return this;
    }

    public CreateModeratorAccountForm inputEmail (String email) {
        driver.findElement(emailField).sendKeys(email);
        return this;
    }

    public CreateModeratorAccountForm inputPhone(String phoneNumber) {
        driver.findElement(phoneNumberField).sendKeys(phoneNumber);
        return this;
    }

    public CreateModeratorAccountForm inputPassword (String password) {
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(confirmPasswordField).sendKeys(password);
        return this;
    }

    public Calendar clickOnBirthdayField() {
        driver.findElement(birthDateField).click();
        return new Calendar(driver);
    }

    public void clickCreateAccount() {
        driver.findElement(createAccountButton).click();
    }

    public void clickCancelButton() {
        driver.findElement(cancelButton).click();
    }

}
