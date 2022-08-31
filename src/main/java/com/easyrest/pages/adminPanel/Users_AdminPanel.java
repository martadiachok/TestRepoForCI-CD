package com.easyrest.pages.adminPanel;

import com.easyrest.config.ConfigProvider;
import com.easyrest.pages.BasePage;
import org.openqa.selenium.WebDriver;

public class Users_AdminPanel extends BasePage {

    public Users_AdminPanel(WebDriver driver) {
        super(driver);
    }

    public Users_AdminPanel goToAdminPanel_UsersPage(){
        openPage(ConfigProvider.adminPanelUsersUrl);
        return this;
    }

}
