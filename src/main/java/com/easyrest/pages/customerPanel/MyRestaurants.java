package com.easyrest.pages.customerPanel;

import com.easyrest.components.AddRestaurant;
import com.easyrest.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyRestaurants extends BasePage {

    private final By addRestaurantPlusButton = By.xpath("//*[@title = 'Add restaurant']");
    public MyRestaurants(WebDriver driver) {
        super(driver);
    }

    public AddRestaurant clickAddRestaurantPlusButton() {
        driver.findElement(addRestaurantPlusButton).click();
        return new AddRestaurant(driver);
    }
}
