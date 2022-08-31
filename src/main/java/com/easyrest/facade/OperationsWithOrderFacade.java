package com.easyrest.facade;

import com.easyrest.components.customer.Right_sideMenu;
import com.easyrest.pages.customerPanel.CurrentOrders;
import org.openqa.selenium.WebDriver;

public class OperationsWithOrderFacade {

    private WebDriver driver;

    private Right_sideMenu right_sideMenu;
    private CurrentOrders currentOrders;

    public OperationsWithOrderFacade(WebDriver driver){
        this.driver = driver;
        right_sideMenu = new Right_sideMenu(driver);
        currentOrders = new CurrentOrders(driver);
    }

    public void seeDetailsOrder(){
        right_sideMenu.seeCurrentOrdersTab();
        currentOrders.seeWaitingForConfirmOrders().seeOrderDetails();
    }

    public void declineOrder(){
        right_sideMenu.seeCurrentOrdersTab().seeWaitingForConfirmOrders().seeOrderDetails().declineOrder();
    }

    public void seeAcceptedOrders(){
        right_sideMenu.seeCurrentOrdersTab().seeAcceptedOrders();
    }

    public void seeInProgressOrders(){
        right_sideMenu.seeCurrentOrdersTab().seeInProgressOrders();
    }

}
