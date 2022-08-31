package com.easyrest.pages.waiterPanel;

import com.easyrest.components.waiter.Order;
import com.easyrest.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class InProgressOrders extends BasePage {

    private final By order = By.xpath("//div[contains(@class,'Order-card')]");

    public InProgressOrders(WebDriver driver) {
        super(driver);
    }

    public Order getOrder() {
        return new Order(driver);
    }

    public Integer getOrdersCount() {
        List<WebElement> orders = driver.findElements(order);
        return orders.size();
    }

}
