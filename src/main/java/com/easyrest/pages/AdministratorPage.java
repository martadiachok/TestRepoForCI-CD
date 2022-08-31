package com.easyrest.pages;

import com.easyrest.components.administrator.AdministratorMenu;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.easyrest.config.ConfigProvider.administratorPanelUrl;
import static com.easyrest.constants.Constants.TimeoutVariable.EXPLICIT_WAIT;

public class AdministratorPage extends BasePage {

    public AdministratorPage(WebDriver driver) {
        super(driver);
    }

    public AdministratorMenu getAdministratorTabMenu() {
        return new AdministratorMenu(driver);
    }

    public void waitForPagePresence() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
        wait.until(ExpectedConditions.urlToBe(administratorPanelUrl));
    }

}
