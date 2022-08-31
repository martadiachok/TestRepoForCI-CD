package com.easyrest.facade.admin;

import com.easyrest.components.admin.ActionOnClient;
import com.easyrest.components.admin.LeftSideMenu;
import com.easyrest.pages.adminPanel.Moderators_AdminPanel;
import org.openqa.selenium.WebDriver;

public class ActionOnModeratorFacade extends ActionOnClientFacade {

    private LeftSideMenu leftSideMenu;
    private ActionOnClient actionOnModerator;
    private Moderators_AdminPanel moderatorsPage_adminPanel;

    public ActionOnModeratorFacade(WebDriver driver) {
        super(driver);
        leftSideMenu = new LeftSideMenu(driver);
        actionOnModerator = new ActionOnClient(driver);
    }

    private void clickActiveModerators() {
        leftSideMenu.clickModerators();
        actionOnModerator.clickActiveButton();
    }

    private void clickBannedModerators() {
        leftSideMenu.clickModerators();
        actionOnModerator.clickBannedButton();
    }

    public boolean banModerator() {
        clickActiveModerators();
        String userName = actionOnModerator.getFirstNameFromClient();
        clickToBanFirstClient();
        boolean isBanned = checkIfClientMovedToBannedList(userName);
        return isBanned;
    }

    public boolean makeModeratorActive() {
        clickBannedModerators();
        String userName = actionOnModerator.getFirstNameFromClient();
        clickToMakeFirstClientActive();
        boolean isActive = checkIfClientMovedToActiveList(userName);
        return isActive;
    }

}
