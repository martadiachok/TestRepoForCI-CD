package com.easyrest.tests.adminTests;

import com.easyrest.components.Calendar;
import com.easyrest.components.admin.ActionOnClient;
import com.easyrest.components.admin.CreateModeratorAccountForm;
import com.easyrest.config.ConfigProvider;
import com.easyrest.facade.SignInFacade;
import com.easyrest.facade.admin.ActionOnClientFacade;
import com.easyrest.pages.SignInPage;
import com.easyrest.pages.adminPanel.Moderators_AdminPanel;
import com.easyrest.tests.BaseTest;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.easyrest.constants.Constants.TimeoutVariable.EXPLICIT_WAIT;

public class AddModeratorTest extends BaseTest {

    private final String adminEmail = ConfigProvider.adminEmail;
    private final String adminPassword = ConfigProvider.adminPassword;
    private final String name = ConfigProvider.nameModerator;
    private final String email = ConfigProvider.emailModerator;
    private final String password = ConfigProvider.passwordModerator;
    private final String phone = ConfigProvider.phoneModerator;
    private final String birthDate = ConfigProvider.birthDateModerator;
    private final String birthMonth = ConfigProvider.birthMonthModerator;
    private final String birthYear = ConfigProvider.birthYearModerator;
    private final boolean isModeratorCreated = true;

    private SignInPage signInPage;
    private SignInFacade signInFacade;
    private Moderators_AdminPanel moderatorsPage;
    private CreateModeratorAccountForm createModeratorForm;
    private ActionOnClient actionOnModeratorPage;
    private ActionOnClientFacade actionOnModeratorFacade;
    private Calendar calendar;
    private WebDriverWait wait;

    private void waitForUrlPresence(String pageUrl) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
        wait.until(ExpectedConditions.urlToBe(pageUrl));
    }

    @BeforeClass
    public void preconditions() {
        signInPage = new SignInPage(driver);
        signInFacade = new SignInFacade(driver);

        signInPage.goToSignInPage();
        signInFacade.signIn(adminEmail, adminPassword);
        waitForUrlPresence(ConfigProvider.adminPageUrl);
    }

    @Test
    public void addModerator() {
        moderatorsPage = new Moderators_AdminPanel(driver);
        createModeratorForm = new CreateModeratorAccountForm(driver);
        calendar = new Calendar(driver);

        moderatorsPage.goToAdminPanel_ModeratorPage().clickOnCreateModerator();
        createModeratorForm.inputName(name)
                           .inputEmail(email)
                           .inputPhone(phone)
                           .clickOnBirthdayField()
                           .inputDate(birthYear, birthMonth, birthDate);
        createModeratorForm.inputPassword(password)
                           .clickCreateAccount();

        waitForUrlPresence(ConfigProvider.adminPanelModeratorsUrl);
        Assert.assertEquals(driver.getCurrentUrl(), ConfigProvider.adminPanelModeratorsUrl, "Moderator was not added");
    }

    @Test (dependsOnMethods = { "addModerator" })
    public void secondCheckIfModeratorIsAdded(){
        moderatorsPage = new Moderators_AdminPanel(driver);
        actionOnModeratorPage = new ActionOnClient(driver);
        actionOnModeratorFacade= new ActionOnClientFacade(driver);

        moderatorsPage.goToAdminPanel_ModeratorPage();
        boolean actualBoolean = actionOnModeratorFacade.checkIfClientMovedToActiveList(name);

        Assert.assertEquals(actualBoolean, isModeratorCreated, "New moderator is not found in list.");
    }

}
