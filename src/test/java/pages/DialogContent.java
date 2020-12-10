package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class DialogContent extends Parent {

    WebElement myElement;
    List<WebElement> myList;

    public DialogContent() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='Setup']")
    private WebElement setup;
    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parameters;
    @FindBy(xpath = "//span[text()='Document Types'])[2]")
    private WebElement documentTypes;

    @FindBy(id = "mat-input-0")
    private WebElement username;
    @FindBy(id = "mat-input-1")
    private WebElement password;
    @FindBy(css = "button[aria-label='LOGIN']")
    private WebElement loginButton;
    @FindBy(linkText = "Got it!")
    private WebElement gotItButton;
    @FindAll({@FindBy(linkText = "Got it!")})
    private List<WebElement> gotItBtns;
    @FindBy(xpath = "//span[text()='Dashboard ']")
    private WebElement dashboard;
    //    @FindBy (xpath = "//ms-add-button[contains(@tooltip,'TITLE')]//button")    private WebElement addButton;
    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'.ADD')]")
    private WebElement addButton;

    @FindBy(css = "ms-text-field[formcontrolname='name']>input")
    private WebElement name;
    @FindBy(css = "ms-text-field[formcontrolname='code']>input")
    private WebElement code;
    //@FindBy (css = "ms-save-button.ng-star-inserted")    private WebElement saveButton;
    @FindBy(xpath = "//ms-save-button//button")
    private WebElement saveButton;
    @FindBy(css = "div#toast-container")
    private WebElement message;  //   div[role='allertdialog']
    @FindAll({@FindBy(css = "div#toast-container")})
    private List<WebElement> messageList;
    @FindBy(css = "ms-delete-button.ng-star-inserted")
    private WebElement deleteButton;
    @FindAll({@FindBy(css = "ms-delete-button.ng-star-inserted")})
    private List<WebElement> deleteButtonList;
    @FindAll({@FindBy(css = "ms-edit-button.ng-star-inserted")})
    private List<WebElement> editButtonList;
    @FindAll({@FindBy(css = "tbody>tr>td:nth-child(2)")})
    private List<WebElement> nameList;
    @FindBy(css = "button[type='submit']")
    private WebElement yesButton;
    @FindBy(css = "mat-select[formcontrolname='id']")
    private WebElement country;
    // @FindBy(css = "mat-option[role='option']")    private WebElement option;
    @FindAll({@FindBy(css = "mat-option[role='option']>span")})
    private List<WebElement> optionsList;
    @FindBy(css = "#mat-chip-list-input-0")
    private WebElement userType;






    public void findElementAndClickFunction(String elementName) {

        switch (elementName) {

            case "setup":
                myElement = setup;
                break;
            case "parameters":
                myElement = parameters;
                break;
            case "documentTypes":
                myElement = documentTypes;
                break;
            case "loginButton":
                myElement = loginButton;
                break;
            case "gotItButton":
                if (gotItBtns.size() == 0) return;
                myElement = gotItButton;
                break;
            case "addButton":
                myElement = addButton;
                break;
            case "saveButton":
                myElement = saveButton;
                break;
            case "deleteButton":
                myElement = deleteButton;
                break;
            case "yesButton":
                myElement = yesButton;
                break;
            case "country":
                myElement = country;
                break;
            // case "option": myElement = option;break;
            case "userType":
                myElement = userType;
                break;

            case "randomSelect":
                myElement = randomSelectFromList(optionsList);
                break;


            default:
                for (int i = optionsList.size() - 1; i >= 0; i--) {
                    if (optionsList.get(i).getText().equalsIgnoreCase(elementName)) {
                        System.out.println("selected option:" + optionsList.get(i).getText());
                        myElement = optionsList.get(i);
                        break;
                    }
                }

        }
        clickFunction(myElement);
    }

    public void findElementAndSendKeysFunction(String elementName, String value) {
        switch (elementName) {
            case "username":
                myElement = username;
                break;
            case "password":
                myElement = password;
                break;
            case "name":
                myElement = name;
                break;
            case "code":
                myElement = code;
                break;


        }
        sendKeysFunction(myElement, value);
    }

    public void findElementAndFindVerifyContainsText(String elementName, String mesaj) {
        switch (elementName) {
            case "dashboard":
                myElement = dashboard;
                break;
            case "success/error":
                myElement = message;
                break;
        }
        verifyElementContainsText(myElement, mesaj);
    }

    public void deleteFunction(String value) {

        if (messageList.size() > 0) {
//            if (message.isDisplayed())
            wait.until(ExpectedConditions.invisibilityOfAllElements(message));
        }

        for (int i = 0; i < nameList.size(); i++) {

            if (nameList.get(i).getText().equalsIgnoreCase(value)) {
                clickFunction(deleteButtonList.get(i));
                break;
            }
        }
    }

    public void editFunction(String value) {

        if (messageList.size() > 0) {
//            if (message.isDisplayed())
            wait.until(ExpectedConditions.invisibilityOfAllElements(message));
        }

        for (int i = 0; i < nameList.size(); i++) {

            if (nameList.get(i).getText().equalsIgnoreCase(value)) {
                clickFunction(editButtonList.get(i));
                break;
            }
        }
    }

    public void findElementListAndSendKeysFunction(String list, String value) {

        switch (list) {

        }

        for (int i = 0; i < myList.size(); i++) {

            sendKeysFunction(myList.get(i), value);

        }

    }


}
