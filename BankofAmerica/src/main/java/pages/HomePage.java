package pages;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.io.IOException;

import static pages.HomePageWebElement.*;

public class HomePage extends WebAPI {
    Actions action = new Actions(driver);

    // Action method Class
    // Find BY Annotation: First Appraoch
    // @FindBy (How = How.xpath,using = signInId)public webElement id;
    @FindBy(css = onlineId)
    public WebElement idCode;
    @FindBy(xpath = passCode)
    public WebElement passCodeF;
    @FindBy(xpath = checkBox)
    public WebElement checkBoxF;
    @FindBy(xpath = signIn)
    public WebElement signINBttn;
    @FindBy(xpath = homeLoans)
    public WebElement homeLoanBttn;
    @FindBy(xpath = mortgages)
    public WebElement mortgagesbttn;
    @FindBy(linkText = viewRates)
    public WebElement viewRatesBttn;
    @FindBy(xpath = purchasePrice)
    public WebElement purchasePriceF;
    @FindBy(css = downPayment)
    public WebElement downPayementF;
    @FindBy(xpath = codeZip)
    public WebElement codeZipF;
    @FindBy(css = updateRates)
    public WebElement updateRatesBttn;
    @FindBy(css = autoLoans)
    public WebElement autoLoan_Tab;
    @FindBy(xpath = shopForCarLocator)
    public WebElement shopForCar;
    @FindBy(xpath = financeYourCar)
    public WebElement carFinance;
    @FindBy(how = How.XPATH, using = searchText)
    public WebElement productText;
    @FindBy(how = How.XPATH, using = zipCodField)
    public WebElement zipCode;
    @FindBy(how = How.CSS, using = shopForYourCar )
    public WebElement shopForYourCarBttn;
    @FindBy(how = How.LINK_TEXT, using = shopNow)
    public WebElement shopBttn;
    @FindBy(how = How.CSS, using = creditCards)
    public WebElement creditCards1;
    @FindBy(how = How.XPATH, using =shopForAllCreditCards)public WebElement shopForAllCreditCardsBttn;
    @FindBy(how = How.LINK_TEXT, using = viewAllCards) public WebElement viewAllCardsBttn;
    @FindBy(how = How.ID, using = bankAmeriCard)public WebElement bankAmeriCardBttn;
    @FindBy(how = How.XPATH, using = savings)public WebElement savingsBttn;
    @FindBy(how=How.XPATH,using = mobileBanking )public WebElement mobileBankingBtnn;
    @FindBy(how= How.CSS,using = checking) public WebElement checkingBttn;
    @FindBy(how=How.XPATH,using = exploreCheckingSolution) public WebElement exploreCheckingSolutionBttn;
    @FindBy(how=How.XPATH,using = getStarted) public WebElement getStartedBttn;
    @FindBy(how=How.XPATH,using =betterMoneyHabits) public WebElement betterMoneyHabitsBttn;
    @FindBy(how=How.XPATH,using =credit)public WebElement creditBttn;
    @FindBy(how=How.XPATH,using =college)public WebElement collegeBttn;
    @FindBy(how=How.ID,using =payingBackStudentLoan)public WebElement payingBackStudentLoanBttn;
    @FindBy(how=How.ID,using =switchLanguage)public WebElement switchToEspagnol;
    @FindBy(how=How.ID,using = help)public WebElement helpBttn;
    @FindBy(how=How.ID,using = searchBox)public WebElement searchBoxBttn;
    @FindBy(how=How.NAME,using = routingNumber)public WebElement routingNumberBttn;
    @FindBy(how=How.ID,using = aboutUs)public WebElement aboutUsBttn;
    @FindBy(how=How.XPATH,using = ourCompany)public WebElement ourCompanyBttn;
    @FindBy(how=How.XPATH,using =responsibleGrowth)public WebElement responsibleGrowthBttn;

    // Action method
    // signIn

    public void signInAccount() throws IOException {
        typeByCss(onlineId, myCode);
        sleepFor(5);
        typeByXpath(passCode, myPassCode);
        sleepFor(5);
        clickByXpath(checkBox);
        clickByXpath(signIn);
        sleepFor(5);
        takeScreenShot();
    }

    public void homeLoansBox() throws InterruptedException, IOException {
        clickByXpath(homeLoans);
        sleepFor(3);
        clickByXpath(mortgages);
        sleepFor(3);
        clickByLinkText(viewRates);
        sleepFor(3);
        driver.findElement(By.xpath(purchasePrice)).clear();
        typeByXpath(purchasePrice, purchasePriceInput);
        sleepFor(2);
        driver.findElement(By.cssSelector(downPayment)).clear();
        typeByCss(downPayment, downPaymentInput);
        sleepFor(2);
        driver.findElement(By.xpath(codeZip)).clear();
        typeByXpath(codeZip, codeZipInput);
        sleepFor(5);
        clickByCss(updateRates);
        sleepFor(5);
        takeScreenShot();
    }
    public void autoLoan() throws IOException {
        clickByCss(autoLoans);
        sleepFor(5);
        clickById(financeYourCar);
       typeByXpath(zipCodField,zipCode1);
       sleepFor(3);
       clickByCss(shopForCarLocator);
       clickByLinkText(shopNow);
       sleepFor(3);
    }
    public void creditCards() throws IOException {
        clickByCss(creditCards);
        sleepFor(3);
        clickByXpath(shopForAllCreditCards);
        sleepFor(2);
        clickByLinkText(viewAllCards);
        clickById(bankAmeriCard);
        sleepFor(3);
        takeScreenShot();
    }
    public void savings() throws IOException {
        clickByXpath(savings);
        sleepFor(2);
        clickByXpath(mobileBanking);
        sleepFor(3);
        takeScreenShot();
    }
    public void checking () throws IOException {
        clickByCss(checking);
        sleepFor(2);
        clickByXpath(exploreCheckingSolution);
        sleepFor(2);
        clickByXpath(getStarted);
        sleepFor(2);
        takeScreenShot();
    }
    public void betterMoneyHabits() throws IOException {
        clickByXpath(betterMoneyHabits);
        sleepFor(2);
        clickByXpath(credit);
        sleepFor(5);
        Actions action = new Actions(driver);
        Actions hover = action.moveToElement(collegeBttn);
        mouseHoverByXpath(college);
        clickByXpath(college);
        clickById(payingBackStudentLoan);
        sleepFor(3);
        takeScreenShot();
    }
    public void switchLanguage() {
        clickById(switchLanguage);
        sleepFor(5);
    }
    public void help() {
        clickById(help);
        sleepFor(2);
        clickById(searchBox);
        sleepFor(2);
        clickByName(routingNumber);
        sleepFor(2);
    }
  public void aboutUs(){
        clickById(aboutUs);
        sleepFor(2);
      Actions action = new Actions(driver);
      Actions hover = action.moveToElement(ourCompanyBttn);
      mouseHoverByXpath(ourCompany);
        clickByXpath(ourCompany);
        sleepFor(2);

    }







    }















































