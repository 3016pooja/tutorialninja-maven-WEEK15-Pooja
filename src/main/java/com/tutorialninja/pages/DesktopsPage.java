package com.tutorialninja.pages;


import com.aventstack.extentreports.Status;
import com.tutorialninja.customlisteners.CustomListeners;
import com.tutorialninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopsPage extends Utility {
    @CacheLookup
    @FindBy(linkText= "Desktops")
    WebElement desktopClick ;
   // By desktopClick = By.linkText("Desktops");
    @CacheLookup
    @FindBy(linkText= "Show All Desktops")
    WebElement showAllTheDesktopsClick ;
   // By showAllTheDesktopsClick = By.linkText("Show All Desktops");
    @CacheLookup
    @FindBy(id= "input-sort")
    WebElement desktopSortBy ;

   // By desktopSortBy = By.id("input-sort");
    @CacheLookup
    @FindBy(xpath= "//a[contains(text(),'HP LP3065')]")
    WebElement selectHPProduct ;
  //  By selectHPProduct = By.xpath("//a[contains(text(),'HP LP3065')]");
    @CacheLookup
    @FindBy(xpath= "//h1[contains(text(),'HP LP3065')]")
    WebElement verifyTextHP ;
   // By verifyTextHP = By.xpath("//h1[contains(text(),'HP LP3065')]");

    @CacheLookup
    @FindBy(name= "quantity")
    WebElement sendQty ;
  //  By sendQty=By.name("quantity");

    @CacheLookup
    @FindBy(id= "button-cart")
    WebElement clikOnAddToCart ;
   // By clikOnAddToCart=By.id("button-cart");
    @CacheLookup
    @FindBy(css= "body:nth-child(2) div.container:nth-child(4) > div.alert.alert-success.alert-dismissible")
    WebElement verifyMessage ;
    @CacheLookup
    @FindBy(xpath= "//body/div[2]/div[1]/div[1]/div[1]/button[1]")
    WebElement closeSideButton ;
    @CacheLookup
    @FindBy(xpath= "//a[contains(text(),'shopping cart')]")
    WebElement ShoppingCart ;
    @CacheLookup
    @FindBy(xpath= "//a[contains(text(),'Shopping Cart')]")
    WebElement shoppingCartText ;
    @CacheLookup
    @FindBy(xpath= "//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a")
    WebElement productName ;
    //By productName=By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a");
    @CacheLookup
    @FindBy(xpath= "//div[@class = 'table-responsive']/table/tbody/tr/td[2]/small[1]")
    WebElement deliveryDateTxt ;
    @CacheLookup
    @FindBy(xpath= "//div[@class = 'table-responsive']/table/tbody/tr/td[3]")
    WebElement modelTxt ;
    @CacheLookup
    @FindBy(xpath= "//div[@class = 'table-responsive']/table/tbody/tr/td[6]")
    WebElement totalPriceText ;
   // By totalPriceText=By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[6]");

    @CacheLookup
    @FindBy(xpath= "//select[@id='input-sort']")
    WebElement nameztoa ;

    public void sortByNameZtoA1(String s){
        Reporter.log("select name a to z"+ desktopSortBy.toString());

        selectByVisibleTextFromDropDown(nameztoa,"Name (Z - A)");
    }
    public void sortByNameZtoA() {
        List<WebElement> products = driver.findElements(By.xpath("//h4/a"));
        ArrayList<String> originalProductsName = new ArrayList<>();
        for (WebElement e : products) {
            originalProductsName.add(e.getText());
        }
        System.out.println(originalProductsName);
        // Sort By Reverse order
        Collections.reverse(originalProductsName);
        System.out.println(originalProductsName);
        // Select sort by Name Z - A
        selectByVisibleTextFromDropDown(desktopSortBy, "Name (Z - A)");

        products = driver.findElements(By.xpath("//h4/a"));
        ArrayList<String> afterSortByZToAProductsName = new ArrayList<>();
        for (WebElement e : products) {
            afterSortByZToAProductsName.add(e.getText());
        }
        System.out.println(afterSortByZToAProductsName);
        //Assert.assertEquals(originalProductsName, afterSortByZToAProductsName,"Product not sorted into Z to A order");
    }
    public void sorybyAtoZ1(String st){
        Reporter.log("click on the desktop"+ nameztoa.toString());

        selectByVisibleTextFromDropDown(nameztoa,"Name (A - Z)");
    }


    //2.1Mouse hover on Desktops
    public void mouseHoverOnDesktops() {
        Reporter.log("click on the desktop"+ desktopClick.toString());
        mouseHoverToElementAndClick(desktopClick);
    }

    //2.2 Click on “Show All Desktops
    public void mouseHoverOnShowAllDesktops() {
        Reporter.log("click on the show all the desktop"+ showAllTheDesktopsClick.toString());
        mouseHoverToElementAndClick(showAllTheDesktopsClick);
    }

    //2.3 Select Sort By position "Name: A to Z"
    public void sortByNameAtoZ() {
        Reporter.log("select name a to z"+ desktopSortBy.toString());
        selectByVisibleTextFromDropDown(desktopSortBy, "Name (A - Z)");
    }

    //  2.4 Select product “HP LP3065”
    public void selectHPLaptop() {
        Reporter.log("select HP laptop"+ selectHPProduct.toString());
        clickOnElement(selectHPProduct);
    }

    //2.5 Verify the Text "HP LP3065"
    public String verifyTheTextForHpLaptop() {
        Reporter.log("returning Customer Text");
        String message=getTextFromElement(verifyTextHP);
        CustomListeners.test.log(Status.PASS,"Get error Message");
        return message;
    }

    //2.6 Select Delivery Date "2022-11-30"
    public void selectDeliveryDate() {
        String year = "2023";
        String month = "November";
        String date = "30";
        clickOnElement(By.xpath("//div[@class = 'input-group date']//button"));
        while (true) {
            String monthAndYear = driver.findElement(By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='picker-switch']")).getText();
            String[] arr = monthAndYear.split(" ");
            String mon = arr[0];
            String yer = arr[1];
            if (mon.equalsIgnoreCase(month) && yer.equalsIgnoreCase(year)) {
                break;
            } else {
                clickOnElement(By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='next']"));
            }
        }
    }
    //2.7  Enter Qty "1” using Select class.
    public void sendQty(String qty){
        Reporter.log("Enter password to the  field"+qty+ sendQty.toString());
        sendTextToElement(sendQty," ");
        CustomListeners.test.log(Status.PASS,"Enter password " + sendQty);

    }
   // 2.8	Click on “Add to Cart” button
    public void clickOnAddTOcartBtton(){
        Reporter.log("Enter password to the  field"+ clikOnAddToCart.toString());

        clickOnElement(clikOnAddToCart);
    }
    public String verifYMessageSuceessfullyAdded(){
       // Assert.assertTrue("Product not added to cart",
               // getTextFromElement(By.cssSelector("body:nth-child(2) div.container:nth-child(4) > div.alert.alert-success.alert-dismissible"))
                        //.contains("Success: You have added HP LP3065 to your shopping cart!");
       // clickOnElement(By.xpath("//a[contains(text(),'shopping cart')]"));
        Reporter.log("verify the text dashboard");
        String message=getTextFromElement(verifyMessage);
        CustomListeners.test.log(Status.PASS,"Get error Message");
        return message;
    }
    public void clickOncloseButton(){
        Reporter.log("Enter password to the  field"+ closeSideButton.toString());

        clickOnElement(closeSideButton);
    }

public void clikconShoppinCart(){//2.10
    Reporter.log("Enter password to the  field"+ ShoppingCart.toString());

    clickOnElement(ShoppingCart);
}
public String verifyTxtShopingCart(){//2.11
    Reporter.log("verify the text dashboard");
    String message=getTextFromElement(shoppingCartText);
    CustomListeners.test.log(Status.PASS,"Get error Message");
    return message;

}
//2.12Verify the Product name "HP LP3065"
public String verifyProductNamee() {
    Reporter.log("verify the product name");
    String message=getTextFromElement(productName);
    CustomListeners.test.log(Status.PASS,"Get error Message");
    return message;

}
    // 2.13	Verify the Delivery Date "2022-11-30"
    public String verifyDelviertDate(){
        Reporter.log("verify the delivery date");
        String message=getTextFromElement(deliveryDateTxt);
        CustomListeners.test.log(Status.PASS,"Get error Message");
        return message;

    }
    // 2.14	Verify the Model "Product21"
    public String verifyModel(){
        Reporter.log("verify the delivery date");
        String message=getTextFromElement(modelTxt);
        CustomListeners.test.log(Status.PASS,"Get error Message");
        return message;

    }
    // 2.15	Verify the Todat "£74.73"
    public String verifyTotalPrice(){
        Reporter.log("verify the delivery date");
        String message=getTextFromElement(totalPriceText);
        CustomListeners.test.log(Status.PASS,"Get error Message");
        return message;
    }


}
