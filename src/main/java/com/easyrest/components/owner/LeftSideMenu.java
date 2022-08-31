package com.easyrest.components.owner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LeftSideMenu {
    private WebDriver driver;
    private final By detailsMenuButton = By.xpath("//span[text() = 'Details']");
    private final By waitersMenuButton = By.xpath("//span[text()='Waiters']");
    private final By administratorsMenuButton = By.xpath("//span[text() = 'Administrators']");

    public LeftSideMenu(WebDriver driver) {
        this.driver = driver;
    }

    public RestaurantDetails clickOnMenuButtonDetails() {
        driver.findElement(detailsMenuButton).click();
        return new RestaurantDetails(driver);
    }

    public Waiters clickOnMenuButtonWaiters() {
        driver.findElement(waitersMenuButton).click();
        return new Waiters(driver);
    }

    public Administrators clickOnMenuButtonAdministrators() {
        driver.findElement(administratorsMenuButton).click();
        return new Administrators(driver);


    }
}
