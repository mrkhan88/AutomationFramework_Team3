Feature: Employee Login Functionality check

  Scenario: Employee Login Functionality with invalid credentials
    Given I am on Bank of America Career page
    And I click on Employee login
    And I enter invalid credentials
    When I click on Sign on
    Then I should see error message "You have entered an incorrect Standard ID or password.Please enter your information again."
    Then I should verify that I am on still on the sign on page.



