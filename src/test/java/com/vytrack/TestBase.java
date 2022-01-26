package com.vytrack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.Driver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

/**
 * @author esalkan
 * @project TestAutomationTasks
 */
public class TestBase {

    WebDriver driver;
    WebDriverWait wait;
    Actions action;

    @BeforeMethod
    public void setUp(){
        driver = Driver.getDriver();
        driver.get("https://qa1.vytrack.com/");
        wait = new WebDriverWait(driver, 5);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        action = new Actions(driver);
    }

    @AfterMethod
    public void tearDown(){
        Driver.closeDriver();
    }

}
