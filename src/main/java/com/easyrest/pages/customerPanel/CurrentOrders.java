package com.easyrest.pages.customerPanel;

import com.easyrest.pages.BasePage;
import com.easyrest.pages.CustomerPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CurrentOrders extends BasePage {
    private final By waitingForConfirm = By.xpath("//a[@href = '/profile/current_orders/Waiting for confirm']");
    private final By accepted = By.xpath("//a[@href = '/profile/current_orders/Accepted']");
    private final By inProgress = By.xpath("//*[@href = '/profile/current_orders/In progress']");

    private final By orderDetailsForConfirm = By.xpath("//div[@role = 'button']");
    private final By decline = By.xpath("//*[text() =  'Decline']");

    public CurrentOrders(WebDriver driver) {
        super(driver);
    }

    public CurrentOrders seeWaitingForConfirmOrders() {
        driver.findElement(waitingForConfirm).click();
        return new CurrentOrders(driver);
    }

    public CurrentOrders seeAcceptedOrders() {
        driver.findElement(accepted).click();
        return new CurrentOrders(driver);
    }

    public CurrentOrders seeInProgressOrders() {
        driver.findElement(inProgress).click();
        return new CurrentOrders(driver);
    }

    public CurrentOrders seeOrderDetails() {
        List<WebElement> elements = driver.findElements(orderDetailsForConfirm);
        if (elements.size() > 0) {
            WebElement order = elements.get(1);
            order.click();
        }
        return new CurrentOrders(driver);
    }

    public CurrentOrders declineOrder() {
        driver.findElement(decline).click();
        return new CurrentOrders(driver);
    }
}
