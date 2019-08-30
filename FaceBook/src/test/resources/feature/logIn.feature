Feature: Login to Facebook
  This featurre logs in to facebook

  Scenario: Login into the FaceBook
    Description:This is the domain i am working on so that i am trying to login and
  with the cucumber tool using gherkin language
    Given user navigate to the login page
    And user enters an email and an invalid password
    When user click on login
    Then user should go to home Page
    Then user click on sign out button
    And user will sign out safely
    Then user navigate to cnn news home
    Then user will click on business page
    Then user will quite the browser