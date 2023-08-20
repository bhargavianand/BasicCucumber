@datatable
Feature: Login feature - staging
    In order to perform successful login
  	As a User
  	I have to enter correct username and password

  Scenario: Login to the Facebook Website as a valid user on staging
    Given user navigates to the facebook website
    When user validates the homepage title
    Then user enters "valid" username
    And user enters "valid" password
    And user validates captcha image
    And user enters firstname and lastname
      | FirstName | LastName |
      | Rahul     | Aurora   |
      | Cora      | paul     |
    And user clicks on the signinbutton
