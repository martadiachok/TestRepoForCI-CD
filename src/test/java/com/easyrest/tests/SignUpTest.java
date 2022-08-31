package com.easyrest.tests;

import com.easyrest.config.ConfigProvider;
import com.easyrest.facade.SignInFacade;
import com.easyrest.pages.SignInPage;
import com.easyrest.pages.SignUpPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;

public class SignUpTest extends BaseTest {

    private final String name = ConfigProvider.testName;
    private final String email = ConfigProvider.testEmail;
    private final String phoneNumber = ConfigProvider.testPhoneNumber;
    private final String birthDate = ConfigProvider.testBirthDate;
    private final String birthMonth = ConfigProvider.testBirthMonth;
    private final String birthYear = ConfigProvider.testBirthYear;
    private final String password = ConfigProvider.testPassword;

    private SignUpPage signUpPage;
    private SignInPage signInPage;
    private SignInFacade signInFacade;
    private WebDriverWait wait;

    private void waitForUrlPresence(String pageUrl) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.urlToBe(pageUrl));
    }

    @Test (priority = 1)
    public void signUpPositiveTest() {
        signUpPage = new SignUpPage(driver);

        signUpPage.goToSignUpPage();
        signUpPage.inputName(name);
        signUpPage.inputEmail(email);
        signUpPage.inputPhone(phoneNumber);
        signUpPage.clickOnBirthdayField().inputDate(birthYear, birthMonth, birthDate);
        signUpPage.inputPassword(password);
        signUpPage.clickCreateAccount();
        waitForUrlPresence(ConfigProvider.signInPageUrl);

        Assert.assertEquals(driver.getCurrentUrl(), ConfigProvider.signInPageUrl, "Sign up failed. Sign in page was not reached.");
    }

    @Test (priority = 2)
    public void secondCheckSignUp_tryToSignIn() {
        signInPage = new SignInPage(driver);
        signInFacade = new SignInFacade(driver);

        signInPage.goToSignInPage();
        signInFacade.signIn(email, password);
        waitForUrlPresence(ConfigProvider.restaurantsPageUrl);

        Assert.assertEquals(driver.getCurrentUrl(), ConfigProvider.restaurantsPageUrl, "Sign in of new user was not successful. Restaurant page was not reached.");
    }

}
