package com.easyrest.components.owner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RestaurantDetails {
    private WebDriver driver;

    private final By editInformationButton = By.xpath("//button [@title = 'Edit Information']");
    private final By updateButton = By.xpath("//span [text() = 'Update']");
    private final By cancelButton = By.xpath("//span [text() = 'Cancel']");

    public RestaurantDetails(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnButtonEditInformation() {
        driver.findElement(editInformationButton).click();
    }

    public void clickOnButtonUpdate() {
        driver.findElement(updateButton).click();
    }

    public void clickOnButtonCancel() {
        driver.findElement(cancelButton);
    }
}
