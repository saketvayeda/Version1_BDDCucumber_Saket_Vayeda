package com.version1.pages;

import com.cucumber.listener.Reporter;
import com.version1.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CloudPage extends Utility {

    private static final Logger log = LogManager.getLogger(CloudPage.class.getName());

    @FindBy (xpath = "//span[contains(text(),'Cloud Services')]")
    WebElement _cloudServicesText;

    // this method will get text and verify user navigate to cloud services page
    public void userShouldNavigateToCloudServicesPage() {
        Reporter.addStepLog(("User should navigate to cloud service Page" + _cloudServicesText.toString() + "<br>"));
        log.info("User should navigate to cloud service Page" + _cloudServicesText.toString());
        Assert.assertEquals("CLOUD SERVICES", getTextFromElement(_cloudServicesText));
    }


}
