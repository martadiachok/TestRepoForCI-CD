package com.easyrest.components.waiter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderAction {
    private final WebDriver driver;
    private final By orderAction = By.xpath("((//main//button[not(contains(@aria-label,'Show more'))])[1]");

    public OrderAction(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnOrderAction() {
        driver.findElement(orderAction).click();
    }

}
