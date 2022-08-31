package com.easyrest.facade.owner;

import com.easyrest.components.AddRestaurant;
import com.easyrest.components.HeaderForAuthorizedUser;
import com.easyrest.components.customer.Right_sideMenu;
import org.openqa.selenium.WebDriver;

public class AddSecondRestaurantFacade {
    private HeaderForAuthorizedUser headerForAuthorizedUser;
    private Right_sideMenu right_sideMenu;
    private AddRestaurant addRestaurant;

    public AddSecondRestaurantFacade(WebDriver driver) {
        headerForAuthorizedUser = new HeaderForAuthorizedUser(driver);
        right_sideMenu = new Right_sideMenu(driver);
        addRestaurant = new AddRestaurant(driver);
    }

    public void addSecondRestaurant(String name, String address) {
        headerForAuthorizedUser.clickOnUserProfileIcon().clickOnTheFirstMenuItem();
        right_sideMenu.seeMyRestaurants().clickAddRestaurantPlusButton();
        addRestaurant.enterRestaurantName(name).enterRestaurantAddress(address).approveRestaurantAdding();
    }
}
