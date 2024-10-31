


 
Feature: Log In Validation
@smoketest
  Scenario: User should be able to launch home page
    Given User is in Log in Page
   When User put valid id and password "username" and "password"
    And User put valid emailid and password "username" and "password" and "confirmpassword"
    And User clicks on log in button
    Then User should be on Home Page


#Feature: Sign In Validation
#
  #Scenario: User should be able to launch home page
    #Given User is in Siginin in Page
   #When User put valid emailid and password "emailid" and "password"
    #And User put valid emailid and password "username" and "password" and "confirmpassword"
    #And User clicks on log in button
    #Then User should successfully loged in     