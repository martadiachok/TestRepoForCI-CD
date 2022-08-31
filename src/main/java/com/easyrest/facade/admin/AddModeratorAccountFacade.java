package com.easyrest.facade.admin;

import com.easyrest.components.Calendar;
import com.easyrest.components.admin.CreateModeratorAccountForm;
import com.easyrest.components.admin.LeftSideMenu;
import com.easyrest.pages.adminPanel.Moderators_AdminPanel;
import org.openqa.selenium.WebDriver;

public class AddModeratorAccountFacade {
    private WebDriver driver;

    private LeftSideMenu leftSideMenu;
    private Moderators_AdminPanel moderatorsPage_adminPanel;
    private CreateModeratorAccountForm createModeratorAccountForm;
    private Calendar calendar;

    public AddModeratorAccountFacade(WebDriver driver) {
        leftSideMenu = new LeftSideMenu(driver);
        moderatorsPage_adminPanel = new Moderators_AdminPanel(driver);
        createModeratorAccountForm = new CreateModeratorAccountForm(driver);
        calendar = new Calendar(driver);

        this.driver = driver;
    }

    private CreateModeratorAccountForm clickAddModerator() {
        leftSideMenu.clickModerators();
        moderatorsPage_adminPanel.clickOnCreateModerator();
        return new CreateModeratorAccountForm(driver);
    }

    public Moderators_AdminPanel submitAddModeratorForm(String name, String email, String phone, String password,
                                                        String date, String month, String year) {
        clickAddModerator();
        createModeratorAccountForm.inputName(name);
        createModeratorAccountForm.inputEmail(email);
        createModeratorAccountForm.inputPhone(phone);
        createModeratorAccountForm.inputPassword(password);
        createModeratorAccountForm.clickOnBirthdayField();
        calendar.inputDate(year, month, date);
        createModeratorAccountForm.clickCreateAccount();
        return new Moderators_AdminPanel(driver);
    }

}
