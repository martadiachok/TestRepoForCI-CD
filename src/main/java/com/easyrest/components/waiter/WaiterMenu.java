package com.easyrest.components.waiter;

import com.easyrest.pages.waiterPanel.AllOrders;
import com.easyrest.pages.waiterPanel.AssignedWaiterOrders;
import com.easyrest.pages.waiterPanel.InProgressOrders;
import com.easyrest.pages.waiterPanel.OrdersHistory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WaiterMenu {

    private final WebDriver driver;
    private final By allOrdersTab = By.xpath("//a[@href='/waiter/orders/']");
    private final By assignedWaitersTab = By.xpath("//a[contains(@href,'Assigned waiter')]");
    private final By inProgressOrdersTab = By.xpath("//a[contains(@href,'In progress')]");
    private final By ordersHistoryTab = By.xpath("//a[contains(@href,'History')]");

    public WaiterMenu(WebDriver driver) {
        this.driver = driver;
    }

    public AllOrders clickOnAllOrders() {
        driver.findElement(allOrdersTab).click();
        return new AllOrders(driver);
    }

    public AssignedWaiterOrders clickOnAssignedWaiterOrders() {
        driver.findElement(assignedWaitersTab).click();
        return new AssignedWaiterOrders(driver);
    }

    public InProgressOrders clickOnInProgressOrders() {
        driver.findElement(inProgressOrdersTab).click();
        return new InProgressOrders(driver);
    }

    public OrdersHistory clickOnOrdersHistory() {
        driver.findElement(ordersHistoryTab).click();
        return new OrdersHistory(driver);
    }

}
