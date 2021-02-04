$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/resources/featurefile/NavigateToCloudServices.feature");
formatter.feature({
  "line": 1,
  "name": "Navigate to another page",
  "description": "As a user I should be able to navigate to cloud services page",
  "id": "navigate-to-another-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 9960921900,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "verify that user should be navigate to cloud services page",
  "description": "",
  "id": "navigate-to-another-page;verify-that-user-should-be-navigate-to-cloud-services-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on IT Services link",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click on Cloud Services link",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I should navigate to Cloud Services page",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iAmOnHomePage()"
});
formatter.result({
  "duration": 397602200,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnITServicesLink()"
});
formatter.result({
  "duration": 647019200,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnCloudServicesLink()"
});
formatter.result({
  "duration": 2677706600,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iShouldNavigateToCloudServicesPage()"
});
formatter.result({
  "duration": 681535000,
  "status": "passed"
});
formatter.after({
  "duration": 998247100,
  "status": "passed"
});
formatter.before({
  "duration": 12785445300,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "verify that user should be able to click on career link and navigate to career page",
  "description": "",
  "id": "navigate-to-another-page;verify-that-user-should-be-able-to-click-on-career-link-and-navigate-to-career-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "I am on Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I click on career link",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I should be able to click on career link and navigate to career link",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iAmOnHomePage()"
});
formatter.result({
  "duration": 60400,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnCareerLink()"
});
formatter.result({
  "duration": 3980720400,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iShouldBeAbleToClickOnCareerLinkAndNavigateToCareerLink()"
});
formatter.result({
  "duration": 1482076500,
  "error_message": "org.junit.ComparisonFailure: expected:\u003c...areer\nthat takes\nyou[]further\u003e but was:\u003c...areer\nthat takes\nyou[ ]further\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:117)\r\n\tat org.junit.Assert.assertEquals(Assert.java:146)\r\n\tat com.version1.pages.CareerPage.userShouldNavigateToCareerPage(CareerPage.java:22)\r\n\tat com.version1.stepdefs.MyStepdefs.iShouldBeAbleToClickOnCareerLinkAndNavigateToCareerLink(MyStepdefs.java:39)\r\n\tat ✽.Then I should be able to click on career link and navigate to career link(src/test/java/resources/featurefile/NavigateToCloudServices.feature:13)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 2040235600,
  "status": "passed"
});
});