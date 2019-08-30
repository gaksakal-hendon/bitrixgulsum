package com.bitrix.step_definition;

import com.bitrix.utilities.ConfigurationReader;
import com.bitrix.utilities.Pages;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class LoginStepDefinitions {

    Pages pages = new Pages();

    // goto the url
    @Given("user is on the landing pages")
    public void user_is_on_the_landing_pages() {
        try {
            pages.loginPage().goToLandingPage();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            ;
        }
    }

    @Then("user logs in as a helpdesks")
    public void user_logs_in_as_a_helpdesks() {
        pages.loginPage().login("helpdesk71@cybertekschool.com", "UserUser");

//        String userName = ConfigurationReader.getProperty("helpdeskusername");
//        String password = ConfigurationReader.getProperty("helpdeskpassword");
////        System.out.println(userName + " - " + password);
//        pages.loginPage().login(userName, password);
    }

    @Then("user verifies that {string} page name is displayeds")
    public void user_verifies_that_page_name_is_displayeds(String expected) {
        Assert.assertEquals(expected, pages.activityStreamPage().getPageHeader());
    }

    @Then("user logs in with {string} username and {string} password")
    public void user_logs_in_with_username_and_password(String string, String string2) {
        pages.loginPage().login(string, string2);

    }

    @Then("user verifies that {string} warning message is displayed")
    public void user_verifies_that_warning_message_is_displayed(String expected) {
        Assert.assertEquals(expected, pages.loginPage().getErrorMessage());
    }
}


