package com.easyrest.components.owner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateNewEmployee {
    private WebDriver driver;
    private final By nameField = By.xpath("//input[@name='name']");
    private final By emailField = By.xpath("//input[@name='email']");
    private final By passwordField = By.xpath("//input[@name='password']");
    private final By phoneField = By.xpath("//input[@name='phone_number']");
    private final By addButton = By.xpath("//*[text() = 'Add']");
    private final By cancelButton = By.xpath("//*[text() = 'Cancel']");

    public CreateNewEmployee(WebDriver driver) {
        this.driver = driver;
    }

    //We know that we have code duplication
    public CreateNewEmployee sendToFieldName(String name) {
        driver.findElement(nameField).clear();
        driver.findElement(nameField).sendKeys(name);
        return this;
    }

    public CreateNewEmployee sendToFieldEmail(String email) {
        driver.findElement(emailField).clear();
        driver.findElement(emailField).sendKeys(email);
        return this;
    }

    public CreateNewEmployee sendToFieldPassword(String password) {
        driver.findElement(passwordField).clear();
        driver.findElement(passwordField).sendKeys(password);
        return this;
    }

    public CreateNewEmployee sendToFieldPhone(String phone) {
        driver.findElement(phoneField).clear();
        driver.findElement(phoneField).sendKeys(phone);
        return this;
    }

    public void clickOnButtonAdd() {
        driver.findElement(addButton).click();
    }

    public void clickOnButtonCancel() {
        driver.findElement(cancelButton).click();
    }

    private boolean numberOfEmployee(By element) {
        return this.driver.findElements(element).size() > 0;
    }
    public boolean isEmployeeDisplayed(String name) {
        return numberOfEmployee(By.xpath("*//div//span[normalize-space()='"+name+"']"));
    }
}
