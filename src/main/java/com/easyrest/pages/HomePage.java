package com.easyrest.pages;

import com.easyrest.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

    public class HomePage extends BasePage{


        private final By home = By.xpath("//*[text() = 'Home']");
        private final By viewAll = By.xpath("//*[text() =  'View All']");
        private final By pub = By.xpath("//*[@href =  '/restaurants?tag=pub']");
        private final By fastFood = By.xpath("//*[@href =  '/restaurants?tag=fast food']");
        private final By vegeterian = By.xpath("//*[@href =  '/restaurants?tag=vegetarian']");
        private final By pizza = By.xpath("//*[@href =  '/restaurants?tag=pizza']");
        private final By sushi = By.xpath("//*[@href =  '/restaurants?tag=sushi']");
        private final By greel = By.xpath("//*[@href =  '/restaurants?tag=greel']");
        private final By burgers = By.xpath("//*[@href =  '/restaurants?tag=burgers']");
        private final By kebab = By.xpath("//*[@href =  '/restaurants?tag=kebab']");
        private final By japaneseCuisine = By.xpath("//*[@href =  '/restaurants?tag=japanese cuisine']");
        private final By beer = By.xpath("//*[@href =  '/restaurants?tag=beer']");
        private final By ukrainianCuisine = By.xpath("//*[@href =  '/restaurants?tag=ukrainian cuisine']");
        private final By turkishCuisine = By.xpath("//*[@href =  '/restaurants?tag=turkish cuisine']");

        private final By restaurantsList = By.xpath("//*[@href =  '/restaurants']");

        public HomePage(WebDriver driver) {
            super(driver);
        }

        public RestaurantsList clickViewAllButton(){
            driver.findElement(viewAll).click();
            return new RestaurantsList(driver);
        }

        public RestaurantsList clickPubButton(){
            driver.findElement(pub).click();
            return new RestaurantsList(driver);
        }

        public RestaurantsList clickFastFoodButton(){
            driver.findElement(fastFood).click();
            return new RestaurantsList(driver);
        }

        public RestaurantsList clickVegeterianButton(){
            driver.findElement(vegeterian).click();
            return new RestaurantsList(driver);
        }

        public RestaurantsList clickPizzaButton(){
            driver.findElement(pizza).click();
            return new RestaurantsList(driver);
        }

        public RestaurantsList clickSushiButton(){
            driver.findElement(sushi).click();
            return new RestaurantsList(driver);
        }

        public RestaurantsList clickGreelButton(){
            driver.findElement(greel).click();
            return new RestaurantsList(driver);
        }

        public RestaurantsList clickBurgersButton(){
            driver.findElement(burgers).click();
            return new RestaurantsList(driver);
        }

        public RestaurantsList clickKebabButton(){
            driver.findElement(kebab).click();
            return new RestaurantsList(driver);
        }

        public RestaurantsList clickJapaneseCuisineButton(){
            driver.findElement(japaneseCuisine).click();
            return new RestaurantsList(driver);
        }

        public RestaurantsList clickUkrainianCuisineButton(){
            driver.findElement(ukrainianCuisine).click();
            return new RestaurantsList(driver);
        }

        public RestaurantsList clickBeerButton(){
            driver.findElement(beer).click();
            return new RestaurantsList(driver);
        }

        public RestaurantsList clickTurkishCuisineButton(){
            driver.findElement(turkishCuisine).click();
            return new RestaurantsList(driver);
        }

        public RestaurantsList clickRestaurantsListButton(){
            driver.findElement(restaurantsList).click();
            return new RestaurantsList(driver);
        }
    }


