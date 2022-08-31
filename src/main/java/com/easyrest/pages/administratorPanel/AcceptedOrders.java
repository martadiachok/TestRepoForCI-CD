package com.easyrest.pages.administratorPanel;

import com.easyrest.components.administrator.Order;
import com.easyrest.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AcceptedOrders extends BasePage {

    private final By order = By.xpath("//div[contains(@class,'ExpandItem')]/div[contains(@role,'button')]");

    public AcceptedOrders(WebDriver driver) {
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
