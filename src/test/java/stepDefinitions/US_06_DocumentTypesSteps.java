package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import pages.DialogContent;
import pages.Parent;



public class US_06_DocumentTypesSteps extends Parent {

   WebDriver driver;


   DialogContent dialogContent=new DialogContent();


    @And("^Navigate to Document Types page$")
    public void navigateToDocumentTypesPage() {
        dialogContent.findElementAndClickFunction("setup");
        dialogContent.findElementAndClickFunction("parameters");
        dialogContent.findElementAndClickFunction("documentTypes");
    }

    @Then("^User should view Document Types Page successfully$")
    public void userShouldViewDocumentTypesPageSuccessfully() {
    }

    @When("^User click on the element in the DocumentTypesPOM class$")
    public void userClickOnTheElementInTheDocumentTypesPOMClass() {
    }

    @And("^User sending the keys in the DocumentTypesPOM class$")
    public void userSendingTheKeysInTheDocumentTypesPOMClass() {
    }

    @Then("^User should create a Document successfully$")
    public void userShouldCreateADocumentSuccessfully() {
    }
}
