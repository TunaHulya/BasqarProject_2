package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US_06_DocumentTypesPOM extends Parent {
    WebElement myElement;

    public US_06_DocumentTypesPOM() {

        PageFactory.initElements(driver, this);
    }



    @FindBy(xpath = "(//span[text()='Dashboard'])[1]")
    private WebElement dashboard;

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    private WebElement setupOne;

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parameters;

    @FindBy(xpath = "//span[text()='Document Types']")
    private WebElement documentTypes;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']/input")
    private WebElement nameBox;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']/input")
    private WebElement codeInput;

    @FindBy(xpath = "//ms-save-button//button")
    private WebElement saveButton;

    @FindBy(xpath = "//div[@id='toast-container']")
    private WebElement displayedMessage;

    @FindAll({
            @FindBy(xpath = "//div[@id='mat-select-8-panel']")
    })
    private List<WebElement> stageSelect;


    public void findElementAndClickFunction(String elementName) {

        switch (elementName) {

            case "setupOne":
                myElement = setupOne;
                break;

                case "dashboard":
                myElement = dashboard;
                break;

            case "parameters":
                myElement = parameters;
                break;

            case "country":
                myElement = documentTypes;
                break;


                 case "displayedMessage":
                myElement = displayedMessage;
                break;

                case "addButton":
                myElement = addButton;
                break;


            case "saveButton":
                myElement = saveButton;
                break;
        }

        clickFunction(myElement);
    }


    public void findElementAndSendKeysFunction(String elementName, String value) {

        switch (elementName) {
            case "nameBox":
                myElement = nameBox;
                break;
            case "codeInput":
                myElement = codeInput;
                break;
        }

        sendKeysFunction(myElement, value);
    }


    public void findElementAndFindVerifyContainsText(String elementName, String text) {
        switch (elementName) {
            case "dashboard":
                myElement = dashboard;
                break;
        }

        verifyElementContainsText(myElement, text);
    }
}
