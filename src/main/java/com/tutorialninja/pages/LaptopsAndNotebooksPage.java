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

public class LaptopsAndNotebooksPage extends Utility {
    @CacheLookup
    @FindBy(linkText= "Laptops & Notebooks")
    WebElement laptopsandNotebooksclick ;
//By laptopsandNotebooksclick = By.linkText("Laptops & Notebooks");

    @CacheLookup
    @FindBy(linkText= "Show All Laptops & Notebooks")
    WebElement showAllLaptopsandBooksclick ;
//By showAllLaptopsandBooksclick=By.linkText("Show All Laptops & Notebooks");
    @CacheLookup
    @FindBy(id= "input-sort")
    WebElement shortAllPrice ;


    @CacheLookup
    @FindBy(linkText= "Price (High > Low)")
    WebElement verifyTextofPrice ;

    @CacheLookup
    @FindBy(xpath= "//a[text()='MacBook']")
    WebElement macBookselect ;

    @CacheLookup
    @FindBy(xpath= "//h1[contains(text(),'MacBook')]")
    WebElement macbookText ;

    @CacheLookup
    @FindBy(id= "button-cart")
    WebElement addtoCart ;
    @CacheLookup
    @FindBy(xpath= "//div[@class='alert alert-success alert-dismissible']")
    WebElement verifyMessage ;
    @CacheLookup
    @FindBy(xpath= "//a[contains(text(),'shopping cart')]")
    WebElement shoppingCartClic ;
//By shoppingCartClic=By.xpath("//a[contains(text(),'shopping cart')]");
    @CacheLookup
    @FindBy(xpath= "//a[contains(text(),'Shopping Cart')]")
    WebElement shopingCartText ;
//By shopingCartText=By.xpath("//a[contains(text(),'Shopping Cart')]");
    @CacheLookup
    @FindBy(xpath= "//body[1]/div[2]/div[1]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/a[1]")
    WebElement prodcutNameMacbook ;
//By prodcutNameMacbook=By.xpath("//body[1]/div[2]/div[1]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/a[1]");
@CacheLookup
@FindBy(xpath= "//tbody/tr[1]/td[4]/div[1]/input[1]")
WebElement changeQty ;
    //By changeQty=By.xpath("//tbody/tr[1]/td[4]/div[1]/input[1]");
    @CacheLookup
    @FindBy(xpath= "//tbody/tr[1]/td[4]/div[1]/span[1]/button[1]")
    WebElement updateclick ;
//By updateclick=By.xpath("//tbody/tr[1]/td[4]/div[1]/span[1]/button[1]");
    @CacheLookup
    @FindBy(xpath= "div[@class='alert alert-success alert-dismissible']")
    WebElement verifyTextForUpadte ;
//By verifyTextForUpadte=By.xpath("div[@class='alert alert-success alert-dismissible']");
    @CacheLookup
    @FindBy(xpath= "//tbody/tr[1]/td[6]")
    WebElement totalPrice ;
// totalPrice=By.xpath("//tbody/tr[1]/td[6]");
    @CacheLookup
    @FindBy(xpath= "//a[contains(text(),'Checkout')]")
    WebElement checkOut ;
// checkOut=By.xpath("//a[contains(text(),'Checkout')]");
    @CacheLookup
    @FindBy(xpath= "//h1[contains(text(),'Checkout')]")
    WebElement checkOutTxt ;
//By checkOutTxt=By.xpath("//h1[contains(text(),'Checkout')]");
    @CacheLookup
    @FindBy(xpath= "//h2[contains(text(),'New Customer')]")
    WebElement NewCustomer ;
//By NewCustomer=By.xpath("//h2[contains(text(),'New Customer')]");
    @CacheLookup
    @FindBy(xpath= "//body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/label[1]")
    WebElement gusestCheckOut ;
//By gusestCheckOut=By.xpath("//body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/label[1]");

    @CacheLookup
    @FindBy(xpath= "//input[@id='button-account']")
    WebElement continueTab ;

