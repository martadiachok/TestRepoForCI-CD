package com.easyrest.components.admin;

import com.easyrest.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LeftSideMenu {
    private WebDriver driver;

    private final By usersButton = By.xpath("//span[text()='Users']");
    private final By ownersButton = By.xpath("//a[@href = '/admin/owners']");
    private final By moderatorsButton = By.xpath("//a[@href = '/admin/moderators']");
    private final By restaurantsButton = By.xpath("//a[@href = '/admin/restaurants']");

    public LeftSideMenu(WebDriver driver) {
        this.driver = driver;
    }

    public LeftSideMenu clickUsers(){
        driver.findElement(usersButton).click();
        return this;
    }

    public LeftSideMenu clickOwners(){
        driver.findElement(ownersButton).click();
        return this;
    }

    public LeftSideMenu clickModerators(){
        driver.findElement(moderatorsButton).click();
        return this;
    }

    public LeftSideMenu clickRestaurants(){
        driver.findElement(restaurantsButton).click();
        return this;
    }
}
