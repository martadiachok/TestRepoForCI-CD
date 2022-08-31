package com.easyrest.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserRoleMenuPanel {
    private WebDriver driver;

    private final By userPanelButton = By.xpath("//ul[@role='menu']//child::a");
    private final By logOutButton = By.xpath("//ul[@role='menu']//child::li");

    public UserRoleMenuPanel(WebDriver driver) { this.driver = driver; }

    public void clickOnTheFirstMenuItem() {
        driver.findElement(userPanelButton)
                .click();
    }

    public void clickOnLogOutMenuItem() {
        driver.findElement(logOutButton)
                .click();
    }

}
