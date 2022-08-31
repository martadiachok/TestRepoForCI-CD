package com.easyrest.facade.admin;

import com.easyrest.components.admin.ActionOnClient;
import org.openqa.selenium.WebDriver;

/**
 * This class is facade of ActionOnClient component that contains methods to make action on client - ban client
 * or make him active and checks if client moved to correct list.
 * Client - any type of user role (owner or administrator or admin or waiter or moderator or user).
 */

public class ActionOnClientFacade {
    private WebDriver driver;
    private ActionOnClient actionOnClient;

    public ActionOnClientFacade(WebDriver driver){
        actionOnClient = new ActionOnClient(driver);

        this.driver = driver;
    }

    public ActionOnClientFacade clickToMakeFirstClientActive(){
        actionOnClient.clickBannedButton()
                      .makeActionOnFirstClient();
        return this;
    }

    public ActionOnClientFacade clickToBanFirstClient(){
        actionOnClient.clickActiveButton()
                      .makeActionOnFirstClient();
        return this;
    }

    public boolean checkIfClientMovedToBannedList(String name) {
        actionOnClient.clickBannedButton();
        return actionOnClient.findClientInListAfterAction(name);
    }

    public boolean checkIfClientMovedToActiveList(String name) {
        actionOnClient.clickActiveButton();
        return actionOnClient.findClientInListAfterAction(name);
    }

}


