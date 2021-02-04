package com.version1.pages;

import com.cucumber.listener.Reporter;
import com.version1.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CareerPage extends Utility {

    private static final Logger log = LogManager.getLogger(CareerPage.class.getName());

    @FindBy (xpath = "//*[@id=\"content\"]/section[1]/div[2]/div/h1")
    WebElement _careerText;

    // this method will get text and verify user navigate to career page
    public void userShouldNavigateToCareerPage() {
        Reporter.addStepLog(("User should navigate to Career Page" + _careerText.toString() + "<br>"));
        log.info("User should navigate to Career Page" + _careerText.toString());
        Assert.assertEquals("A career\n" + "that takes\n" + "youfurther" , getTextFromElement(_careerText));
    }

}
