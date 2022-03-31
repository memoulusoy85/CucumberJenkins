@login
Feature: Users should be able to login

#just for beginning statement
  Background:
    Given the user is on login page

  @driver @login @smoke @VYT-123
  Scenario:Login as a driver

    When the user enter the driver information
    Then the user should be able to login

  @sales_manager
  Scenario: Login as a sales manager

  When the user enter the sales manager information
  Then  the user should be able to login

  @store_manager @smoke @VYT-123
  Scenario: Login as a store manager

  When the user enter the store manager information
  Then the user should be able to login
    #comment