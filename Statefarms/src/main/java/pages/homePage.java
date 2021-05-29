package pages;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.io.IOException;

import static pages.webElement.*;

public class homePage extends WebAPI {



    @FindBy(xpath= claim_xp) public WebElement claim;
    @FindBy(xpath= fileAclaim_xp) public WebElement fileAClaim;
    @FindBy(xpath= autoGlass_xp) public WebElement autoGlass;
    @FindBy(id=userNameLocator)public WebElement userIdField;
    @FindBy(id=passWordLocator)public WebElement passWordField;
    @FindBy(xpath =loginLocator)public WebElement loginBttn;
    @FindBy(css=remeberUserIdLocator)public WebElement rememberUseId;
    @FindBy(css=loginSubmitLocator)public WebElement loginSubmit;
    @FindBy(id = stateFarmsLogoLocator)public WebElement stateFarmBttn;
    @FindBy(css = findAnAgentLocator)public WebElement findAnAgentBttn;
    @FindBy(xpath = zipCodeLocator)public WebElement zipCodeField;
    @FindBy(xpath = insuranceLocator)public WebElement insurance_tab;
    @FindBy(xpath = insuranceOverview)public WebElement insuranceOveriewTab;
    @FindBy(id = quoteZipCodeLocator)public WebElement quoteZipCode;
    @FindBy(xpath = startQuoteLocator)public WebElement startQuote;
    @FindBy(id= productLocator)public WebElement productBttn;
    @FindBy(xpath = searchLocator)public WebElement searchButton;
    @FindBy(id=searchField)public WebElement searchF;
    @FindBy(css=searchButtonLocator)public WebElement searchBttn;
    @FindBy(css=changeLanguage)public WebElement languageChange;
    @FindBy(xpath=getAquoteLocator)public WebElement getAquote;
    @FindBy(css=productsLocator)public WebElement productField;
    @FindBy(id=startAquoteLocator)public WebElement startQuoteButton;
    @FindBy(xpath=addressFieldLocator)public WebElement addressField;
    @FindBy(xpath = line2FieldLocator)public WebElement line2Address;
    @FindBy(id= cityFieldLocator)public WebElement cityField;
    @FindBy(name= stateLocator)public WebElement stateList;
    @FindBy(css=calenderLocator)public WebElement calender;
    @FindBy(css=continueLocator)public WebElement continueButton;
    @FindBy(id=zipCodeQuoteLocator)public WebElement zipCode;

    public void getAquote(){
        clickByXpath(getAquoteLocator);
        sleepFor(2);
        waitUntilSelectable(By.cssSelector(productsLocator));
       selectOptionByVisibleText(productsLocator,renters);
        sleepFor(2);
        typeById(zipCodeQuoteLocator,zipCodeaddr);
        sleepFor(2);
        clickById(startAquoteLocator);
        sleepFor(2);
        typeByXpath(addressFieldLocator,addressinput1);
        sleepFor(2);
        typeByXpath(line2FieldLocator,addressinput2);
        sleepFor(2);
        typeById(cityFieldLocator,cityInput);
        sleepFor(2);
        clickByName(stateLocator);
        selectOptionByVisibleText(stateFarmsLogoLocator,stateInput);
        sleepFor(2);
        typeByCss(calenderLocator,index);
    }
    public void searchButton(){
    clickByXpath(searchLocator);
    sleepFor(2);
    typeById(searchField,searchFieldInput);
    sleepFor(2);
    clickByCss(searchButtonLocator);
    sleepFor(2);
    clickByXpath(searchLocator);
    sleepFor(2);
    clickByCss(changeLanguage);
    sleepFor(2);

}
    public void insuranceTab(){
    clickByXpath(insuranceLocator);
    sleepFor(2);
    clickByXpath(insuranceOverview);
    sleepFor(2);
    clickById(productLocator);
    sleepFor(2);
    selectOptionByVisibleText(productLocator,productList);
    sleepFor(2);
    typeById(quoteZipCodeLocator,zipCodeInput);
    sleepFor(2);
    clickByXpath(startQuoteLocator);
    sleepFor(2);
}
    public void stateFarmsLogo() throws IOException {
         clickById(stateFarmsLogoLocator);
         sleepFor(2);
         typeByXpath(zipCodeLocator,zipCodeInput);
         sleepFor(2);
         clickByCss(findAnAgentLocator);
         sleepFor(2);
         //takeScreenShot();
    }
    public void loginBttn() throws IOException {
        clickByXpath(loginLocator);
        typeById(userNameLocator,userIdLoginField);
        sleepFor(2);
        typeById(passWordLocator,passWordInput);
        sleepFor(2);
        clickByCss(remeberUserIdLocator);
        sleepFor(2);
        clickByCss(loginSubmitLocator);
        sleepFor(2);
        takeScreenShot();

    }
    public void clickClaimTab() {
        claim.click();
        clickByXpath(claim_xp);
        sleepFor(2);
        clickByXpath(fileAclaim_xp);
        sleepFor(2);
        clickByXpath(autoGlass_xp);
        sleepFor(2);








    }


}
