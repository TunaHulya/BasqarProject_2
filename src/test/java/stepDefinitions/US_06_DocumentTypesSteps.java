package stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import pages.US_06_DocumentTypesPOM;

public class US_06_DocumentTypesSteps {

    US_06_DocumentTypesPOM documentTypesPOM= new US_06_DocumentTypesPOM();


    @When("^User click on the element in the DocumentTypesPOM$")
    public void userClickOnTheElementInTheDocumentTypesPOM() {
        documentTypesPOM.findElementAndClickFunction("setupOne");
        documentTypesPOM.findElementAndClickFunction("parameters");
        documentTypesPOM.findElementAndClickFunction("documentTypes");
    }

    @Then("^User should view Document Types Page successfully$")
    public void userShouldViewDocumentTypesPageSuccessfully() {


    }


}
