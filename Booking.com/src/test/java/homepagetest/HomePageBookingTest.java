package homepagetest;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import homepagestatefarm.HomePageBooking;

public class HomePageBookingTest extends WebAPI {

    // Test class

    //instance of HomepageClass
    HomePageBooking homePage;


    @BeforeMethod
    public void getInit() {
        homePage = PageFactory.initElements(driver, HomePageBooking.class);
    }

    //pressing sign in should take you to the sign in page

    @Test
    public void verifySignInPage1(){
        homePage.clickSignInButton();
       // homePage.getTextByXpath("//h1[@id='1b2565f5-953a-4a5f-a27e-ce861da74435']");
        String expectedText = "Sign in or create an account";
        String ActualText = homePage.getTextByXpath("//h1[@id='1b2565f5-953a-4a5f-a27e-ce861da74435']");
        Assert.assertEquals(ActualText, expectedText, "Page title not match");

    }


//i need help with this
    @Test
    public void verifySignInPage(){
        homePage.clickSignInButton();
        String expectedText = "Sign in or create an account";
        String ActualText = driver.findElement(By.id("1b2565f5-953a-4a5f-a27e-ce861da74435")).getText();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");

    }

    //verify that incorrect email address does not go through
    @Test (priority = 1)
    public void incorrectEmailAddress(){
        homePage.clickSignInButton();
        homePage.typeOnElement("//input[@id='username']","demo123");
        homePage.clickOnContinueButton();
        String expectedText = "Booking.com";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");
    }





}
