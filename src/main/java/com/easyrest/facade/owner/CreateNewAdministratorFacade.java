package com.easyrest.facade.owner;

import com.easyrest.components.HeaderForAuthorizedUser;
import com.easyrest.components.UserRoleMenuPanel;
import com.easyrest.components.customer.Right_sideMenu;
import com.easyrest.components.owner.*;
import org.openqa.selenium.WebDriver;

public class CreateNewAdministratorFacade {

    private HeaderForAuthorizedUser headerForAuthorizedUser;
    private Right_sideMenu right_sideMenu;
    private ManageMenu manageMenu;
    private LeftSideMenu leftSideMenu;
    private CreateNewEmployee createNewEmployee;


    public CreateNewAdministratorFacade(WebDriver driver) {
        headerForAuthorizedUser = new HeaderForAuthorizedUser(driver);
        right_sideMenu = new Right_sideMenu(driver);
        manageMenu = new ManageMenu(driver);
        leftSideMenu = new LeftSideMenu(driver);
        createNewEmployee = new CreateNewEmployee(driver);
    }

    public void createNewAdministrator(String name, String email, String phone, String password) {
        headerForAuthorizedUser.clickOnUserProfileIcon().clickOnTheFirstMenuItem();
        right_sideMenu.seeMyRestaurants();
        manageMenu.clickOnButtonRestaurantOption().clickOnMenuItemManage();
        leftSideMenu.clickOnMenuButtonAdministrators().clickOnButtonAddAdministrator();
        createNewEmployee.sendToFieldName(name).sendToFieldEmail(email).sendToFieldPhone(phone).sendToFieldPassword(password).clickOnButtonAdd();
    }
}