    @CacheLookup
    @FindBy(id= "input-payment-firstname")
    WebElement firstName ;
    @CacheLookup
    @FindBy(id= "input-payment-lastname")
    WebElement lastName ;
    @CacheLookup
    @FindBy(id= "input-payment-email")
    WebElement emailIdField ;
    @CacheLookup
    @FindBy(id= "input-payment-telephone")
    WebElement telePhoneNumberField ;
    @CacheLookup
    @FindBy(id= "input-payment-address-1")
    WebElement addressField ;
//By addressField=By.id("input-payment-address-1");
    @CacheLookup
    @FindBy(id= "input-payment-city")
    WebElement cityField ;
//By cityField=By.id("input-payment-city");
    @CacheLookup
    @FindBy(id= "input-payment-postcode")
    WebElement posrcodeField ;
//By posrcodeField=By.id("input-payment-postcode");
    @CacheLookup
    @FindBy(id= "input-payment-country")
    WebElement countryFromDeopdown ;
//By countryFromDeopdown=By.id("input-payment-country");
    @CacheLookup
    @FindBy(id= "input-payment-zone")
    WebElement zone ;
//By zone=By.id("input-payment-zone");
    @CacheLookup
    @FindBy(id= "button-guest")
    WebElement continueButton ;
//By continueButton=By.id("button-guest");
    @CacheLookup
    @FindBy(name= "comment")
    WebElement addComment ;
//By addComment=By.name("comment");
    @CacheLookup
    @FindBy(name= "agree")
    WebElement tearmsAndCondition ;
//By tearmsAndCondition=By.name("agree");
    @CacheLookup
    @FindBy(id= "button-payment-method")
    WebElement continueButton2 ;
//By continueButton2=By.id("button-payment-method");
    @CacheLookup
    @FindBy(xpath= "//div[@class='alert alert-danger alert-dismissible']")
    WebElement warningMeassage ;
//By warningMeassage=By.xpath("//div[@class='alert alert-danger alert-dismissible']");



public void mouseHoverOnLaptopandNotebook(){
    Reporter.log("mouse hover on the laptop and notebooks"+ laptopsandNotebooksclick.toString());
    mouseHoverToElementAndClick(laptopsandNotebooksclick);
}

    public void showallLaptopsAndBook(){
        Reporter.log("mouse hover on the show all laptop and notebooks"+ showAllLaptopsandBooksclick.toString());
        mouseHoverToElementAndClick(showAllLaptopsandBooksclick);
    }

    //1.3 Select Sort By "Price (High > Low)"
    public void sortByHighTOLow(){
        List<WebElement> products = driver.findElements(By.xpath("//p[@class ='price']"));
        List<Double> originalProductsPrice = new ArrayList<>();
        for (WebElement e : products) {
            System.out.println(e.getText());
            String[] arr = e.getText().split("Ex Tax:");
            originalProductsPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",","")));
        }
        System.out.println(originalProductsPrice);
        // Sort By Reverse order
        Collections.sort(originalProductsPrice, Collections.reverseOrder());
        System.out.println(originalProductsPrice);
        // Select sort by Price (High > Low)
        selectByVisibleTextFromDropDown(shortAllPrice, "Price (High > Low)");
        // After filter Price (High > Low) Get all the products name and stored into array list
        products = driver.findElements(By.xpath("//p[@class ='price']"));
        ArrayList<Double> afterSortByPrice = new ArrayList<>();
        for (WebElement e : products) {
            String[] arr = e.getText().split("Ex Tax:");
            afterSortByPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",","")));
        }
    }
      //   1.4 Verify the Product price will arrange in High to Low order.
    public String verifyTextofPriceArranged(){
    return getTextFromElement(verifyTextofPrice);
    }
   //2. 4 Select Product “MacBook”
    public void selectMacbook(){
        Reporter.log("select macbook"+ macBookselect.toString());
        mouseHoverToElementAndClick(macBookselect);
    }
   // 2.5 Verify the text “MacBook”
    public String verifyTxtMacBook(){
        Reporter.log("verify the text macbookd");
        String message=getTextFromElement(macbookText);
        CustomListeners.test.log(Status.PASS,"Get error Message");
        return message;

    }
           // 2.6 Click on ‘Add To Cart’ button
    public void clikconAddToCart(){
        Reporter.log("click the add to cart button"+ addtoCart.toString());
        clickOnElement(addtoCart);
    }
   // 2.7 Verify the message “Success: You have added MacBook to your shopping cart!”

    public String verifytextMessage(){
        Reporter.log("verify the text message");
        String message=getTextFromElement(verifyMessage);
        CustomListeners.test.log(Status.PASS,"Get error Message");
        return message;
    }

    public void clickonShoppingCart(){
        Reporter.log("click the add to cart button"+ shoppingCartClic.toString());
        clickOnElement(shoppingCartClic);
    }
//2.9 Verify the text "Shopping Cart"
    public String verifyShoppingCart1(){
        Reporter.log("verify the text shopping card");
        String message=getTextFromElement(shopingCartText);
        CustomListeners.test.log(Status.PASS,"Get error Message");
        return message;

    }

           // 2.10 Verify the Product name "MacBook"
    public String verifyProdcutNameMacbook() {
        Reporter.log("verify the text macbookd");
        String message=getTextFromElement(prodcutNameMacbook);
        CustomListeners.test.log(Status.PASS,"Get error Message");
        return message;
    }
    //2.11 Change Quantity "2"
    public void sendTextToChangeQty(){
        driver.findElement(By.xpath("//tbody/tr[1]/td[4]/div[1]/input[1]")).clear();
        sendTextToElement(changeQty, "2");
    }
