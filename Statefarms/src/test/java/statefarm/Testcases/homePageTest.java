package statefarm.Testcases;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import java.io.IOException;

public class homePageTest extends WebAPI{
    homePageTest HomePage;

    @BeforeMethod
    public void getInit() {
        HomePage = PageFactory.initElements(driver, homePageTest.class);
    }
    @Test(enabled = true)
    public void testGetquote(){
    HomePage.getAquote();
//        String expectedText="Tell us a little about yourself";
//        String actualText = driver.findElement(By.cssSelector(".-oneX-justify-content-right")).getText();
//        Assert.assertEquals(actualText, expectedText, "the text Matching ");


    }
    @Test(enabled = false)
    public void testSearchButton(){
        HomePage.searchButton();
        String expectedText= "A Tips List Small Business Owners Should Check Twice";
        String actualText = driver.findElement(By.xpath("//a[.='A Tips List Small Business Owners Should Check Twice']")).getText();
        Assert.assertEquals(actualText, expectedText, "the text Matching ");
    }
    @Test(enabled = false)
    public void testInsuranceTab(){
        HomePage.insuranceTab();
        String expectedText= "Get your quote in a few minutes";
        String actualText = driver.findElement(By.xpath("//h1[@class='sfx-text ']")).getText();
        Assert.assertEquals(actualText, expectedText, "the text Matching ");
    }
   @Test(enabled = false)
   public void testStateFarmsLogo() throws IOException {
        HomePage.stateFarmsLogo();
       String expectedTitle = "Find State Farm® Agents Near You - State Farm®";
       String actualTitle = driver.getTitle();
       Assert.assertEquals(actualTitle, expectedTitle, "the text Matching ");

   }
    @Test(enabled = false)
        public void testLogin() throws IOException {
        HomePage.loginBttn();
        String expectedText = "Looks like your information did not match our records or your account may have been disabled after too many login attempts. Log in again or click 'Trouble logging in?'";
        String actualText = driver.findElement(By.cssSelector(".-oneX-notification__text")).getText();
        Assert.assertEquals(actualText, expectedText, "the text Matching ");
    }
    @Test(enabled = false)
    public void testClaimTab() {
        HomePage.clickClaimTab();
        String expectedText = "Try to have this information handy when you file your claim";
        String actualText = driver.findElement(By.xpath("//div[@id='glass']//h4[@class='-w_pl-sm-0 -w_mb-0 -w_pb-5 -w_pr-lg-40 -w_pr-xl-30 -w_ml-20 -w_mr-lg-20 -oneX-body--primary']")).getText();
        Assert.assertEquals(actualText, expectedText, "the text Matching ");
    }






    }



