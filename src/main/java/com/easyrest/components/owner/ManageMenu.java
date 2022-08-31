package com.easyrest.components.owner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ManageMenu {
    private WebDriver driver;

    private final By optionsOfRestaurantButton = By.xpath("//div[contains(@style,'opacity:')][1]//button [@aria-label='More']");
    private final By archiveMenuItem = By.xpath("//span [text() = 'Archive']");
    private final By unarchiveMenuItem = By.xpath("//span [text() = 'Unarchive']");
    private final By manageMenuItem = By.xpath("//span [text() = 'Manage']");

    public ManageMenu(WebDriver driver) {
        this.driver = driver;
    }

    public ManageMenu clickOnButtonRestaurantOption() {
        driver.findElement(optionsOfRestaurantButton).click();
        return new ManageMenu(driver);
    }

    public void clickOnMenuItemArchive() {
        driver.findElement(archiveMenuItem).click();
    }

    public void clickOnMenuItemUnarchive() {
        driver.findElement(unarchiveMenuItem).click();
    }

    public void clickOnMenuItemManage() {
        driver.findElement(manageMenuItem).click();
    }
}
