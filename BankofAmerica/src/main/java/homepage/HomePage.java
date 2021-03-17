package homepage;

import common.WebAPI;
import org.apache.tools.ant.taskdefs.Sleep;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Sleeper;

import java.security.Key;
import java.util.ArrayList;

import static homepage.HomePageWebElement.*;

public class HomePage  extends WebAPI {


    @FindBy (how = How.XPATH, using = aboutUs_xp) public WebElement aboutUSXP;
    @FindBy (how = How.LINK_TEXT, using = checking) public WebElement checkingTabLT;
    @FindBy (how = How.ID, using = onlineBanking) public WebElement OnlineBankingID;
    @FindBy (how = How.ID, using = CheckingSolutions) public WebElement CheckingSolutionsID;
    @FindBy (how = How.XPATH, using = zipCodeInput) public WebElement zipCodeXP;
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
//    @FindBy (how = How.XPATH, using = aboutUs_xp) public WebElement aboutUS;
//    @FindBy (how = How.XPATH, using = aboutUs_xp) public WebElement aboutUS;
//    @FindBy (how = How.XPATH, using = aboutUs_xp) public WebElement aboutUS;
//    @FindBy (how = How.XPATH, using = aboutUs_xp) public WebElement aboutUS;
//    @FindBy (how = How.XPATH, using = aboutUs_xp) public WebElement aboutUS;
//    @FindBy (how = How.XPATH, using = aboutUs_xp) public WebElement aboutUS;
//    @FindBy (how = How.XPATH, using = aboutUs_xp) public WebElement aboutUS;
//    @FindBy (how = How.XPATH, using = aboutUs_xp) public WebElement aboutUS;
//    @FindBy (how = How.XPATH, using = aboutUs_xp) public WebElement aboutUS;
//    @FindBy (how = How.XPATH, using = aboutUs_xp) public WebElement aboutUS;
//    @FindBy (how = How.XPATH, using = aboutUs_xp) public WebElement aboutUS;


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
        zipCodeXP.sendKeys("11364");
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
//    public void tabWindows() throws InterruptedException {
//        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
//        driver.get("https://www.google.com");
//        driver.switchTo().window(tabs.get(1)); //switch to tab 2
//        sleepFor(2);
//        driver.get("https://www.google.com");
//        driver.switchTo().window(tabs.get(2)); //switch to tab 2
//        sleepFor(2);
//        driver.get("https://www.tesla.com");
//        driver.switchTo().window(tabs.get(3)); //switch to tab 2
//        sleepFor(2);
//        driver.get("https://www.facebook.com");
//        driver.switchTo().window(tabs.get(4)); //switch to tab 2
//        sleepFor(2);
//        driver.get("https://www.yahoo.com");
//    }



}
