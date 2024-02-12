@Login
Feature: Login Functionality

  @smoke
  Scenario: Valid Login
    #Given I navigated to Zealthy Website
    When I enter valid email address
    And I enter valid password
    And I click to login button
    Then I validate that I am logged in

  @smoke
  Scenario: Invalid password
    #Given I navigated to Zealthy Website
    When I enter valid email address
    And I enter invalid password
    And I click to login button
    Then I validate that Invalid Credentials is displayed

  @smoke
  Scenario: Invalid email address
   # Given I navigated to Zealthy Website
    When I enter invalid email address
    And I enter valid password
    And I click to login button
    Then I validate that Invalid Credentials is displayed