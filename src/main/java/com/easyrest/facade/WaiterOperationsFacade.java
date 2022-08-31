package com.easyrest.facade;

import com.easyrest.components.waiter.OrderAction;
import com.easyrest.components.waiter.WaiterMenu;
import com.easyrest.pages.WaiterPage;
import com.easyrest.pages.waiterPanel.AssignedWaiterOrders;
import com.easyrest.pages.waiterPanel.InProgressOrders;
import org.openqa.selenium.WebDriver;

public class WaiterOperationsFacade {
    private final WaiterPage waiterPage;
    private final OrderAction orderAction;

    public WaiterOperationsFacade(WebDriver driver) {
        this.waiterPage = new WaiterPage(driver);
        this.orderAction = new OrderAction(driver);
    }

    public void seeAllOrders() {
        goToTabMenu()
                .clickOnAllOrders();
    }

    public AssignedWaiterOrders seeAssignedWaiterOrders() {
        return goToTabMenu()
                .clickOnAssignedWaiterOrders();
    }

    public InProgressOrders seeInProgressOrders() {
        return goToTabMenu()
                .clickOnInProgressOrders();
    }

    public void seeOrdersHistory() {
        goToTabMenu()
                .clickOnOrdersHistory();
    }

    public Integer seeAssignedWaiterOrdersCount() {
        return seeAssignedWaiterOrders()
                .getOrdersCount();
    }

    public Integer seeInProgressOrdersCount() {
        return seeInProgressOrders()
                .getOrdersCount();
    }

    public void startOrder() {
        seeAssignedWaiterOrders()
                .getOrder()
                .clickOnExpandOrderDetails();
        orderAction.clickOnOrderAction();
    }

    public void closeOrder() {
        seeInProgressOrders()
                .getOrder()
                .clickOnExpandOrderDetails();
        orderAction.clickOnOrderAction();
    }

    private WaiterMenu goToTabMenu() {
        return waiterPage
                .getWaiterTabMenu();
    }

}
