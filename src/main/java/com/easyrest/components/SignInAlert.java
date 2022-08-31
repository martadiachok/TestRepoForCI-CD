package com.easyrest.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.easyrest.constants.Constants.TimeoutVariable.EXPLICIT_WAIT;

public class SignInAlert {
    private final WebDriver driver;
    private final By alert = By.xpath("//*[@id = 'client-snackbar']");

    public SignInAlert(WebDriver driver) {
        this.driver = driver;
    }

    public String showMessage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(alert)
        ).getText();
    }

}
