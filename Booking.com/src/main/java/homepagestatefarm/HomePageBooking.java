package homepagestatefarm;


import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class HomePageBooking extends WebAPI {

    //    @FindBy(how = How.XPATH, using = autozoneSearchBoxLocator) public WebElement autozoneSearchBox;
    //    //@FindBy(how = How.XPATH, using = closeCookies) public WebElement closeCookies1;

    //    public static final String homePageLogo = "//a[contains(text(),'Personal')]"; //xpath

    public static final String signInButtonLocator = "//header/nav[1]/div[2]/div[6]/a[1]/span[1]"; //xpath
    @FindBy(how = How.XPATH, using = signInButtonLocator)
    public WebElement signInButton;

    public static final String signInTextLocator = "//h1[@id='1b2565f5-953a-4a5f-a27e-ce861da74435']"; //xpath
    @FindBy(how = How.XPATH, using = signInTextLocator)
    public WebElement signInText;

    @FindBy(how = How.XPATH, using = "//input[@id='username']") public WebElement emailAddressField;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Continue with email')]") public WebElement continueButton;



    //make action methods

    //click sign in button
    public void clickSignInButton() {
        signInButton.click();
    }
//
//    public void verifyPageTitle(String expectedText) {
//        String actualText = driver.getTitle();
//        Assert.assertEquals("Page Title not match", expectedText, actualText);
//
//    }

    public void clickOnContinueButton(){
        continueButton.click();
    }
}