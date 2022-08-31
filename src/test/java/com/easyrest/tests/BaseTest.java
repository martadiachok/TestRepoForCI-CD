package com.easyrest.tests;

import com.easyrest.constants.Constants;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.*;
import java.io.IOException;
import java.time.Duration;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import java.io.File;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

abstract public class BaseTest {
    protected WebDriver driver;
    protected ExtentReports extent;
    protected ExtentTest test;
    protected ExtentSparkReporter spark;
    protected DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
    protected LocalDateTime now = LocalDateTime.now();
    protected String currentDate = dateTimeFormatter.format(now);

    public WebDriver getDriver(){
        return driver;
    }

    /**
     * Initialization of webdriver and assigning the settings for the webdriver
     */
    @BeforeSuite
    public void setUp() {
        // method setup() - download webdriver and show path to it
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constants.TimeoutVariable.IMPLICIT_WAIT));
        String reportPath = System.getProperty("user.dir") + "/reports/index.html";
        // Create object of ExtentSparkReporter class and set up address for report saving
        spark = new ExtentSparkReporter(reportPath);
        spark.config().setDocumentTitle("EasyRest Test Results");
        // Create object of ExtentReports class who is responsible for executing reports
        extent = new ExtentReports();
        // give knowledge about report from ExtentSparkReporter class to main class ExtentReports
        extent.attachReporter(spark);
    }

   public void getScreenShotPath(String testCaseName) throws IOException {
        TakesScreenshot takeScreenshots = (TakesScreenshot) driver;
        File source = takeScreenshots.getScreenshotAs(OutputType.FILE);
        String destinationFile = System.getProperty("user.dir") + "/screenshots/" + testCaseName + "_" + currentDate + ".png";
        // Address for Windows below
        //String destinationFile = System.getProperty("user.dir") + "\\screenshots\\" + testCaseName + "_" + currentDate + ".png";
        FileUtils.copyFile(source, new File(destinationFile));
    }

    @AfterSuite
    public void tearDown() {
        // закриває хром драйвер, драйвер відповідає за процес взаємодії з браузером
        driver.close();

        // закриваємо браузер (хром)
        driver.quit();

        //indicates that test is done and will not be monitored anymore
        extent.flush();
    }

}
