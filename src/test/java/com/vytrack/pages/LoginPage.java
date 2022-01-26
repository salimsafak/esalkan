package com.vytrack.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

/**
 * @author esalkan
 * @project TestAutomationTasks
 */
public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindAll({
            @FindBy(id = "prependedInput"),
            @FindBy(name = "_username")
    })
    public WebElement userNameInput;

    @FindBy(id = "prependedInput2")
    public WebElement userPasswordInput;

    @FindBy(id = "_submit")
    public WebElement loginBtn;


    /**
     * This Method usage just for login functionality
     * @param username
     * @param password
     */
    public void login(String username, String password){
        userNameInput.sendKeys(username);
        userPasswordInput.sendKeys(password);
        loginBtn.click();
    }


}
