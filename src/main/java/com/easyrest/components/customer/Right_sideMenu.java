package com.easyrest.components.customer;

import com.easyrest.components.AddRestaurant;
import com.easyrest.pages.CustomerPage;
import com.easyrest.pages.customerPanel.CurrentOrders;
import com.easyrest.pages.customerPanel.MyRestaurants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Currency;

public class Right_sideMenu {

    private WebDriver driver;
    //elements of the menu in the account
    private final By personalInfo = By.xpath("//span[text() = 'Personal Info']");
    private final By currentOrders = By.xpath("//span[text() = 'Current Orders']");
    private final By orderHistory = By.xpath("//span[text() = 'Order History']");
    private final By myRestaurants = By.xpath("//span[text() = 'My Restaurants']");


    public Right_sideMenu(WebDriver driver){
        this.driver=driver;
    }

    public CustomerPage seePersonalInfo() {
        driver.findElement(personalInfo).click();
        return new CustomerPage(driver);
    }

    public CurrentOrders seeCurrentOrdersTab() {
        driver.findElement(currentOrders).click();
        return new CurrentOrders(driver);
    }

    public CustomerPage seeOrderHistory() {
        driver.findElement(orderHistory).click();
        return new CustomerPage(driver);
    }

    public MyRestaurants seeMyRestaurants() {
        driver.findElement(myRestaurants).click();
        return new MyRestaurants(driver);
    }


}
