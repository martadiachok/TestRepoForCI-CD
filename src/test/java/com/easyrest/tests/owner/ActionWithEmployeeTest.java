package com.easyrest.tests.owner;

import com.easyrest.components.owner.*;
import com.easyrest.config.ConfigProvider;
import com.easyrest.facade.SignInFacade;
import com.easyrest.facade.owner.CreateNewAdministratorFacade;
import com.easyrest.facade.owner.CreateNewWaiterFacade;
import com.easyrest.pages.SignInPage;
import com.easyrest.tests.BaseTest;
import com.easyrest.userData.FakeData;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActionWithEmployeeTest extends BaseTest {

    private final String ownerEmail = ConfigProvider.ownerEmail;
    private final String ownerPassword = ConfigProvider.ownerPassword;
    private SignInPage signInPage;
    private SignInFacade signInFacade;
    private CreateNewWaiterFacade createNewWaiterFacade;
    private CreateNewAdministratorFacade createNewAdministratorFacade;
    private Waiters waiters;
    private Administrators administrators;
    private CreateNewEmployee createNewEmployee;

    @BeforeMethod
    public void goToSignInOwner() {
        signInPage = new SignInPage(driver);
        signInFacade = new SignInFacade(driver);
        signInPage.goToSignInPage();
        signInFacade.signIn(ownerEmail, ownerPassword);

    }

    @Test
    public void addWaiterTest() {
        createNewWaiterFacade = new CreateNewWaiterFacade(driver);
        createNewEmployee = new CreateNewEmployee(driver);
        String name = FakeData.getFullName();
        String email = FakeData.getEmail();
        String phone = FakeData.getPhone();
        String password = FakeData.getPassword();
        createNewWaiterFacade.createNewWaiter(name, email, phone, password);
        Assert.assertTrue(createNewEmployee.isEmployeeDisplayed(name), "The waiter has not been added");
    }

    @Test
    public void deleteWaiterTest() {
        waiters = new Waiters(driver);
        createNewWaiterFacade = new CreateNewWaiterFacade(driver);
        String name = FakeData.getFullName();
        String email = FakeData.getEmail();
        String phone = FakeData.getPhone();
        String password = FakeData.getPassword();
        createNewWaiterFacade.createNewWaiter(name, email, phone, password);
        driver.navigate().refresh();
        Integer waitersCountBefore = waiters.getWaitersCount();
        waiters.clickOnButtonDeleteWaiter();
        driver.navigate().refresh();
        Integer waitersCountAfter = waiters.getWaitersCount();
        Assert.assertEquals(waitersCountAfter, waitersCountBefore - 1, "The waiter has not been delete");
    }

    @Test
    public void addAdministratorTest() {
        createNewAdministratorFacade = new CreateNewAdministratorFacade(driver);
        createNewEmployee = new CreateNewEmployee(driver);
        String name = FakeData.getFullName();
        String email = FakeData.getEmail();
        String phone = FakeData.getPhone();
        String password = FakeData.getPassword();
        createNewAdministratorFacade.createNewAdministrator(name, email, phone, password);
        Assert.assertTrue(createNewEmployee.isEmployeeDisplayed(name), "The administrator has not been added");
    }

    @Test
    public void deleteAdministratorTest() {
        createNewAdministratorFacade = new CreateNewAdministratorFacade(driver);
        administrators = new Administrators(driver);
        String name = FakeData.getFullName();
        String email = FakeData.getEmail();
        String phone = FakeData.getPhone();
        String password = FakeData.getPassword();
        createNewAdministratorFacade.createNewAdministrator(name, email, phone, password);
        driver.navigate().refresh();
        administrators.clickOnButtonDeleteAdministrator();
        Assert.assertTrue(administrators.viewDisplayedText(), "The administrator has not been delete");
    }
}
