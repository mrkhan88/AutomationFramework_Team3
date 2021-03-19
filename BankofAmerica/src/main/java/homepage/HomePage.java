package homepage;

import common.WebAPI;
import org.apache.poi.ss.formula.functions.WeekNum;
import org.apache.tools.ant.taskdefs.Sleep;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;

import java.lang.annotation.Repeatable;
import java.security.Key;
import java.util.ArrayList;

import static homepage.HomePageWebElement.*;

public class HomePage  extends WebAPI {

    @FindBy (how = How.XPATH, using = aboutUs_xp) public WebElement aboutUSXP;
    @FindBy (how = How.LINK_TEXT, using = checking) public WebElement checkingTabLT;
    @FindBy (how = How.ID, using = onlineBanking) public WebElement OnlineBankingID;
    @FindBy (how = How.ID, using = CheckingSolutions) public WebElement CheckingSolutionsID;
    @FindBy (how = How.XPATH, using = zipCodeInput) public WebElement zipCodeInputXP;
    @FindBy (how = How.ID, using = submitZipCode) public WebElement enterZipCodeID;
    @FindBy (how = How.ID, using = mobileBanking) public WebElement mobileBankingID;
    @FindBy (how = How.XPATH, using = fingerPrintSignin) public WebElement fingerPrintSigninLT;
    @FindBy (how = How.XPATH, using = enroll) public WebElement enrollXP;
    @FindBy (how = How.XPATH, using = openAccount) public WebElement openAccountXP;
    @FindBy (how = How.XPATH, using = checkingAndSaving) public WebElement checkingAndSavingXP;
    @FindBy (how = How.XPATH, using = HomePageWebElement.openBasicAccount) public WebElement openBasicAccount;
    @FindBy (how = How.XPATH, using = yesAddSavings) public WebElement yesAddSavingsXP;
    @FindBy (how = How.XPATH, using = goToApplication) public WebElement goToApplicationXP;
    @FindBy (how = How.XPATH, using = zipCodePopUp) public WebElement zipCodePopUpXP;
    @FindBy (how = How.XPATH, using = firstNameTab) public WebElement firstNameXP;
    @FindBy (how = How.XPATH, using = lastNameTab) public WebElement lastNameXP;
    @FindBy (how = How.XPATH, using = addressTab) public WebElement addressXP;
    @FindBy (how = How.XPATH, using = cityTab) public WebElement cityXP;
    @FindBy (how = How.XPATH, using = stateTab) public WebElement stateXP;
    @FindBy (how = How.XPATH, using = zipCodeTab) public WebElement zipCodeXP;
    @FindBy (how = How.XPATH, using = phoneNumberTab) public WebElement phoneNumberXP;
    @FindBy (how = How.XPATH, using = mobileTab) public WebElement mobileXP;
    @FindBy (how = How.XPATH, using = emailTab) public WebElement emailXP;
    @FindBy (how = How.CSS, using = emailReenter) public WebElement emailReenterCSS;
    @FindBy (how = How.XPATH, using = citizenYes) public WebElement citizenXP;
    @FindBy (how = How.XPATH, using = ssN) public WebElement ssNXP;
    @FindBy (how = How.XPATH, using = dualCitizenNo) public WebElement dualCitizenNoXP;
    @FindBy (how = How.XPATH, using = countryDrop) public WebElement countryDropXP;
    @FindBy (how = How.XPATH, using = doB) public WebElement doBXP;
    @FindBy (how = How.XPATH, using = sourceOfIncome) public WebElement sourceOfIncomeXP;
    @FindBy (how = How.XPATH, using = companyName) public WebElement companyNameXP;
    @FindBy (how = How.XPATH, using = occupation) public WebElement occupationXP;
    @FindBy (how = How.CSS, using = emailCS) public WebElement emailCSS;
//    @FindBy (how = How.XPATH, using = )



    public void clickAboutUS2() throws InterruptedException {
        aboutUSXP.click();

    }
    public void clickCheckingTab() throws InterruptedException {
        checkingTabLT.click();

    }
    public void clickOnlineBanking(){
        checkingTabLT.click();
        OnlineBankingID.click();
    }

