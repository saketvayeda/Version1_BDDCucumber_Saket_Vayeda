package com.version1.pages;

import com.cucumber.listener.Reporter;
import com.version1.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy (xpath = "//*[@id=\"menu-primary-menu-1\"]/li[1]/a")
    WebElement _itServicesLink;
    @FindBy (xpath = "//*[@id=\"menu-services-menu-1\"]/li[1]/a")
    WebElement _cloudServicesLink;
    @FindBy (xpath = "//header/div[1]/div[1]/nav[1]/div[1]/ul[1]/li[6]/a[1]")
    WebElement _careerLink;

    //this method will click on IT Service link
    public void clickOnItServicesLink (){
      Reporter.addStepLog("Click on IT Services link" + _itServicesLink.toString() + "<br>");
      log.info("Click on IT Services link" + _itServicesLink.toString());
      clickOnElement(_itServicesLink);
  }
    // This method will click on cloud Services link
    public void clickOnCloudServicesLink (){
        Reporter.addStepLog("Click on Cloud Services link" + _cloudServicesLink.toString() + "<br>");
        log.info("Click on Cloud Services link" + _cloudServicesLink.toString());
        clickOnElement(_cloudServicesLink);
    }

    //this method will click on career link
    public void clickOnItCareerLink (){
        Reporter.addStepLog("Click on Career link" + _careerLink.toString() + "<br>");
        log.info("Click on Career link" + _careerLink.toString());
        clickOnElement(_careerLink);
    }
}
