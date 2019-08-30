package com.bitrix.step_definition;

import com.bitrix.utilities.Pages;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class ActivityStreamStepDefinitions {
Pages pages = new Pages();
    @Given("user is on the landing page")
    public void user_is_on_the_landing_page() {
        Assert.assertEquals("Activity Stream", pages.activityStreamPage().getPageHeader());
    }

    @When("user logs in as a {string}")
    public void user_logs_in_as_a(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("user clicks {string} on the top menu")
    public void user_clicks_on_the_top_menu(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("enters a {string}")
    public void enters_a(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("user clicks Deadline field and selects a date")
    public void user_clicks_Deadline_field_and_selects_a_date() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("verify that selected date displayed on Deadline field")
    public void verify_that_selected_date_displayed_on_Deadline_field() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }


}
