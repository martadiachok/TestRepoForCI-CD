package com.easyrest.facade;

import com.easyrest.pages.SignInPage;
import org.openqa.selenium.WebDriver;

public class SignInFacade {

    private WebDriver driver;
    private SignInPage signInPage;

    public SignInFacade(WebDriver driver) {
        signInPage = new SignInPage(driver);

        this.driver = driver;
    }


    public void signIn (String userName, String password) {
        signInPage.inputEmail(userName)
                  .inputPassword(password)
                  .clickSignIn();
    }

}
