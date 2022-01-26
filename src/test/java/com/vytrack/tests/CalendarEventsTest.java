package com.vytrack.tests;

import com.vytrack.TestBase;
import com.vytrack.pages.CalendarEventsPage;
import com.vytrack.pages.DashboardPage;
import com.vytrack.pages.LoginPage;
import static org.testng.Assert.*;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


/**
 * @author esalkan
 * @project TestAutomationTasks
 */
public class CalendarEventsTest extends TestBase {
    /**
     * Task 01 :
     *     1. Go to "https://qa1.vytrack.com/"
     *     2. Login as a "store manager" and "sales manager"
     *     3. Navigate to "Activities -> Calendar Events"
     *     4. Verify that page subtitle "Options" is displayed.
     */

    // Test Data
    @DataProvider
    public Object[][] testData() {
        String[][] data = {
                {"storemanager85", "UserUser123"}
                // {"salesmanager101", "UserUser123"}
        };
        return data;
    }

    // 1. Go to "https://qa1.vytrack.com/" [in TestBase DONE!]

    @Test(dataProvider = "testData")
    public void Task01(String userName, String password) throws InterruptedException {
        // 2. Login as a "store manager" and "sales manager"
        LoginPage loginPage = new LoginPage();
        loginPage.login(userName,password);

        // Waiting until loader spin is disappear
        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.waitUntilLoaderScreenDisappear();

        // 3. Navigate to "Activities -> Calendar Events"
        dashboardPage.navMenu("Activities", "Calendar Events");
        dashboardPage.waitUntilLoaderScreenDisappear();


        // 4. Verify that page subtitle "Options" is displayed.
        CalendarEventsPage calendarEventsPage = new CalendarEventsPage();
        assertEquals(calendarEventsPage.pageSubtitle("Options"),"Options");
    }
}