public void clickOnUpdateBtton(){
    Reporter.log("click the login button"+ updateclick.toString());
    clickOnElement(updateclick);
}
    public String verifyMessageForShoppingCart(){
    return getTextFromElement(verifyTextForUpadte);
    }

    public String verifyTotal(){
        Reporter.log("verify the text macbookd");
        String message=getTextFromElement(totalPrice);
        CustomListeners.test.log(Status.PASS,"Get error Message");
        return message;
    }

    public void clickOnCheckout(){
        Reporter.log("click the checkout"+ checkOut.toString());
        clickOnElement(checkOut);
    }
   // 2.16 Verify the text “Checkout”
   public String verifyTextCheckOut(){
       Reporter.log("verify the text checkout");
       String message=getTextFromElement(checkOutTxt);
       CustomListeners.test.log(Status.PASS,"Get error Message");
       return message;
   }
            //2.17 Verify the Text “New Customer”
            public String verifyTextNewCustomer() {
                return getTextFromElement(NewCustomer);
            }
           // 2.18 Click on “Guest Checkout” radio button
    public void clickOnGusetCheckOut(){
        Reporter.log("click the login button"+ gusestCheckOut.toString());
        clickOnElement(gusestCheckOut);
    }

//2.19 Click on “Continue” tab
    public void clickonContinueTab(){
        Reporter.log("click the continue button"+ continueTab.toString());
        clickOnElement(continueTab);
    }
public void sendTextOnFirstNameField(String username){
    Reporter.log("Enter first name to the  field"+username+ firstName.toString());
    sendTextToElement(firstName,username);
    CustomListeners.test.log(Status.PASS,"Enter username" + username);
}
    public void sendTextOnLastNameField(String  lasna) {
        Reporter.log("Enter last name to the  field"+lasna+ lastName.toString());
        sendTextToElement(lastName, lasna);
        CustomListeners.test.log(Status.PASS,"Enter username" );

    }
public void sendTextToEmailField(String email){
    Reporter.log("Enter email name to the  field"+email+ emailIdField.toString());
    sendTextToElement(emailIdField,email);
    CustomListeners.test.log(Status.PASS,"Enter username" );
}
public void sendTextToTelephoneNumber(String number){
    Reporter.log("Enter email name to the  field"+number+ telePhoneNumberField.toString());
    sendTextToElement(telePhoneNumberField,number);
    CustomListeners.test.log(Status.PASS,"Enter username" );
}
public void sendTextToAdress(String add){
    Reporter.log("Enter adrress to the  field"+add+ addressField.toString());
    sendTextToElement(addressField,add);
    CustomListeners.test.log(Status.PASS,"Enter username" );
}
public void sendTextToCityField(String  town){
    Reporter.log("Enter adrress to the  field"+town+ cityField.toString());
    sendTextToElement(cityField,town);
    CustomListeners.test.log(Status.PASS,"Enter username" );

}
public void sendTextToPostCode(String  zipcode){
    Reporter.log("Enter postcode to the  field"+zipcode+ posrcodeField.toString());
    sendTextToElement(posrcodeField,zipcode);
    CustomListeners.test.log(Status.PASS,"Enter username" );

}
   public void selectCountry(){
       Reporter.log("Enter country to the  field"+ countryFromDeopdown.toString());
       selectByVisibleTextFromDropDown(countryFromDeopdown,"Aaland Islands");
       CustomListeners.test.log(Status.PASS,"Enter username" );

   }
   public void selectZone(){
       Reporter.log("Enter zone to the  field"+ zone.toString());
       selectByVisibleTextFromDropDown(zone,"--- None --- ");
       CustomListeners.test.log(Status.PASS,"Enter username" );

   }
    public void clikcOnContiuneBtton(){
        Reporter.log("click the login button"+ continueButton.toString());
        clickOnElement(continueButton);
    }
    public void addingCommentOnOrder(){
        Reporter.log("add the comment on order"+ addComment.toString());
        sendTextToElement(addComment,"Please consider my order ASAP");
    }
    //2.23 Check the Terms & Conditions check box
   public void checkOnTearmsAndConditions(){
       Reporter.log("click the terms and condition"+ tearmsAndCondition.toString());
       clickOnElement(tearmsAndCondition);
   }
    //2.24 Click on Continue button
    public void clikcOnContinueButton2(){
        Reporter.log("click on continue "+ continueButton2.toString());
        clickOnElement(continueButton2);
    }
    //2.25 Verify the message Warning: Payment method required!"
    public String verifyWarningMessage(){
        Reporter.log("verify the text dashboard");
        String message=getTextFromElement(warningMeassage);
        CustomListeners.test.log(Status.PASS,"Get error Message");
        return message;
    }


}
