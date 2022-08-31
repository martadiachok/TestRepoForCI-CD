package com.easyrest.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Calendar {
    private WebDriver driver;

    private final By chooseYearButton = By.xpath("//*[text()='2022']");
    private final By yearList = By.xpath("//div[@role='button']");
    private final By monthName = By.xpath("//*[@class='MuiTypography-root-41 MuiTypography-body1-50 MuiTypography-alignCenter-64']");
    private final By switchMonthLeftButton = By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div[1]/button[1]");
    private final By switchMonthRightButton = By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[2]/div[1]/button[2]");
    private final By monthDates = By.xpath("//div[@role='presentation']");
    private final By confirmFormButton = By.xpath("//span[text()='OK']");
    private final By cancelFormButton = By.xpath("//span[text()='Cancel']");

    public Calendar(WebDriver driver) {
        this.driver = driver;
    }

    public void inputDate(String year, String month, String date) {
        // choose year
        driver.findElement(chooseYearButton).click();

        List<WebElement> years = driver.findElements(yearList);
        int yearListSize = years.size();

        for (int i = 0; i < yearListSize; i++) {
            String text = years.get(i).getText();
            if (text.equalsIgnoreCase(year)) {
                years.get(i).click();
                break;
            }
        }
        //choose month
        while (!driver.findElement(monthName).getText().contains(month)) {
            driver.findElement(switchMonthLeftButton)
                    .click();
        }
        //choose day
        List<WebElement> dates = driver.findElements(monthDates);
        int count = dates.size();

        for (int i = 0; i < count; i++) {
            String text = dates.get(i).getText();
            if (text.equalsIgnoreCase(date)) {
                dates.get(i).click();
                break;
            }
        }
        driver.findElement(confirmFormButton).click();
    }

}
