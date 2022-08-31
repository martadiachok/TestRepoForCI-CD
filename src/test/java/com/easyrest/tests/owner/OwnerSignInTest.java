package com.easyrest.tests.owner;

import com.easyrest.config.ConfigProvider;
import com.easyrest.facade.SignInFacade;
import com.easyrest.pages.OwnerPanel;
import com.easyrest.pages.SignInPage;
import com.easyrest.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OwnerSignInTest extends BaseTest {

    private final String ownerEmail = ConfigProvider.ownerEmail;
    private final String ownerPassword = ConfigProvider.ownerPassword;
    private SignInPage signInPage;
    private SignInFacade signInFacade;
    private OwnerPanel ownerPanel;

    @Test
    public void signInTestsOwner() {
        signInPage = new SignInPage(driver);
        signInFacade = new SignInFacade(driver);
        ownerPanel = new OwnerPanel(driver);
        signInPage.goToSignInPage();
        signInFacade.signIn(ownerEmail, ownerPassword);
        ownerPanel.waitForPagePresence();
        Assert.assertEquals(driver.getCurrentUrl(), ConfigProvider.ownerPageUrl, "Failed to login");
    }
}
