package com.easyrest.pages.adminPanel;

import com.easyrest.config.ConfigProvider;
import com.easyrest.pages.BasePage;
import org.openqa.selenium.WebDriver;

public class Owners_AdminPanel extends BasePage {

    public Owners_AdminPanel(WebDriver driver) { super(driver); }

    public Owners_AdminPanel goToAdminPanel_OwnerPage(){
        openPage(ConfigProvider.adminPanelOwnersUrl);
        return this;
    }

}
