package pages;

import org.openqa.selenium.StaleElementReferenceException;
import utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

public class Parent {

    WebDriver driver;
    WebDriverWait wait;

    public Parent() {

        driver= Driver.getDriver();
        wait=new WebDriverWait(driver, 10);
    }

    public void clickFunction(WebElement element) {
        try {
            waitUntilClickable(element);
            scrollToElemenet(element);
            element.click();
        }
        catch (StaleElementReferenceException ex){
            ex.printStackTrace();
            clickFunction(element);
        }

    }

    public void sendKeysFunction(WebElement element, String value){

        waitUntilVisible(element);
        scrollToElemenet(element);
        element.clear();
        element.sendKeys(value);

    }

    public void waitUntilClickable(WebElement element){

        wait.until(ExpectedConditions.elementToBeClickable(element));

    }

    public void waitUntilVisible(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));



    }

    public void scrollToElemenet(WebElement element){

        JavascriptExecutor js= (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    //TODO Bu kısımdaki metodu ihtiyac olması halinde yazacağız, add, edit butonlarda hata çıkarsa bu kısmı hatırlayalım!!!
//    public List<WebElement> waitVisibleListAllElement(List<WebElement> elementList){
//
//
//
//        return elementList;
//    }
//
    public void verifyElementContainsText(WebElement element, String expectedText){

        wait.until(ExpectedConditions.visibilityOf(element));
        //wait.until(ExpectedConditions.textToBePresentInElement(element,expectedText));
        String actualText=element.getText();
        System.out.println(actualText);
        Assert.assertTrue(actualText.toLowerCase().contains(expectedText.toLowerCase()));
    }

    public WebElement randomSelectFromList(List<WebElement> elementsList) {
        return elementsList.get((int)(Math.random() * elementsList.size()));
    }
}