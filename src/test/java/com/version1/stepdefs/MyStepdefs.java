package com.version1.stepdefs;

import com.version1.pages.CareerPage;
import com.version1.pages.CloudPage;
import com.version1.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs {
    @Given("^I am on Home page$")
    public void iAmOnHomePage() {
    }

    //this method will click on IT service link
    @When("^I click on IT Services link$")
    public void iClickOnITServicesLink() {
        new HomePage().clickOnItServicesLink();
    }
        //this method will click on cloud service link
    @And("^I click on Cloud Services link$")
    public void iClickOnCloudServicesLink() {
        new HomePage().clickOnCloudServicesLink();
    }

    @Then("^I should navigate to Cloud Services page$")
    public void iShouldNavigateToCloudServicesPage() {
        new CloudPage().userShouldNavigateToCloudServicesPage();
    }
        // this method will click on career link
    @When("^I click on career link$")
    public void iClickOnCareerLink() {
        new HomePage().clickOnItCareerLink();
    }
        //this method will navigate to career page and get text
    @Then("^I should be able to click on career link and navigate to career link$")
    public void iShouldBeAbleToClickOnCareerLinkAndNavigateToCareerLink() {
        new CareerPage().userShouldNavigateToCareerPage();
    }
}
