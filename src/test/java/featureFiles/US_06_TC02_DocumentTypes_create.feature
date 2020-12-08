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

    When User click on the element in the DocumentTypesPOM class
      | setup |
      | parameters |
      | documentTypes |
      | addDocument |
    And User sending the keys in the DocumentTypesPOM class

      | nameBox | eakdocument |

    When User click on the element in the DocumentTypesPOM class
      | stageSelect |
      | saveButton |

    Then User should create a Document successfully