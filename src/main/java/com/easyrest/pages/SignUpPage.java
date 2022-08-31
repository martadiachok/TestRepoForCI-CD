package com.easyrest.pages;

import com.easyrest.config.ConfigProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.easyrest.components.Calendar;
import static com.easyrest.config.ConfigProvider.readConfig;

public class SignUpPage extends BasePage {

    private final By nameField = By.xpath("//input[@name='name']");
    private final By emailField = By.xpath("//input[@name='email']");
    private final By phoneNumberField = By.xpath("//input[@name='phoneNumber']");
    private final By birthDateField = By.xpath("//input[@name='birthDate']");
    private final By passwordField = By.xpath("//input[@name='password']");
    private final By confirmPasswordField = By.xpath("//input[@name='repeated_password']");
    private final By createAccountButton = By.xpath("//span[text()='Create account']");
    private final By signInInsteadButton = By.xpath("//span[text()='Sign in instead']");
    private final By signInMenuButton = By.xpath("//span[text()='Sign In']");

    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    /**
     * General methods
     */
    public SignUpPage goToSignUpPage() {
        openPage(ConfigProvider.signUpPageUrl);
        return this;
    }

    /**
     * Methods to find one element and fill one field
     */
    public SignUpPage inputName (String name) {
        driver.findElement(nameField).sendKeys(name);
        return this;
    }

    public SignUpPage inputEmail (String email) {
        driver.findElement(emailField).sendKeys(email);
        return this;
    }

    public SignUpPage inputPhone(String phoneNumber) {
        driver.findElement(phoneNumberField).sendKeys(phoneNumber);
        return this;
    }

    public SignUpPage inputPassword (String password) {
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(confirmPasswordField).sendKeys(password);
        return this;
    }

    public Calendar clickOnBirthdayField() {
        driver.findElement(birthDateField).click();
        return new Calendar(driver);
    }

    /**
     * Methods to click on element
     */
    public void clickCreateAccount() {
        driver.findElement(createAccountButton).click();
    }

    public void clickSignInInstead() {
        driver.findElement(signInInsteadButton).click();
    }

    public void clickSignInInMenu() {
        driver.findElement(signInMenuButton).click();
    }

}
