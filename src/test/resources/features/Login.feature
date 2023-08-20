
@systemtest
Feature: Login feature
    In order to perform successful login
  	As a User
  	I have to enter correct username and password

  Scenario Outline: Login to the Facebook Website as a valid user
    Given user navigates to the facebook website
    When user validates the homepage title
    Then user enters " <username> " username
    And user enters " <password> " password
    And user clicks on the signinbutton
 
 Examples:   
 | username | | password |
 | valid || valid |
 | valid || valid |
 | valid || valid |
 | invalid | | invalid |
 
    
  #Scenario: Login to the Facebook Website as an invalid user
    #Given user navigates to the facebook website
    #When user validates the homepage title
    #Then user enters "invalid" username
    #And user enters "invalid" password
    #And user clicks on the signinbutton