package com.easyrest.components.administrator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderAction {
    private final WebDriver driver;
    private final By acceptOrder = By.xpath("(//div[contains(@class,'AdministratorPanel-root')]/div//button/span[contains(.,'Accept')])[1]");
    private final By pickWaiter = By.xpath("(//input[contains(@name,'waiters')])[1]");
    private final By assignWaiter = By.xpath("(//div[contains(@class,'AdministratorPanel-root')]/div//span[contains(.,'Assign')])[1]");

    public OrderAction(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnAcceptOrder() {
        driver.findElement(acceptOrder).click();
    }

    public OrderAction clickOnPickWaiter() {
        driver.findElement(pickWaiter).click();
        return this;
    }

    public void clickOnAssignWaiter() {
        driver.findElement(assignWaiter).click();
    }

}
