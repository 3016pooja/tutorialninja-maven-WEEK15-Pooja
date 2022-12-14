package com.tutorialninja.testsuite;


import com.tutorialninja.customlisteners.CustomListeners;
import com.tutorialninja.pages.MyAccountPage;
import com.tutorialninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class MyAccountPageTest extends BaseTest {
    MyAccountPage myAccountPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        myAccountPage=new  MyAccountPage();
    }

@Test(groups = {"sanity","regression"})
 public void verifyUserShouldNavigateToRegisterPageSuccessfully() {
   myAccountPage.clickOnMyAccount1();
   myAccountPage.clikcOnRegister();

}
@Test(groups = {"smoke","regression"})
    public void  verifyUserShouldNavigateToLoginPageSuccessfully(){
    myAccountPage.clickOnMyAccount1();
    myAccountPage.clikOnLoginButton();
    Assert.assertEquals(myAccountPage.verifyTextReturningCustomer(),"Returning Customer","Error message not displayed");
}
@Test(groups = "regression")
    public void verifyThatUserRegisterAccountSuccessfully(){
    myAccountPage.clickOnMyAccount1();
    myAccountPage.clikcOnRegister();
    myAccountPage.EnterYourFirstName("sidhant");
    myAccountPage.EnterYourLastName("shinde");
    myAccountPage.EnterYourEmailId();
    myAccountPage.EnterYourTelephoneNumber();
    myAccountPage.EnterYourPassword();
    myAccountPage.EnterYourConfirmPassword();
    myAccountPage.clikOnYesRadioButton();
    myAccountPage.clickOnPrivacyPolicy();
    myAccountPage.clickOnButtonContine();
    Assert.assertEquals(myAccountPage.verifyYourAccountCreatedText(),"Your Account Has Been Created!","Error message not displayed");
    myAccountPage.clickTheButtonContine3();
    myAccountPage.clickOnMyAccountLink();
    myAccountPage.clickOnLogout();
    Assert.assertEquals(myAccountPage.verifyAccountLogoutText(),"Account Logout","Error message not displayed");
    myAccountPage.clickOnContinueButton4();

}
@Test(groups = "regression")
    public void verifyThatUserShouldLoginAndLogoutSuccessfully(){
    myAccountPage.clickOnMyAccount1();
    myAccountPage.clikOnLoginButton();
    myAccountPage.clearemailAddress();

    myAccountPage.enterYourRegisterPassword();
    myAccountPage.clickOnAccountLoginButton();
    Assert.assertEquals(myAccountPage.verifyMyaccountText1(),"My Account","Error message not displayed");
    myAccountPage.clickOnMyAccountLink1();
    myAccountPage.clickOnParameterLogout();
    Assert.assertEquals(myAccountPage.verifyMyaccountLogoutText1(),"Account Logout","Error message not displayed");
    myAccountPage.clickOnContinueButtonInEnd();


}
}
