package com.vytrack.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Driver;

/**
 * @author esalkan
 * @project TestAutomationTasks
 */
public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "div[class='loader-mask shown']")
    @CacheLookup
    protected WebElement loaderMask;

    public void waitUntilLoaderScreenDisappear() {
        try {
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 5);
            wait.until(ExpectedConditions.invisibilityOf(loaderMask));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void navMenu(String topLevelMenu, String subLevelMenu) {
        String topLevelMenuLocator = "//*/ul/li/a/span[@class='title title-level-1' and contains(text(),'" + topLevelMenu + "')]";
        String subLevelMenuLocator = "//*/ul/li/a/span[@class='title title-level-2' and contains(text(), '" + subLevelMenu + "')]";

        WebElement navMenu = Driver.getDriver().findElement(By.xpath(topLevelMenuLocator));
        new Actions(Driver.getDriver()).moveToElement(navMenu).pause(200).doubleClick(navMenu).perform();

        WebElement subMenu = Driver.getDriver().findElement(By.xpath(subLevelMenuLocator));
        new Actions(Driver.getDriver()).moveToElement(navMenu).pause(200).doubleClick(subMenu).perform();

    }

}
