package com.easyrest.pages;

import com.easyrest.components.HeaderForAuthorizedUser;
import com.easyrest.components.waiter.WaiterMenu;
import org.openqa.selenium.WebDriver;

public class WaiterPage extends BasePage {

    public WaiterPage(WebDriver driver) {
        super(driver);
    }

    public HeaderForAuthorizedUser getToolbarMenu() {
        return new HeaderForAuthorizedUser(driver);
    }

    public WaiterMenu getWaiterTabMenu() {
        return new WaiterMenu(driver);
    }

}
