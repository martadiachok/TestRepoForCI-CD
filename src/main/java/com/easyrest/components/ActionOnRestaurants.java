package com.easyrest.components;

import com.easyrest.pages.moderatorPanel.*;
import com.easyrest.pages.OwnerPanel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ActionOnRestaurants {
    private WebDriver driver;

    private final By allButton = By.xpath("// span [contains (text(), 'All')]");
    private final By unapprovedButton = By.xpath("// span [contains (text(), 'Unapproved ')]");
    private final By approvedButton = By.xpath("// span [contains (text(), 'Approved ')]");
    private final By archivedButton = By.xpath("//span [contains (text(), 'Archived')]/parent::span");
    private final By approveButton = By.xpath("//div[contains (@class, 'MuiGrid-item')][1]//span [text() = 'Approve']");
    private final By disapproveButton = By.xpath("//div[contains (@class, 'MuiGrid-item')][1]//span [text() = 'Disapprove']");
    private final By archiveButton = By.xpath("//div[contains (@class, 'MuiGrid-item')][1]//span [text() = 'Delete']");
    private final By restoreButton = By.xpath("//div[contains (@class, 'MuiGrid-item')][1]//span [text() = 'Restore']");
    private final By restaurantsName = By.xpath("//div[contains (@class, 'MuiGrid-item')][1]//span [contains(@class,'MuiCardHeader-title-' )]");

    public ActionOnRestaurants(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnButtonAll() {
        driver.findElement(allButton).click();
    }

    public void clickOnButtonUnapproved() {
        driver.findElement(unapprovedButton).click();
    }

    public void clickOnButtonApproved() {
        driver.findElement(approvedButton).click();
    }

    public void clickOnButtonArchived() {
        driver.findElement(archivedButton).click();
    }

    public void approveRestaurant() {
        driver.findElement(approveButton).click();
    }

    public void disapproveRestaurant() {
        driver.findElement(disapproveButton).click();
    }

    public void archiveRestaurant() {
        driver.findElement(archiveButton).click();
    }

    public void restoreRestaurant() {
        driver.findElement(restoreButton).click();
    }

    public String getFirstNameFromRestaurant() {
        List<WebElement> restaurantList = driver.findElements(restaurantsName);
        WebElement firstNameFromList = restaurantList.get(0);
        return firstNameFromList.getText();
    }

    public boolean findRestaurantInListAfterAction(String name) {
        List<WebElement> restaurantsNames = driver.findElements(restaurantsName);
        for (WebElement item : restaurantsNames) {
            if (item.getText() == name) {
                return true;
            }
        }
        return false;
    }
}
