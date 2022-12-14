package com.tutorialninja.pages;

import com.aventstack.extentreports.Status;
import com.tutorialninja.customlisteners.CustomListeners;
import com.tutorialninja.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {
    @CacheLookup
    @FindBy(linkText= "Desktops")
    WebElement desktopClick ;
    //By desktopClick=By.linkText("Desktops");
    @CacheLookup
    @FindBy(linkText= "Show All Desktops")
    WebElement showAllTheDesktopsClick ;
    @CacheLookup
    @FindBy(xpath= "//h2[contains(text(),'Desktops')]")
    WebElement verifyText ;
    @CacheLookup
    @FindBy(linkText= "Laptops & Notebooks")
    WebElement laptopsAndNotebooksClick ;

    @CacheLookup
    @FindBy(linkText= "Show All Laptops & Notebooks")
    WebElement showAllLaptopsAndNotebooksClick ;
    @CacheLookup
    @FindBy(xpath= "//h2[text()='Laptops & Notebooks']")
    WebElement verifyText1 ;
    @CacheLookup
    @FindBy(linkText= "Components")
    WebElement Componentsclick ;
    //By Componentsclick = By.linkText("Components");
    @CacheLookup
    @FindBy(linkText= "Show All Components")
    WebElement showallComponents ;
   // By showallComponents = By.linkText("Show All Components");
    @CacheLookup
    @FindBy(xpath= "//h2[contains(text(),'Components')]")
    WebElement verifytext2 ;

   // By verifytext2 = By.xpath("//h2[contains(text(),'Components')]");


    public void mouseHoverOnDesktop(){
        Reporter.log("mouse hover on the desktop"+ desktopClick.toString());
        mouseHoverToElementAndClick(desktopClick);
    }
    public void clickOnShowAllTheDesktops(){
        Reporter.log("click on show all the desktops "+ showAllTheDesktopsClick.toString());
        clickOnElement(showAllTheDesktopsClick);
    }
    public String verifyText(){
        Reporter.log("verify the text dashboard");
        String message=getTextFromElement(verifyText);
        CustomListeners.test.log(Status.PASS,"Get error Message");
        return message;

    }
    public void mouseHoverOnLaptopAndNoteBooks(){
        Reporter.log("mouse hover on the laptops and notebooks"+ laptopsAndNotebooksClick.toString());
        mouseHoverToElementAndClick(laptopsAndNotebooksClick);
    }
    public void clickOnShowAllLaptopsAndNoteBooksClick(){
        Reporter.log("mouse hover on the laptops and notebooks"+ showAllLaptopsAndNotebooksClick.toString());
        clickOnElement(showAllLaptopsAndNotebooksClick);
    }
    public String verifyText1(){
        Reporter.log("verify the text");
        String message=getTextFromElement(verifyText1);
        CustomListeners.test.log(Status.PASS,"Get error Message");
        return message;
    }
    public void mouseHoverOnComponents() {
        Reporter.log("mouse hover on the Componentsclick"+ Componentsclick.toString());
        mouseHoverToElementAndClick(Componentsclick);

    }

    public void clickOnShowAllComponents() {
        Reporter.log("mouse hover on the Componentsclick"+ showallComponents.toString());
        clickOnElement(showallComponents);
    }

    public String VerifyText2() {
        Reporter.log("verify the text");
        String message=getTextFromElement(verifytext2);
        CustomListeners.test.log(Status.PASS,"Get error Message");
        return message;
    }
}
