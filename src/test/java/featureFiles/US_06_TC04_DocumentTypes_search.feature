Feature: Document Types Page Search Functionality

  Background:

    Given Navigate to basqar
    When User sending the keys in the dialog content class
      | username | daulet2030@gmail.com |
      | password | TechnoStudy123@      |
    And User click on the element in the dialog content class
      | loginButton |
      | gotItButton |
    Then User should login successfully

  Scenario: When searching by  name, the results should be matched with the search key.

    When User click on the element in the DocumentTypesPOM class
      | setup |
      | parameters |
      | documentTypes |
    And User sending the keys in the DocumentTypesPOM class

      | nameBox | eakdocument |

    Then Search and result should be matched