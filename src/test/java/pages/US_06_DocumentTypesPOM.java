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

    @FindBy(xpath = "//span[text()='Setup']") private WebElement setup;
    @FindBy(xpath = "//span[text()='Parameters']") private WebElement parameters;
    @FindBy(xpath = "//span[text()='Document Types'])[2]") private WebElement documentTypes;   //   linkText = "Countries"  // linkText de scroll yapmiyor
    @FindBy(xpath = "//span[text()='Cities']") private WebElement cities;

    @FindBy(xpath = "//span[text()='Education']") private WebElement education;
    @FindBy(xpath = "(//span[text()='Setup'])[5]") private WebElement setupEducation;
    @FindBy(css = "a[href='/subject-categories/list']") private WebElement subjectCategories;   //   linkText = "Subject Categories"
    //    @FindBy(linkText = "Subject Categories") private WebElement subjectCategories;   //   linkText = "Subject Categories"
    @FindBy(xpath = "//span[text()='Subjects']") private WebElement subjects;

    @FindBy(xpath = "//span[text()='Human Resources']") private WebElement humanResources;
    @FindBy(xpath = "(//span[text()='Setup'])[3]") private WebElement setupHR;
    @FindBy(xpath = "//span[text()='Position Salary']") private WebElement positionSalary;
    @FindBy(xpath = "//span[text()='Positions']") private WebElement positions;

    @FindBy(xpath = "//span[text()='Salary Types']") private WebElement salaryTypes;
    @FindBy(xpath = "//span[text()='Salary Modifiers']") private WebElement salaryModifiers;
    @FindBy(xpath = "//span[text()='Salary Constants']") private WebElement salaryConstants;

    @FindBy(xpath = "(//span[text()='Reports'])[4]") private WebElement reports;
    @FindBy(xpath = "(//span[text()='Setup'])[7]") private WebElement setupReports;
    @FindBy(xpath = "//span[text()='Excel Template']") private WebElement excelTemplate;

    @FindBy(xpath = "//span[text()='Budget']") private WebElement budget;
    @FindBy(xpath = "//span[text()='Budget Accounts']") private WebElement budgetAccounts;
    @FindBy(xpath = "(//span[text()='Setup'])[6]") private WebElement setupBudget;
    @FindBy(xpath = "//span[text()='Cost Centers']") private WebElement costCenters;


    //   //button[@aria-label='Close dialog']


    public void findElementAndClickFunction(String elementName) {

        switch (elementName) {
            case "setup": myElement = setup;break;
            case "parameters": myElement = parameters;break;
            case "documentTypes": myElement = documentTypes;break;
            case "cities": myElement = cities;break;
            case "education": myElement = education;break;
            case "setupEducation": myElement = setupEducation;break;
            case "subjectCategories": myElement = subjectCategories;break;
            case "subjects": myElement = subjects;break;
            case "humanResources": myElement = humanResources;break;
            case "setupHR": myElement = setupHR;break;
            case "positionSalary": myElement = positionSalary;break;
            case "positions": myElement = positions;break;
            case "reports": myElement = reports;break;
            case "setupReports": myElement = setupReports;break;
            case "excelTemplate": myElement = excelTemplate;break;
            case "salaryTypes": myElement = salaryTypes;break;
            case "salaryModifiers": myElement = salaryModifiers;break;
            case "salaryConstants": myElement = salaryConstants;break;
            case "budget": myElement = budget;break;
            case "budgetAccounts": myElement = budgetAccounts;break;
            case "setupBudget": myElement = setupBudget;break;
            case "costCenters": myElement = costCenters;break;


        }
        clickFunction(myElement);
    }


}
