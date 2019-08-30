package com.bitrix.pages.login_navigation;

import com.bitrix.utilities.ConfigurationReader;
import com.bitrix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "USER_LOGIN")
    public WebElement userNameElement;

    @FindBy(name = "USER_PASSWORD")
    public WebElement passwordElement;

    @FindBy(className = "login-btn")
    public WebElement loginBtn;

    @FindBy(className = "errortext")
    public WebElement errortext;

    public void login(String username, String password) {
        userNameElement.sendKeys(username);
        passwordElement.sendKeys(password);
        loginBtn.click();
    }

    public void goToLandingPage() throws Exception {
        //Driver.getDriver().get(ConfigurationReader.getProperty("url" + ConfigurationReader.getProperty("environment")));
    }

    public void login() {
        String userName = ConfigurationReader.getProperty("helpdeskusername");
        String password = ConfigurationReader.getProperty("helpdeskpassword");
        userNameElement.sendKeys(userName);
        passwordElement.sendKeys(password);
        loginBtn.click();
    }
    public String getErrorMessage() {
        return errortext.getText();
    }

    }


