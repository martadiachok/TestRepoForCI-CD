package com.easyrest.components.administrator;

import com.easyrest.pages.administratorPanel.AcceptedOrders;
import com.easyrest.pages.administratorPanel.WaitingForConfirmOrders;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdministratorMenu {
    private final WebDriver driver;
    private final By waitingForConfirmOrdersTab = By.xpath("//div[@role='tablist']//button[1]");
    private final By acceptedOrdersTab = By.xpath("//div[@role='tablist']//button[2]");
    private final By assignedWaitersOrdersTab = By.xpath("//div[@role='tablist']//button[3]");
    private final By waitersOrdersTab = By.xpath("//div[@role='tablist']//button[4]");
    private final By selectedTab = By.xpath("//button[@aria-selected='true']");

    public AdministratorMenu(WebDriver driver) {
        this.driver = driver;
    }

    public WaitingForConfirmOrders clickOnWaitingForConfirmOrders() {
        driver.findElement(waitingForConfirmOrdersTab).click();
        return new WaitingForConfirmOrders(driver);
    }

    public AcceptedOrders clickOnAcceptedOrders() {
        driver.findElement(acceptedOrdersTab).click();
        return new AcceptedOrders(driver);
    }

    public void clickOnAssignedWaiters() {
        driver.findElement(assignedWaitersOrdersTab).click();
    }

    public void clickOnWaiters() {
        driver.findElement(waitersOrdersTab).click();
    }

    public String getSelectedTabName() {
        return driver.findElement(selectedTab).getText();
    }

}
