#language:en

Feature: Login

  Scenario: Login

    Given the user is on the login page
    When the login is executed with the data
      | user     | admin |
      | password | admin |
    Then log into the system

  @Smoke
  Scenario Template: Login with <user>
    Given the user is on the login page
    When the login is executed with the data
      | user     | <user>     |
      | password | <password> |
    Then log into the system

    Examples:
      | user      | password |
      | admin     | admin    |
      | Adam      | admin    |
