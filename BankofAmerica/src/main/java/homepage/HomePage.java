package homepage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static homepage.HomePageWebElement.*;

public class HomePage  extends WebAPI {
    // Action Method class
    final String about_us = "//a[@id='NAV_ABOUT_US']";


    // Find By Annotation: First Approach
    @FindBy(how = How.XPATH, using = aboutUs_xp) public WebElement aboutUS;
    @FindBy (how = How.CSS,using =Investing) public WebElement InvestingTab;
    @FindBy(how=How.XPATH,using = CompareWaysToInvest) public WebElement CompareWaysToInvestTab;


    public void clickAboutUS() {
        aboutUS.click();
    }
    public void clickInvestingTab()throws InterruptedException{
        InvestingTab.click();
    }
    public void CompareWaysToInvest() throws InterruptedException {
        InvestingTab.click();
        CompareWaysToInvestTab.click();

        }
        public void clickOnInvesting ()throws InterruptedException {
            InvestingTab.click();
            CompareWaysToInvestTab.click();

            Thread.sleep(7000);



    }
}




