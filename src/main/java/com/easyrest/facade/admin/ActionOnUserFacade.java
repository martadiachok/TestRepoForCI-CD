package com.easyrest.facade.admin;

import com.easyrest.components.admin.ActionOnClient;
import com.easyrest.components.admin.LeftSideMenu;
import org.openqa.selenium.WebDriver;

public class ActionOnUserFacade extends ActionOnClientFacade {

    private LeftSideMenu leftSideMenu;
    private ActionOnClient actionOnUser;

    public ActionOnUserFacade(WebDriver driver) {
        super(driver);
        leftSideMenu = new LeftSideMenu(driver);
        actionOnUser = new ActionOnClient(driver);
    }

    private void clickActiveUsers() {
        leftSideMenu.clickUsers();
        actionOnUser.clickActiveButton();
    }

    private void clickBannedUsers() {
        leftSideMenu.clickUsers();
        actionOnUser.clickBannedButton();
    }

    public boolean banUser() {
        clickActiveUsers();
        String userName = actionOnUser.getFirstNameFromClient();
        clickToBanFirstClient();
        boolean isBanned = checkIfClientMovedToBannedList(userName);
        return isBanned;
    }

    public boolean makeUserActive() {
        clickBannedUsers();
        String userName = actionOnUser.getFirstNameFromClient();
        clickToMakeFirstClientActive();
        boolean isActive = checkIfClientMovedToActiveList(userName);
        return isActive;
    }

}
