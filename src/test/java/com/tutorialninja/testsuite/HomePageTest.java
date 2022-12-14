package com.tutorialninja.testsuite;


import com.tutorialninja.customlisteners.CustomListeners;
import com.tutorialninja.pages.HomePage;
import com.tutorialninja.pages.LaptopsAndNotebooksPage;
import com.tutorialninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class HomePageTest extends BaseTest {

    HomePage homePage;
    LaptopsAndNotebooksPage laptopsAndNotebooksPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        homePage=new HomePage();
        laptopsAndNotebooksPage=new LaptopsAndNotebooksPage();

    }


    @Test(groups = {"sanity","regression"})
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully(){
        homePage.mouseHoverOnDesktop();
        homePage.clickOnShowAllTheDesktops();
        Assert.assertEquals(homePage.verifyText(),"Desktops","Verify the Text");

    }
    @Test(groups = {"smoke","regression"})
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully(){
        homePage.mouseHoverOnLaptopAndNoteBooks();
        homePage.clickOnShowAllLaptopsAndNoteBooksClick();
        Assert.assertEquals(homePage.verifyText1(),"Laptops & Notebooks","Verify the Text");

    }
    @Test(groups = "regression")
    public void verifyUserShouldNavigateToComponentsPageSuccessfully(){
      homePage.mouseHoverOnComponents();
        homePage.clickOnShowAllComponents();
        Assert.assertEquals(homePage.VerifyText2(),"Components","Verify the Text");
    }
}
