package com.easyrest.components.menuPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderConfirmation {
    private WebDriver driver;

    private final By submitInWindowButton = By.xpath("//*[text()='Submit']");
    private final By cancelInWindowButton = By.xpath("//span[text()='Cancel']");
    private final By deleteDishInOrderButton = By.xpath("//*[contains(@class, 'MuiTableRow-root')][1]//button[@aria-label= 'Remove item']");

    public OrderConfirmation(WebDriver driver) {
        this.driver = driver;
    }

    public MenuItem submitOrderInWindow() {
        driver.findElement(submitInWindowButton).click();
        return new MenuItem(driver);
    }

    public MenuItem cancelOrderInWindow() {
        driver.findElement(cancelInWindowButton).click();
        return new MenuItem(driver);
    }

    public OrderConfirmation clickOnButtonDeleteFirstDish() {
        driver.findElement(deleteDishInOrderButton).click();
        return new OrderConfirmation(driver);
    }
}