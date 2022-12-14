package com.tutorialninja.testsuite;


import com.tutorialninja.customlisteners.CustomListeners;
import com.tutorialninja.pages.LaptopsAndNotebooksPage;
import com.tutorialninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class LaptopsAndNoteBooksPageTest extends BaseTest {
    LaptopsAndNotebooksPage laptopsAndNotebooksPage;
    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        laptopsAndNotebooksPage=new LaptopsAndNotebooksPage();
    }

    @Test(groups = {"sanity","regression"})
    public void verifyProductsPriceDisplayHighToLowSuccessfully(){
       laptopsAndNotebooksPage.mouseHoverOnLaptopandNotebook();
       laptopsAndNotebooksPage.showallLaptopsAndBook();
       laptopsAndNotebooksPage.sortByHighTOLow();
        //Assert.assertEquals(laptopsAndNotebooksPage.verifyTextofPriceArranged(),"Price (High > Low)","Error message not displayed");


    }
    @Test(groups = {"smoke","regression"})
    public void verifyThatUserPlaceOrderSuccessfully(){
        laptopsAndNotebooksPage.mouseHoverOnLaptopandNotebook();
        laptopsAndNotebooksPage.showallLaptopsAndBook();
        laptopsAndNotebooksPage.sortByHighTOLow();
        laptopsAndNotebooksPage.selectMacbook();
        Assert.assertEquals(laptopsAndNotebooksPage.verifyTxtMacBook(),"MacBook","Error message not displayed");
       laptopsAndNotebooksPage.clikconAddToCart();
        Assert.assertEquals(laptopsAndNotebooksPage.verifytextMessage(),"Success: You have added MacBook to your shopping cart!\n" +
                                "×","Error message not displayed");
        laptopsAndNotebooksPage.clickonShoppingCart();
        Assert.assertEquals(laptopsAndNotebooksPage.verifyShoppingCart1(),"Shopping Cart","Error message not displayed");
        Assert.assertEquals(laptopsAndNotebooksPage.verifyProdcutNameMacbook(),"MacBook","Error message not displayed");
        laptopsAndNotebooksPage.sendTextToChangeQty();
        laptopsAndNotebooksPage.clickOnUpdateBtton();
      //  Assert.assertEquals(laptopsAndNotebooksPage.verifyMessageForShoppingCart()," Success: You have modified your shopping cart!\n" +
             //   "    ","Error message not displayed");
        laptopsAndNotebooksPage.verifyTotal();
        laptopsAndNotebooksPage.clickOnCheckout();
        Assert.assertEquals(laptopsAndNotebooksPage.verifyTextCheckOut(),"Checkout","Error message not displayed");
        //Assert.assertEquals(laptopsAndNotebooksPage.verifyTextNewCustomer(),"New Customer","Error message not displayed");
       laptopsAndNotebooksPage.clickOnGusetCheckOut();
       laptopsAndNotebooksPage.clickonContinueTab();
       laptopsAndNotebooksPage.sendTextOnFirstNameField("rajviaa");
       laptopsAndNotebooksPage.sendTextOnLastNameField("asdoput");
       laptopsAndNotebooksPage.sendTextToEmailField("tollstationnya545@gmail.com");
       laptopsAndNotebooksPage.sendTextToTelephoneNumber("07541280086");
       laptopsAndNotebooksPage.sendTextToAdress("28,nadanvan cop");
       laptopsAndNotebooksPage.sendTextToCityField("chennai");
       laptopsAndNotebooksPage.sendTextToPostCode("wd23ht");
       laptopsAndNotebooksPage.selectCountry();
       laptopsAndNotebooksPage.selectZone();
       laptopsAndNotebooksPage.clikcOnContiuneBtton();
       laptopsAndNotebooksPage.addingCommentOnOrder();
       laptopsAndNotebooksPage.checkOnTearmsAndConditions();
       laptopsAndNotebooksPage.clikcOnContinueButton2();
        Assert.assertEquals(laptopsAndNotebooksPage.verifyWarningMessage(),"Warning: Payment method required!\n" +
                "×","Error message not displayed");

    }






}
