package com.easyrest.facade.moderator;

import com.easyrest.components.admin.ActionOnClient;
import com.easyrest.components.moderator.LeftSideMenu;
import com.easyrest.facade.admin.ActionOnClientFacade;
import org.openqa.selenium.WebDriver;

public class BanUnbanOwnersFacade {
    private LeftSideMenu leftSideMenu;
    private ActionOnClient actionOnOwner;
    private ActionOnClientFacade actionOnOwnerFacade;

    public BanUnbanOwnersFacade(WebDriver driver) {
        leftSideMenu = new LeftSideMenu(driver);
        actionOnOwner = new ActionOnClient(driver);
        actionOnOwnerFacade = new ActionOnClientFacade(driver);
    }

    public void clickActiveOwners() {
        leftSideMenu.clickOnMenuButtonOwners();
        actionOnOwner.clickActiveButton();
    }

    public void clickBannedOwners() {
        leftSideMenu.clickOnMenuButtonOwners();
        actionOnOwner.clickBannedButton();
    }

    public boolean banOwners() {
        clickActiveOwners();
        String userName = actionOnOwner.getFirstNameFromClient();
        actionOnOwnerFacade.clickToBanFirstClient();
        return actionOnOwnerFacade.checkIfClientMovedToBannedList(userName);
    }

    public boolean makeOwnersActive() {
        clickBannedOwners();
        String userName = actionOnOwner.getFirstNameFromClient();
        actionOnOwnerFacade.clickToMakeFirstClientActive();
        return actionOnOwnerFacade.checkIfClientMovedToActiveList(userName);

    }
}
