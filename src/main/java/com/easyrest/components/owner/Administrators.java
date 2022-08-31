package com.easyrest.components.owner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Administrators {
    private WebDriver driver;
    private final By addAdministratorButton = By.xpath("//button[@title = 'Add Administrator']");
    private final By deleteAdministratorButton = By.xpath("//li[contains (@class, 'MuiListItem-root')][1]//*[@viewBox='0 0 24 24']");
    private final By createYourWorkerText = By.xpath("//h6[text()= 'Create your worker:']");

    public Administrators(WebDriver driver) {
        this.driver = driver;
    }

    public CreateNewEmployee clickOnButtonAddAdministrator() {
        driver.findElement(addAdministratorButton).click();
        return new CreateNewEmployee(driver);
    }

    public void clickOnButtonDeleteAdministrator() {
        driver.findElement(deleteAdministratorButton).click();
    }

    public boolean viewDisplayedText() {
        return driver.findElement(createYourWorkerText).isDisplayed();
    }
}
