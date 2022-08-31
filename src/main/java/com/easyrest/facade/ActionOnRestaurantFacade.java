package com.easyrest.facade;

import com.easyrest.components.ActionOnRestaurants;
import com.easyrest.components.HeaderForAuthorizedUser;
import com.easyrest.components.UserRoleMenuPanel;
import com.easyrest.components.moderator.LeftSideMenu;
import com.easyrest.pages.moderatorPanel.Restaurants;
import org.openqa.selenium.WebDriver;

public class ActionOnRestaurantFacade {
    private ActionOnRestaurants actionOnRestaurants;
    private LeftSideMenu leftSideMenu;

    public ActionOnRestaurantFacade(WebDriver driver) {
        actionOnRestaurants = new ActionOnRestaurants(driver);
        leftSideMenu = new LeftSideMenu(driver);
    }

    public void seeAllRestaurants() {
        leftSideMenu.clickOnMenuButtonRestaurants();
    }

    private void clickUnapprovedRestaurant() {
        leftSideMenu.clickOnMenuButtonRestaurants();
        actionOnRestaurants.clickOnButtonUnapproved();
    }

    private void clickApprovedRestaurant() {
        leftSideMenu.clickOnMenuButtonRestaurants();
        actionOnRestaurants.clickOnButtonApproved();
    }

    private void clickArchivedRestaurant() {
        leftSideMenu.clickOnMenuButtonRestaurants();
        actionOnRestaurants.clickOnButtonArchived();
    }

    private boolean checkIfRestaurantMovedToApprovedList(String name) {
        actionOnRestaurants.clickOnButtonApproved();
        return actionOnRestaurants.findRestaurantInListAfterAction(name);
    }

    private boolean checkIfRestaurantMovedToUnapprovedList(String name) {
        actionOnRestaurants.clickOnButtonUnapproved();
        return actionOnRestaurants.findRestaurantInListAfterAction(name);
    }

    private boolean checkIfRestaurantMovedToArchivedList(String name) {
        actionOnRestaurants.clickOnButtonArchived();
        return actionOnRestaurants.findRestaurantInListAfterAction(name);
    }

    public boolean approveRestaurant() {
        clickUnapprovedRestaurant();
        String restaurantName = actionOnRestaurants.getFirstNameFromRestaurant();
        actionOnRestaurants.approveRestaurant();
        return checkIfRestaurantMovedToApprovedList(restaurantName);
    }

    public boolean disapproveRestaurant() {
        clickUnapprovedRestaurant();
        String restaurantName = actionOnRestaurants.getFirstNameFromRestaurant();
        actionOnRestaurants.disapproveRestaurant();
        return checkIfRestaurantMovedToArchivedList(restaurantName);
    }

    public boolean archiveRestaurant() {
        clickApprovedRestaurant();
        String restaurantName = actionOnRestaurants.getFirstNameFromRestaurant();
        actionOnRestaurants.archiveRestaurant();
        return checkIfRestaurantMovedToArchivedList(restaurantName);
    }

    public boolean restoreRestaurant() {
        clickArchivedRestaurant();
        String restaurantName = actionOnRestaurants.getFirstNameFromRestaurant();
        actionOnRestaurants.restoreRestaurant();
        return checkIfRestaurantMovedToApprovedList(restaurantName);
    }
}
