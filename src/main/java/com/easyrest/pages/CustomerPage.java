package com.easyrest.pages;

import com.easyrest.components.AddRestaurant;
import com.easyrest.components.HeaderForAuthorizedUser;
import com.easyrest.components.UserRoleMenuPanel;
import com.easyrest.components.customer.Right_sideMenu;
import com.easyrest.pages.customerPanel.CurrentOrders;
import com.easyrest.pages.customerPanel.MyRestaurants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CustomerPage extends BasePage {

    private Right_sideMenu right_sideMenu;
    private MyRestaurants myRestaurants;
    private CurrentOrders currentOrders;
    private AddRestaurant addRestaurant;
    private HeaderForAuthorizedUser headerForAuthorizedUser;
    private UserRoleMenuPanel userRoleMenuPanel;


    public CustomerPage(WebDriver driver) {
        super(driver);
        addRestaurant = new AddRestaurant(driver);
        right_sideMenu = new Right_sideMenu(driver);
        myRestaurants = new MyRestaurants(driver);
        currentOrders = new CurrentOrders(driver);
        headerForAuthorizedUser = new HeaderForAuthorizedUser(driver);
        userRoleMenuPanel = new UserRoleMenuPanel(driver);

    }

}

