package com.easyrest.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class TimePicker {

    private WebDriver driver;

    private final By amButton = By.xpath("//*[text()='AM']");
    private final By pmButton = By.xpath("//*[text()='PM']");
    private final By hour = By.xpath("//h2[contains (@class, 'MuiPickersToolbarButton')][1]");
    private final By minute = By.xpath("//h2[contains (@class, 'MuiPickersToolbarButton')][3]");
    private final By hoursInClock = By.xpath("//span[contains(@class,'MuiPickersClockNumber-clockNumber')]");
    private final By minutesInClock = By.xpath("//span[contains(@class,'MuiPickersClockNumber-clockNumber')]");
    private final WebElement clockPointer = driver.findElement(By.xpath("//div[contains(@class,'MuiPickersClockPointer-thumb')]"));
    private final By okButton = By.xpath("//*[text()='OK']");
    private final By cancelButton = By.xpath("//*[text()='Cancel']");
    private Actions actions = new Actions(driver);
    public TimePicker(WebDriver driver) {
        this.driver = driver;
    }

    public TimePicker clickAM(){
        driver.findElement(amButton).click();
        return this;
    }

    public TimePicker clickPM(){
        driver.findElement(pmButton).click();
        return this;
    }

    public TimePicker clickToChooseHour(){
        driver.findElement(hour).click();
        return this;
    }

    public TimePicker clickToChooseMinutes(){
        driver.findElement(minute).click();
        return this;
    }

    public TimePicker chooseHour(int hour){
        hour = hour - 1;
        List<WebElement> hoursList = driver.findElements(hoursInClock);
        WebElement chosenHour = hoursList.get(hour);
        actions.dragAndDrop(clockPointer,chosenHour).perform();
        return this;
    }

    public TimePicker chooseMinutes (String minutes){
        List<WebElement> minutesList = driver.findElements(minutesInClock);
        for(int i = 0; i < minutesList.size(); i++) {
            String getTextFromMinutes = minutesList.get(i).getText();
            if(getTextFromMinutes.equalsIgnoreCase("15")){
                WebElement chosenMinute = minutesList.get(i);
                actions.dragAndDrop(clockPointer,chosenMinute).perform();
                break;
            } else throw new RuntimeException("Parameter minutes was not found.");
        }
        return this;
    }

    public void clickOK(){
        driver.findElement(okButton).click();
    }

    public void clickCancel(){
        driver.findElement(cancelButton).click();
    }

}
