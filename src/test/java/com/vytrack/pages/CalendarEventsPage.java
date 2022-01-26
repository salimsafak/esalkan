package com.vytrack.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.Driver;

/**
 * @author esalkan
 * @project TestAutomationTasks
 */
public class CalendarEventsPage extends BasePage {

    public String pageSubtitle(String text) {
        WebElement str = Driver.getDriver().findElement(By.xpath("//*[@class='btn btn-link dropdown-toggle' and contains(text(),'" + text + "')]"));
        return str.getText();
    }
}
