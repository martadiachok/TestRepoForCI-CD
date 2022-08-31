package com.easyrest.tests;

import com.aventstack.extentreports.ExtentReports;
import com.easyrest.config.ConfigProvider;
import com.easyrest.pages.SignUpPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginTest extends BaseTest {
    @Test
    public void testLogin() throws InterruptedException {
        extent = new ExtentReports();
        // catch object from class ExtentReports to class ExtentTest and catch test results (have methods pass, fail etc);
        test = extent.createTest("LoginTest");
        //ExtentSparkReporter spark = new ExtentSparkReporter("src/test/Reports/loginTest_28.06.2022");
        //extent.attachReporter(spark);

       /* SignUpPage page = new SignUpPage(driver);

        page.goToSignUpPage();

        page.clickOnBirthdayField().inputDate("2012", "July", "7");

        Thread.sleep(3000);

        Assert.assertEquals(driver.getCurrentUrl(), ConfigProvider.logInPageUrl); */

        String clientEmail = ConfigProvider.clientEmail;
        String clientPassword = ConfigProvider.clientPassword;

        driver.get(ConfigProvider.logInPageUrl);

        WebElement inputEmail = driver.findElement(By.xpath("/html/body/div/main/div/div[2]/form/div/div[1]/div/div/input"));
        inputEmail.clear();
        inputEmail.sendKeys(clientEmail);
        test.info("Email has been entered.");
        Thread.sleep(1500);
        WebElement inputPassword = driver.findElement(By.xpath("/html/body/div/main/div/div[2]/form/div/div[2]/div/div/input"));
        inputPassword.clear();
        inputPassword.sendKeys(clientPassword);
        test.info("Password has been entered.");
        Thread.sleep(2000);

        WebElement buttonSignIn = driver.findElement(By.xpath("/html/body/div/main/div/div[2]/form/div/div[3]/div/button/span[1]"));
        buttonSignIn.click();
        test.info("SignIn button has been clicked.");
        Thread.sleep(5000);

        Assert.assertEquals(driver.getCurrentUrl(), ConfigProvider.signUpPageUrl);
    }
}
