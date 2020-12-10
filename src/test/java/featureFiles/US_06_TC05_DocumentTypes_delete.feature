Feature: Document Types Page Delete Functionality

  Background:

    Given Navigate to basqar
    When User sending the keys in the dialog content class
      | username | daulet2030@gmail.com |
      | password | TechnoStudy123@      |
    And User click on the element in the dialog content class
      | loginButton |
      | gotItButton |
    Then User should login successfully

  Scenario:  Login with valid username and password then edit a document

    When User click on the element in the DocumentTypesPOM class
      | setup |
      | parameters |
      | documentTypes |
      | delete|
      | yes|


    Then User should delete a Document successfully