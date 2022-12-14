package com.tutorialninja.testsuite;

import com.tutorialninja.customlisteners.CustomListeners;
import com.tutorialninja.pages.DesktopsPage;
import com.tutorialninja.pages.HomePage;
import com.tutorialninja.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class DesktopTest extends BaseTest {

    DesktopsPage deskTopsPage ;
    HomePage homePage;
    DesktopsPage desktopsPage;
    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        homePage=new HomePage();
        deskTopsPage = new DesktopsPage();
        desktopsPage=new DesktopsPage();

    }



@Test(groups = {"sanity","regression"})
   public void verifyProductArrangeInAlphaBaticalOrder() {

    homePage.mouseHoverOnDesktop();
    homePage.clickOnShowAllTheDesktops();
    //deskTopsPage.sortByNameZtoA("");
    deskTopsPage.sortByNameZtoA1("Name (Z - A)");

}

    @Test(groups = {"smoke","regression"})
    public void  verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
    deskTopsPage.mouseHoverOnDesktops();
    deskTopsPage.mouseHoverOnShowAllDesktops();
        deskTopsPage.sorybyAtoZ1("Name (A - Z)");
   // deskTopsPage.sortByNameAtoZ();
    deskTopsPage.selectHPLaptop();//2.4 Select product “HP LP3065”
    deskTopsPage.verifyTheTextForHpLaptop(); //2.5 Verify the Text "HP LP3065
        Assert.assertEquals(deskTopsPage.verifyTheTextForHpLaptop(),"HP LP3065","Error message not displayed");
        deskTopsPage.selectDeliveryDate();//2.6 select delivery date
    deskTopsPage.sendQty(" ");//select Qty 1
        clickOnElement(By.xpath("//button[@id='button-cart']"));
        Thread.sleep(2000);
        String expectedText1 = "Success: You have added HP LP3065 to your shopping cart!\n" +
                "×";
        Assert.assertEquals(desktopsPage.verifYMessageSuceessfullyAdded(), expectedText1, "Product not added to cart");


        clickOnElement(By.xpath("//a[contains(text(),'shopping cart')]"));
        Thread.sleep(2000);
        Assert.assertEquals(deskTopsPage.verifyTxtShopingCart(),"Shopping Cart","Error message not displayed");
        Assert.assertEquals(deskTopsPage.verifyProductNamee(),"HP LP3065","Error message not displayed");
        Assert.assertEquals(deskTopsPage.verifyDelviertDate(),"Delivery Date: 2011-04-22","Error message not displayed");
        Assert.assertEquals(deskTopsPage.verifyModel(),"Product 21","Error message not displayed");
        Assert.assertEquals(deskTopsPage.verifyTotalPrice(),"$122.00","Error message not displayed");
    }

}
