package com.easyrest.facade.moderator;

import com.easyrest.components.admin.ActionOnClient;
import com.easyrest.components.moderator.LeftSideMenu;
import com.easyrest.facade.admin.ActionOnClientFacade;
import org.openqa.selenium.WebDriver;

public class BanUnbanUsersFacade {
    private LeftSideMenu leftSideMenu;
    private ActionOnClient actionOnUser;
    private ActionOnClientFacade actionOnUserFacade;

    public BanUnbanUsersFacade(WebDriver driver) {
        leftSideMenu = new LeftSideMenu(driver);
        actionOnUser = new ActionOnClient(driver);
    }

    public void clickActiveUsers() {
        leftSideMenu.clickOnMenuButtonUsers();
        actionOnUser.clickActiveButton();
    }

    public void clickBannedUsers() {
        leftSideMenu.clickOnMenuButtonUsers();
        actionOnUser.clickBannedButton();
    }

    public boolean banUser() {
        clickActiveUsers();
        String userName = actionOnUser.getFirstNameFromClient();
        actionOnUserFacade.clickToBanFirstClient();
        return actionOnUserFacade.checkIfClientMovedToBannedList(userName);

    }

    public boolean makeUserActive() {
        clickBannedUsers();
        String userName = actionOnUser.getFirstNameFromClient();
        actionOnUserFacade.clickToMakeFirstClientActive();
        return actionOnUserFacade.checkIfClientMovedToActiveList(userName);
    }
}
