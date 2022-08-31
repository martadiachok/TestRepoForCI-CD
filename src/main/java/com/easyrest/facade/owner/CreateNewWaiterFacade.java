package com.easyrest.facade.owner;

import com.easyrest.components.HeaderForAuthorizedUser;
import com.easyrest.components.UserRoleMenuPanel;
import com.easyrest.components.customer.Right_sideMenu;
import com.easyrest.components.owner.CreateNewEmployee;
import com.easyrest.components.owner.LeftSideMenu;
import com.easyrest.components.owner.ManageMenu;
import com.easyrest.components.owner.Waiters;
import com.easyrest.pages.customerPanel.CurrentOrders;
import org.openqa.selenium.WebDriver;

public class CreateNewWaiterFacade {
    private HeaderForAuthorizedUser headerForAuthorizedUser;
    private Right_sideMenu right_sideMenu;
    private ManageMenu manageMenu;
    private LeftSideMenu leftSideMenu;
    private CreateNewEmployee createNewEmployee;
    private Waiters waiters;

    public CreateNewWaiterFacade(WebDriver driver) {
        headerForAuthorizedUser = new HeaderForAuthorizedUser(driver);
        right_sideMenu = new Right_sideMenu(driver);
        manageMenu = new ManageMenu(driver);
        leftSideMenu = new LeftSideMenu(driver);
        createNewEmployee = new CreateNewEmployee(driver);
        waiters = new Waiters(driver);
    }

    public void createNewWaiter(String name, String email, String phone, String password) {
        headerForAuthorizedUser.clickOnUserProfileIcon().clickOnTheFirstMenuItem();
        right_sideMenu.seeMyRestaurants();
        manageMenu.clickOnButtonRestaurantOption().clickOnMenuItemManage();
        leftSideMenu.clickOnMenuButtonWaiters();
        waiters.clickOnButtonAddWaiter().sendToFieldName(name).sendToFieldEmail(email).sendToFieldPhone(phone).sendToFieldPassword(password).clickOnButtonAdd();
    }
}
