package com.easyrest.components.menuPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MenuItem {
    private WebDriver driver;

    private final By addProduct = By.xpath("//button[@aria-label = 'Add to cart']");

    public MenuItem(WebDriver driver) {
        this.driver = driver;
    }

    public MenuItem addProduct() {
        List<WebElement> elements = driver.findElements(addProduct);
        if (elements.size() > 0) {
            WebElement addedproduct = elements.get(0);
            addedproduct.click();
        }
        return new MenuItem(driver);
    }
}