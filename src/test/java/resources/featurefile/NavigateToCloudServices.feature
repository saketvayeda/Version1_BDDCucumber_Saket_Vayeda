Feature: Navigate to another page
  As a user I should be able to navigate to cloud services page

  Scenario: verify that user should be navigate to cloud services page
    Given I am on Home page
    When I click on IT Services link
    And I click on Cloud Services link
    Then I should navigate to Cloud Services page

   Scenario: verify that user should be able to click on career link and navigate to career page
     Given I am on Home page
     When I click on career link
     Then I should be able to click on career link and navigate to career link