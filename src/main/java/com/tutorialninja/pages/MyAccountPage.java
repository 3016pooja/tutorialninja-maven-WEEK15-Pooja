package com.tutorialninja.pages;


import com.aventstack.extentreports.Status;
import com.tutorialninja.customlisteners.CustomListeners;
import com.tutorialninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class MyAccountPage extends Utility {
    @CacheLookup
    @FindBy(xpath= "//span[contains(text(),'My Account')]")
    WebElement myAccount ;
    @CacheLookup
    @FindBy(xpath= "//a[contains(text(),'Register')]")
    WebElement register ;
    @CacheLookup
    @FindBy(xpath= "//h1[contains(text(),'Register Account')]")
    WebElement registerText ;
    @CacheLookup
    @FindBy(xpath= "//a[contains(text(),'Login')]")
    WebElement loginButton ;
    @CacheLookup
    @FindBy(xpath= "//h2[contains(text(),'Returning Customer')]")
    WebElement returningCustomerText ;

    @CacheLookup
    @FindBy(id= "input-firstname")
    WebElement firstNameRegister ;
    @CacheLookup
    @FindBy(id= "input-lastname")
    WebElement lastNameRegister ;
    @CacheLookup
    @FindBy(id= "input-email")
    //WebElement emailIdRegister ;
By emailIdRegister=By.id("input-email");
    @CacheLookup
    @FindBy(id= "input-telephone")
    WebElement telephoneNumberRegister ;
    @CacheLookup
    @FindBy(id= "input-password")
    WebElement passwordRegister ;
//By passwordRegister=By.id("input-password");
    @CacheLookup
    @FindBy(id= "input-confirm")
    WebElement confirmPasswordRegister ;
//By confirmPasswordRegister=By.id("input-confirm");
    @CacheLookup
    @FindBy(xpath= "//body/div[@id='account-register']/div[1]/div[1]/form[1]/fieldset[3]/div[1]/div[1]/label[1]/input[1]")
    WebElement radioButtonYes ;
//By radioButtonYes=By.xpath("//body/div[@id='account-register']/div[1]/div[1]/form[1]/fieldset[3]/div[1]/div[1]/label[1]/input[1]");

    @CacheLookup
    @FindBy(xpath= "//body/div[@id='account-register']/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")
    WebElement privacyPolicyChekcBox ;
//By privacyPolicyChekcBox= By.xpath("//body/div[@id='account-register']/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]");

    @CacheLookup
    @FindBy(xpath= "//body/div[@id='account-register']/div[1]/div[1]/form[1]/div[1]/div[1]/input[2]")
    WebElement continueButtonclick ;
//By continueButtonclick=By.xpath("//body/div[@id='account-register']/div[1]/div[1]/form[1]/div[1]/div[1]/input[2]");
    @CacheLookup
    @FindBy(xpath= "//h1[contains(text(),'Your Account Has Been Created!')]")
    WebElement accontCreatedText ;
//By accontCreatedText=By.xpath("//h1[contains(text(),'Your Account Has Been Created!')]");
    @CacheLookup
    @FindBy(xpath= "//a[contains(text(),'Continue')]")
    WebElement continueButton3 ;
//By continueButton3=By.xpath("//a[contains(text(),'Continue')]");
    @CacheLookup
    @FindBy(xpath= "//body/div[@id='account-account']/div[1]/aside[1]/div[1]/a[1]")
    WebElement MyAccountLink ;
//By MyAccountLink=By.xpath("//body/div[@id='account-account']/div[1]/aside[1]/div[1]/a[1]");
    @CacheLookup
    @FindBy(xpath= "//body/div[@id='account-account']/div[1]/aside[1]/div[1]/a[13]")
    WebElement logoutButton ;
//By logoutButton=By.xpath("//body/div[@id='account-account']/div[1]/aside[1]/div[1]/a[13]");
    @CacheLookup
    @FindBy(xpath= "//h1[contains(text(),'Account Logout')]")
    WebElement accountLogoutText ;
//By accountLogoutText=By.xpath("//h1[contains(text(),'Account Logout')]");
    @CacheLookup
    @FindBy(xpath= "//a[contains(text(),'Continue')]")
    WebElement continueButton4 ;
//By continueButton4=By.xpath("//a[contains(text(),'Continue')]");
    @CacheLookup
    @FindBy(id= "input-email")
    WebElement clearEmailField ;
//By clearEmailField=By.id("input-email");
    @CacheLookup
    @FindBy(id= "input-password")
    WebElement yourPassword ;

//By yourPassword=By.id("input-password");
    @CacheLookup
    @FindBy(xpath= "//body/div[@id='account-login']/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/input[1]")
    WebElement loginButton16 ;
    @CacheLookup
    @FindBy(xpath= "//h2[contains(text(),'My Account')]")
    WebElement myAccountText1 ;
    @CacheLookup
    @FindBy(xpath= "//body/div[@id='account-account']/div[1]/aside[1]/div[1]/a[1]")
    WebElement myAccountLinkClick1 ;
    @CacheLookup
    @FindBy(xpath= "//body/div[@id='account-account']/div[1]/aside[1]/div[1]/a[13]")
    WebElement accountLogout1 ;
//By accountLogout1= By.xpath("//body/div[@id='account-account']/div[1]/aside[1]/div[1]/a[13]");
    @CacheLookup
    @FindBy(xpath= "//h1[contains(text(),'Account Logout')]")
    WebElement accountLogoutText1 ;
//By accountLogoutText1=By.xpath("//h1[contains(text(),'Account Logout')]");
    @CacheLookup
    @FindBy(xpath= "//a[contains(text(),'Continue')]")
    WebElement continueButtonLast ;
//By continueButtonLast=By.xpath("//a[contains(text(),'Continue')]");




   // 1.1 Clickr on My Account Link.
    public void clickOnMyAccount1(){
        Reporter.log("click on the element"+ myAccount.toString());
        clickOnElement(myAccount);
    }
    public void clikcOnRegister(){
        Reporter.log("click the on the register button"+ register.toString());
        clickOnElement(register);
    }
    //1.3 Verify the text “Register Account”.
    public String verifyTextRegisterAccount(){
        Reporter.log("verify the text register account");
        String message=getTextFromElement(register);
        CustomListeners.test.log(Status.PASS,"Get error Message");
        return message;
    }
    //2.2 click on login
    public void clikOnLoginButton(){
        Reporter.log("click the login button"+ loginButton.toString());

        clickOnElement(loginButton);
    }
    //2.3 Verify the text “Returning Customer”.
    public String verifyTextReturningCustomer(){
        Reporter.log("verify the text returning customer");
        String message=getTextFromElement(returningCustomerText);
        CustomListeners.test.log(Status.PASS,"Get error Message");
        return message;
    }
   //3. 3 Enter First Name
   public void EnterYourFirstName(String frstname) {
       Reporter.log("Enter first name to the  field"+frstname+ firstNameRegister.toString());
       sendTextToElement(firstNameRegister,frstname);
   }
   //3.4 Enter Last Name
    public void EnterYourLastName(String lastname) {
        Reporter.log("Enter last name to the  field"+lastname+ lastNameRegister.toString());

        sendTextToElement(lastNameRegister,lastname);
    }
 //3.5 Enter Email
 public void EnterYourEmailId() {
     Reporter.log("Enter email adress to the  field"+ emailIdRegister.toString());
     sendTextToElement(emailIdRegister,"townmumbai123@gmail.com");
 }
//3.6 Enter Telephone
public void EnterYourTelephoneNumber() {
    Reporter.log("Enter first name to the  field"+ telephoneNumberRegister.toString());

    sendTextToElement(telephoneNumberRegister,"0750024589");
}
//3.7 Enter Password
public void EnterYourPassword() {
    Reporter.log("Enter  password to the  field"+ passwordRegister.toString());

    sendTextToElement(passwordRegister,"name222356");
}
//3.8 Enter Password Confirm
public void EnterYourConfirmPassword() {
    Reporter.log("Enter confirm password to the  field"+ confirmPasswordRegister.toString());

    sendTextToElement(confirmPasswordRegister,"name222356");
}
public void clikOnYesRadioButton(){
    Reporter.log("click the radio  button"+ radioButtonYes.toString());
    clickOnElement(radioButtonYes);
}

public void clickOnPrivacyPolicy() {
    Reporter.log("click the privacy policy box "+ privacyPolicyChekcBox.toString());
    clickOnElement(privacyPolicyChekcBox);
}
public void clickOnButtonContine() {
    Reporter.log("click the continue button"+ continueButtonclick.toString());
    clickOnElement(continueButtonclick);
}
//3.12 Verify the message “Your Account Has Been Created!”
    public String verifyYourAccountCreatedText(){
        Reporter.log("verify the text account created ");
        String message=getTextFromElement(accontCreatedText);
        CustomListeners.test.log(Status.PASS,"Get error Message");
        return message;

    }
            public void clickTheButtonContine3() {
                Reporter.log("click the login button"+ continueButton3.toString());
                clickOnElement(continueButton3);
            }

    public void clickOnMyAccountLink() {
        Reporter.log("click the login button"+ MyAccountLink.toString());
        clickOnElement(MyAccountLink);
    }
//3.15 Call the method “selectMyAccountOptions” method and pass the parameter “Logout”
    public void clickOnLogout(){
        Reporter.log("click the login button"+ logoutButton.toString());
        clickOnElement(logoutButton);
    }
           // 3.16 Verify the text “Account Logout”
    public String verifyAccountLogoutText(){
        Reporter.log("verify the text dashboard");
        String message=getTextFromElement(accountLogoutText);
        CustomListeners.test.log(Status.PASS,"Get error Message");
        return message;
    }
            //3.17 Click on Continue button
    public void clickOnContinueButton4() {
        Reporter.log("click the login button"+ continueButton4.toString());

        clickOnElement(continueButton4);
    }
    public void clearemailAddress(){
        WebElement emailaddress = driver.findElement((By) clearEmailField);
        emailaddress.clear();
        emailaddress.sendKeys("townmumbai123@gmail.com");


    }

    //4.3 Enter Email address
   // public void EnterEmailAdress(){
       //sendTextToElement(emailAddress,"citylondon123@gmail.com");
    //}
    //4.4 enter password
    public void enterYourRegisterPassword(){
        Reporter.log("Enter first name to the  field"+yourPassword.toString());

        sendTextToElement(yourPassword,"name222356");
    }
    //4.6 Click on Login button
    public void clickOnAccountLoginButton(){
        clickOnElement(loginButton16);
    }
    //4.7 Verify text “My Account”
    public String verifyMyaccountText1(){
        Reporter.log("verify the text dashboard");
        String message=getTextFromElement(myAccountText1);
        CustomListeners.test.log(Status.PASS,"Get error Message");
        return message;

    }
    // //4.8 Click on My Account Link.
    public void clickOnMyAccountLink1(){
        Reporter.log("click the my account link "+ myAccountLinkClick1);
        clickOnElement(myAccountLinkClick1);
    }
//4.9 pass the parameter “Logout”
    public void clickOnParameterLogout(){
        clickOnElement(accountLogout1);
    }
    // 4.10 Verify the text “Account Logout”
           public String verifyMyaccountLogoutText1(){
               Reporter.log("verify the text dashboard");
               String message=getTextFromElement(accountLogoutText1);
               CustomListeners.test.log(Status.PASS,"Get error Message");
               return message;
           }
           //4.11 Click on Continue button
    public void clickOnContinueButtonInEnd(){
        Reporter.log("click the login button"+ continueButtonLast.toString());

        clickOnElement(continueButtonLast);
    }

}