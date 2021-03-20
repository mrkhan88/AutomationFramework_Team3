package homepagetest;

import common.WebAPI;
import homepage.HomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends WebAPI {
    // Test class

    //instance of HomepageClass
    HomePage homePage;


    @BeforeMethod
    public void getInit() throws InterruptedException {
        homePage = PageFactory.initElements(driver, HomePage.class);
        sleepFor(5);
    }

    @Test(enabled = false)
    public void aboutUsTest() throws InterruptedException {
        //homePage= PageFactory.initElements(driver,HomePage.class);
        homePage.clickAboutUS();
        sleepFor(5);
    }

    @Test(enabled = false)
    public void validateInvestingTab() throws InterruptedException {
        homePage.clickInvestingTab();
        sleepFor(5);
    }

    @Test(enabled = false)
    public void validateClickOnCompareWaysToInvest() throws InterruptedException {
        homePage.CompareWaysToInvest();
    }

}
