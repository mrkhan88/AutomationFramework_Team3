package homepagetest;

import pages.HomePage;
import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class HomePageTest extends WebAPI {

    HomePage homePage;

    @BeforeMethod
    public void getInit() {
        homePage = PageFactory.initElements(driver, pages.HomePage.class);
    }

    @Test(enabled = false)
    public void testSignInAnAccount() throws IOException {
        homePage.signInAccount();
        String expectedText = " Forgot ID/Passcode";
        String actualText = driver.findElement(By.name("/forgot-id-passcode")).getText();
        Assert.assertEquals(actualText, expectedText, "text is matching");
    }

    @Test(enabled = false)
    public void testHomeLoansBox() throws IOException, InterruptedException {
        homePage.homeLoansBox();
        String expectedTitle = "Mortgage Rates - Today's Rates from Bank of America";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "the text matching ");
    }

    @Test(enabled = false)
    public void testAutoLoan() throws IOException {
        homePage.autoLoan();
        String expectedText = "Your car buying journey starts here";
        String actualText = driver.findElement(By.xpath("//h3[contains(text(),'Your car buying journey starts here')]")).getText();
        Assert.assertEquals(actualText, expectedText, "The text does match");
    }

    @Test(enabled = false)
    public void testCreditCards() throws IOException {
        homePage.creditCards();
        String expectedText = "Save on interest, it's that simple";
        String actualText = driver.findElement(By.cssSelector(".small-9")).getText();
        Assert.assertEquals(actualText, expectedText, "the text Matching ");
    }

    @Test(enabled = false)
    public void testSavings() throws IOException {
        homePage.savings();
        String expectedText = "Bank simply and securely on your schedule";
        String actualText = driver.findElement(By.xpath("//span[contains(text(),'Bank simply and securely on your schedule')]")).getText();
        Assert.assertEquals(actualText, expectedText, "the text Matching ");
    }

    @Test(enabled = false)
    public void testChecking() throws IOException {
        homePage.checking();
        String expectedText = "Which is best for you?";
        String actualText = driver.findElement(By.id("openYourAccount_title")).getText();
        Assert.assertEquals(actualText, expectedText, "the text Matching ");
    }

    @Test(enabled = false)
    public void testBetterMoneyHabits() throws IOException {
        homePage.betterMoneyHabits();
        String expectedTitle = "Tips for Planning and How to Pay for College";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "the text matching ");

    }
    @Test(enabled = false)
    public void testSwitchLanguage(){
        homePage.switchLanguage();
        String expectedTitle="Bank of America: operaciones bancarias, tarjetas de crédito, préstamos e inversiones con Merrill";
        String actualTitle= driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle,"title is matching");
    }
@Test(enabled=false)
    public void testHelpButton(){
        homePage.help();
    String expectedTitle = "Bank of America Help Center - Get Your Questions Answered";
    String actualTitle = driver.getTitle();
    Assert.assertEquals(actualTitle, expectedTitle, "the text matching ");
}
@Test(enabled = true)
    public void testAboutUs(){
        homePage.aboutUs();
    String expectedText = "Delivering responsible growth";
    String actualText = driver.findElement(By.cssSelector("h1")).getText();
    Assert.assertEquals(actualText, expectedText, "the text Matching ");

}









}



