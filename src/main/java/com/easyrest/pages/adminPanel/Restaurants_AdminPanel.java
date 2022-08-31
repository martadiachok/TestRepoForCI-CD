package com.easyrest.pages.adminPanel;

import com.easyrest.components.admin.LeftSideMenu;
import com.easyrest.config.ConfigProvider;
import com.easyrest.pages.BasePage;
import org.openqa.selenium.WebDriver;

public class Restaurants_AdminPanel extends BasePage {
    public Restaurants_AdminPanel(WebDriver driver) { super(driver); }

    public Restaurants_AdminPanel goToAdminPanel_RestaurantsPage(){
        openPage(ConfigProvider.adminPanelRestaurantUrl);
        return this;
    }

}
