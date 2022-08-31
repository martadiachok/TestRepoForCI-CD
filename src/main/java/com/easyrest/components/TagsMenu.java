package com.easyrest.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TagsMenu {
    private WebDriver driver;

    private final By restaurantTagsMenu = By.xpath("//label [@for='tags']");
    private final By beerTag = By.xpath("//li [@data-value = 'beer']");
    private final By kebabTag = By.xpath("//li [@data-value = 'kebab']");
    private final By pizzaTag = By.xpath("//li [@data-value = 'pizza']");
    private final By cuisineTurkishTag = By.xpath("//li [@data-value = 'turkish cuisine']");
    private final By vegetarianTag = By.xpath("//li [@data-value = 'vegetarian']");
    private final By sushiTag = By.xpath("//li [@data-value = 'sushi']");
    private final By fastFoodTag = By.xpath("//li [@data-value = 'fast food']");
    private final By pubTag = By.xpath("//li [@data-value = 'pub']");
    private final By cuisineUkrainianTag = By.xpath("//li [@data-value = 'ukrainian cuisine']");
    private final By burgersTag = By.xpath("//li [@data-value = 'burgers']");
    private final By cuisineJapaneseTag = By.xpath("//li [@data-value = 'japanese cuisine']");
    private final By greelTag = By.xpath("//li [@data-value = 'greel']");
    private final By coffeTeaTag = By.xpath("//li [@data-value = 'coffe/tea']");

    public TagsMenu(WebDriver driver) {
        this.driver = driver;
    }

    public TagsMenu clickOnTagBeer() {
        driver.findElement(beerTag).click();
        return this;
    }

    public TagsMenu clickOnTagKebab() {
        driver.findElement(kebabTag).click();
        return this;
    }

    public TagsMenu clickOnTagPizza() {
        driver.findElement(pizzaTag).click();
        return this;
    }

    public TagsMenu clickOnTagCuisineTurkish() {
        driver.findElement(cuisineTurkishTag).click();
        return this;
    }

    public TagsMenu clickOnTagVegetarian() {
        driver.findElement(vegetarianTag).click();
        return this;
    }

    public TagsMenu clickOnTagSushi() {
        driver.findElement(sushiTag).click();
        return this;
    }

    public TagsMenu clickOnTagFastFood() {
        driver.findElement(fastFoodTag).click();
        return this;
    }

    public TagsMenu clickOnTagPub() {
        driver.findElement(pubTag).click();
        return this;
    }

    public TagsMenu clickOnTagCuisineUkrainian() {
        driver.findElement(cuisineUkrainianTag).click();
        return this;
    }

    public TagsMenu clickOnTagBurgers() {
        driver.findElement(burgersTag).click();
        return this;
    }

    public TagsMenu clickOnTagCuisineJapanese() {
        driver.findElement(cuisineJapaneseTag).click();
        return this;
    }

    public TagsMenu clickOnTagGreel() {
        driver.findElement(greelTag).click();
        return this;
    }

    public TagsMenu clickOnTagCoffeTea() {
        driver.findElement(coffeTeaTag).click();
        return this;
    }
}
