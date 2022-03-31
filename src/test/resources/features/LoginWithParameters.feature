Feature: Login as different users

  Scenario: Login as a driver user
    Given the user is on login page
    When the users logs in using "user1" and "UserUser123"
    Then the user should be able to login
    And the title contains "Dashboard"


  Scenario: Login as a  user
    Given the user is on login page
    When the user logged in as "store manager"
    #Then the user should be able to login
    Then the title contains "Dashboard"
    #driver,sales manager, storemanager
  #you will have only one step definitions for this