package com.easyrest.components.moderator;


import com.easyrest.pages.moderatorPanel.Owners;
import com.easyrest.pages.moderatorPanel.Restaurants;
import com.easyrest.pages.moderatorPanel.Users;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LeftSideMenu {
    private WebDriver driver;

    private final By restaurantsMenuButton = By.xpath("// span [contains (text(), 'Restaurants')]/parent::div");
    private final By usersMenuButton = By.xpath("//span [text() = 'Users']");
    private final By ownersMenuButton = By.xpath("//span [text() = 'Owners']");

    public LeftSideMenu(WebDriver driver) {
        this.driver = driver;
    }

    public Restaurants clickOnMenuButtonRestaurants() {
        driver.findElement(restaurantsMenuButton).click();
        return new Restaurants(driver);
    }

    public Users clickOnMenuButtonUsers() {

        driver.findElement(usersMenuButton).click();
        return new Users(driver);
    }

    public Owners clickOnMenuButtonOwners() {

        driver.findElement(ownersMenuButton).click();
        return new Owners(driver);
    }
}