    public void clickOnCheckingSolutions() throws InterruptedException {
        checkingTabLT.click();
        CheckingSolutionsID.click();
        Thread.sleep(5000);
        zipCodeInputXP.sendKeys("11364");
        Thread.sleep(3000);
        enterZipCodeID.click();
        Thread.sleep(5000);

    }
    public void scrollDownToMiddle() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2500)");
        Thread.sleep(3000);
    }
    public void scrollToElement() throws InterruptedException {
        WebElement bottomPageElement = driver.findElement(By.xpath("yniLifeServicesCta"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", bottomPageElement);
        Thread.sleep(5000);
    }
    public void mouseHovering() throws InterruptedException {
        checkingTabLT.click();
        mobileBankingID.click();
        WebElement gifts =(fingerPrintSigninLT);
        Actions actions = new Actions(driver);
        actions.moveToElement(gifts).build().perform();
        Thread.sleep(5000);


    }
    public void rightClickEnroll(){
        Actions actions = new Actions(driver);
        WebElement elementLocator = enrollXP ;
        actions.contextClick(elementLocator).perform();
    }
    public void openBasicAccount() throws InterruptedException {
    openAccountXP.click();
    sleepFor(3);
    checkingAndSavingXP.click();
    sleepFor(3);
    openBasicAccount.click();
    sleepFor(3);
      //driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");

        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1)); //switch to tab 2
        sleepFor(2);
        //driver.get("https://www.bankofamerica.com/deposits/checking/advantage-safebalance-banking-account/before-you-apply/");

       // driver.switchTo().window(tabs.get(0)); // switch back to main screen
        //driver.get("https://www.news.google.com");
    zipCodePopUpXP.sendKeys("11364",Keys.ENTER);
    sleepFor(3);
    yesAddSavingsXP.click();
    sleepFor(3);
    goToApplicationXP.click();
    sleepFor(5);

    }
public void fillInForm() throws InterruptedException {

    openBasicAccount();
    firstNameXP.sendKeys("Michael", Keys.TAB,Keys.TAB);
    sleepFor(2);
    lastNameXP.sendKeys("Xie",Keys.TAB,Keys.TAB);
    sleepFor(2);
    addressXP.sendKeys("123 Apple St", Keys.TAB, Keys.TAB);
    sleepFor(2);
    cityXP.sendKeys("New York",Keys.TAB);
    sleepFor(2);
    Select dropState = new Select(driver.findElement(By.xpath(stateTab)));
    dropState.selectByVisibleText("New York");
    sleepFor(5);
    zipCodeXP.sendKeys("11373", Keys.TAB);
    sleepFor(3);
    phoneNumberXP.sendKeys("9174567890",Keys.TAB);
    sleepFor(3);
    Select dropMobile = new Select(driver.findElement(By.xpath(mobileTab)));
    dropMobile.selectByVisibleText("Home");
    sleepFor(5);
    emailXP.sendKeys("apples@bananas.com",Keys.TAB);
    sleepFor(3);
   // emailXP.sendKeys(Keys.chord(Keys.CONTROL,Keys.CONTROL+"c"));
   // emailCSS.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.CONTROL, "c"));
    //sleepFor(3);
   // emailCSS.sendKeys(Keys.chord(Keys.CONTROL, "c"));
    emailReenterCSS.sendKeys("apples@bananas.com");
    sleepFor(3);
    citizenXP.click();
    sleepFor(3);
    ssNXP.sendKeys("321659874", Keys.TAB, Keys.TAB, "321659874");
    sleepFor(3);
    dualCitizenNoXP.click();
    sleepFor(3);
    Select dropCountry = new Select(driver.findElement(By.xpath(countryDrop)));
    dropCountry.selectByValue("1000249");
    sleepFor(3);
    doBXP.sendKeys("01191990");
    sleepFor(3);
    Select dropIncome = new Select(driver.findElement(By.xpath(sourceOfIncome)));
    dropIncome.selectByValue("EmploymentIncome");
    sleepFor(3);
    companyNameXP.sendKeys("PeopleNTech", Keys.TAB, "2124567897",Keys.TAB);
    Select dropJob = new Select(driver.findElement(By.xpath(occupation)));
    dropJob.selectByValue("Engineer");
    sleepFor(3);


}



}
