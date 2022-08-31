package com.easyrest.pages.adminPanel;

import com.easyrest.config.ConfigProvider;
import com.easyrest.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Moderators_AdminPanel extends BasePage {

    private final By addModeratorButton = By.xpath("//span[text()='Add moderator']");

    public Moderators_AdminPanel(WebDriver driver) { super(driver); }

    public Moderators_AdminPanel goToAdminPanel_ModeratorPage(){
        openPage(ConfigProvider.adminPanelModeratorsUrl);
        return this;
    }

    public void clickOnCreateModerator(){
        driver.findElement(addModeratorButton).click();
    }

}
