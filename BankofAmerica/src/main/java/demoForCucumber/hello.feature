Feature: Amazon Login Test

  Scenario: Login with valid credentials
    Given I am at Bank of America homepage
    And I click on Accounts and Lists
    And I click on sign in
    And I enter valid email
    And I click on continue
    And I enter valid password
    When I click on sign in button
    Then I should see I am logged in