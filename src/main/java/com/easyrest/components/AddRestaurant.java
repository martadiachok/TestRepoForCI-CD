package com.easyrest.components;

import com.easyrest.pages.CustomerPage;
import com.easyrest.pages.customerPanel.MyRestaurants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddRestaurant{

    private WebDriver driver;
    private final By restaurantNameField = By.xpath("//input[@name='name']");
    private final By restaurantAddressField = By.xpath("//input[@name='address']");
    private final By addButton = By.xpath("//*[text() = 'Add']");
    private final By cancel = By.xpath("//*[text() = 'Cancel']");

    public AddRestaurant(WebDriver driver){
        this.driver=driver;
    }


    public AddRestaurant enterRestaurantName(String name) {

        driver.findElement(restaurantNameField).clear();
        driver.findElement(restaurantNameField).sendKeys(name);
        return this;
    }

    public AddRestaurant enterRestaurantAddress(String address) {
        driver.findElement(restaurantAddressField).clear();
        driver.findElement(restaurantAddressField).sendKeys(address);
        return this;
    }

    public MyRestaurants approveRestaurantAdding() {
        driver.findElement(addButton).click();
        return new MyRestaurants(driver);
    }

    public MyRestaurants cancelRestaurantAdding() {
        driver.findElement(cancel).click();
        return new MyRestaurants(driver);
    }

}
