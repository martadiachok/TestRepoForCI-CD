package com.easyrest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RestaurantsList extends BasePage {


    private final By restaurantsListMenuItem = By.xpath("//span [text()='Restaurants List']");
    private final By homeMenuItem = By.xpath("//span [text() = 'Home']");
    private final By easyRestMenuItem = By.xpath("//a [text() = 'Easy-rest']");
    private final By signInMenuItem = By.xpath("//span [text() = 'Sign In']");
    private final By signUpMenuItem = By.xpath("//span [text() = 'Sign Up']");

    private final By viewAllRlMenuItem = By.xpath("//span [text()='View all']");
    private final By beerRlMenuItem = By.xpath("//span [text()='beer']");
    private final By kebabRlMenuItem = By.xpath("//span [text()='kebab']");
    private final By vegetarianRlMenuItem = By.xpath("//span [text()='vegetarian']");
    private final By sushiRlMenuItem = By.xpath("//span [text()='sushi']");
    private final By fastFoodRlMenuItem = By.xpath("//span [text()='fast food']");
    private final By pubRlMenuItem = By.xpath("//span [text()='pub']");
    private final By cuisineUARlMenuItem = By.xpath("//span [text()='ukrainian cuisine']");
    private final By burgersRlMenuItem = By.xpath("//span [text()='burgers']");
    private final By cuisineJPRlMenuItem = By.xpath("//span [text()='japanese cuisine']");
    private final By greelRlMenuItem = By.xpath("//span [text()='greel']");
    private final By pizzaRlMenuItem = By.xpath("//span [text()='pizza']");
    private final By rlArrowMenuItem = By.xpath("//*[contains(@class ,'MuiSvgIcon-root')]");
    private final By watchMenuButton = By.xpath("//div [contains(@class ,'TagsTab-item' )][1]//span [text() = 'Watch Menu']");
    private final By DetailsButton = By.xpath("//div [contains(@class ,'TagsTab-item' )][1]//span [text() = 'details']");

    public RestaurantsList(WebDriver driver) {
        super(driver);
    }

    public RestaurantsList clickOnMenuItemRestaurantList() {

        driver.findElement(restaurantsListMenuItem).click();
        return new RestaurantsList(driver);
    }

    public RestaurantsList clickOnMenuItemHome() {

        driver.findElement(easyRestMenuItem).click();
        return new RestaurantsList(driver);
    }

    public RestaurantsList clickOnMenuItemEasyRest() {

        driver.findElement(homeMenuItem).click();
        return new RestaurantsList(driver);
    }

    public SignInPage clickOnMenuItemSignIn() {

        driver.findElement(signInMenuItem).click();
        return new SignInPage(driver);
    }

    public SignUpPage clickOnMenuItemSignUp() {

        driver.findElement(signUpMenuItem).click();
        return new SignUpPage(driver);
    }

    public RestaurantsList clickOnMenuItemViewAll() {

        driver.findElement(viewAllRlMenuItem).click();
        return new RestaurantsList(driver);
    }

    public RestaurantsList clickOnMenuItemBeer() {

        driver.findElement(beerRlMenuItem).click();
        return new RestaurantsList(driver);
    }

    public RestaurantsList clickOnMenuItemKebab() {

        driver.findElement(kebabRlMenuItem).click();
        return new RestaurantsList(driver);
    }

    public RestaurantsList clickOnMenuItemVegetarian() {

        driver.findElement(vegetarianRlMenuItem).click();
        return new RestaurantsList(driver);
    }

    public RestaurantsList clickOnMenuItemSushi() {

        driver.findElement(sushiRlMenuItem).click();
        return new RestaurantsList(driver);
    }

    public RestaurantsList clickOnMenuItemFastFood() {

        driver.findElement(fastFoodRlMenuItem).click();
        return new RestaurantsList(driver);
    }

    public RestaurantsList clickOnMenuItemPub() {

        driver.findElement(pubRlMenuItem).click();
        return new RestaurantsList(driver);
    }

    public RestaurantsList clickOnMenuItemCuisineUA() {

        driver.findElement(cuisineUARlMenuItem).click();
        return new RestaurantsList(driver);
    }

    public RestaurantsList clickOnMenuItemBurgers() {

        driver.findElement(burgersRlMenuItem).click();
        return new RestaurantsList(driver);
    }

    public RestaurantsList clickOnMenuItemCuisineJP() {

        driver.findElement(cuisineJPRlMenuItem).click();
        return new RestaurantsList(driver);
    }

    public RestaurantsList clickOnMenuItemGreel() {

        driver.findElement(greelRlMenuItem).click();
        return new RestaurantsList(driver);
    }

    public RestaurantsList clickOnMenuItemPizza() {

        driver.findElement(pizzaRlMenuItem).click();
        return new RestaurantsList(driver);
    }

    public RestaurantsList clickOnMenuItemRLArrow() {

        driver.findElement(rlArrowMenuItem).click();
        return new RestaurantsList(driver);
    }

    public MenuPage clickOnButtonWatchMenu() {

        driver.findElement(watchMenuButton).click();
        return new MenuPage(driver);
    }

    public RestaurantsList clickOnButtonDetails() {

        driver.findElement(DetailsButton).click();
        return new RestaurantsList(driver);
    }

}
