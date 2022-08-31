package com.easyrest.facade.admin;

import com.easyrest.components.admin.ActionOnClient;
import com.easyrest.components.admin.LeftSideMenu;
import org.openqa.selenium.WebDriver;

public class ActionOnOwnerFacade extends ActionOnClientFacade {

    private LeftSideMenu leftSideMenu;
    private ActionOnClient actionOnOwner;

    public ActionOnOwnerFacade(WebDriver driver) {
        super(driver);
        leftSideMenu = new LeftSideMenu(driver);
        actionOnOwner = new ActionOnClient(driver);
    }

    private void clickActiveOwners() {
        leftSideMenu.clickOwners();
        actionOnOwner.clickActiveButton();
    }

    private void clickBannedOwners() {
        leftSideMenu.clickOwners();
        actionOnOwner.clickBannedButton();
    }

    public boolean banOwners() {
        clickActiveOwners();
        String userName = actionOnOwner.getFirstNameFromClient();
        clickToBanFirstClient();
        boolean isBanned = checkIfClientMovedToBannedList(userName);
        return isBanned;
    }

    public boolean makeOwnersActive() {
        clickBannedOwners();
        String userName = actionOnOwner.getFirstNameFromClient();
        clickToMakeFirstClientActive();
        boolean isActive = checkIfClientMovedToActiveList(userName);
        return isActive;
    }

}
