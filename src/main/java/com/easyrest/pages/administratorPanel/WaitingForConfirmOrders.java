package com.easyrest.pages.administratorPanel;

import com.easyrest.components.administrator.Order;
import com.easyrest.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WaitingForConfirmOrders extends BasePage {

    private final By orders = By.xpath("//div[contains(@class,'ExpandItem')]/div[contains(@role,'button')]");

    public WaitingForConfirmOrders(WebDriver driver) {
        super(driver);
    }

    public Order getOrder() {
        return new Order(driver);
    }

    public Integer getOrdersCount() {
        List<WebElement> ordersList = driver.findElements(orders);
        return ordersList.size();
    }
}
