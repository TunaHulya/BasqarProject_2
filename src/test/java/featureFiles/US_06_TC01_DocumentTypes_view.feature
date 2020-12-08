Feature: Document Types Page View Functionality

  Background:

    Given Navigate to basqar
    When User sending the keys in the dialog content class
      | username | daulet2030@gmail.com |
      | password | TechnoStudy123@      |
    And User click on the element in the dialog content class
      | loginButton |
      | gotItButton |
    Then User should login successfully

    Scenario:  Login with valid username and password then view the Document Types Page

      When User click on the element in the DocumentTypesPOM
        | setupOne |
        | parameters |
        | documentTypes |

      Then User should view Document Types Page successfully