package homepageTest;

import common.WebAPI;
import homepage.Statehomepage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;


public class StatehomepageTest extends WebAPI {
    Statehomepage homepage;



    @Test
    public void loginTest() throws InterruptedException {

        homepage  = PageFactory.initElements(driver, Statehomepage.class);

        homepage.clickLogin();
        Thread.sleep(5000);
    }

    @Test
    public void verifyInsuranceTab(){

        //verify insurance tab is clickable
        homepage  = PageFactory.initElements(driver, Statehomepage.class);
        homepage.clickInsuranceTab();
        homepage.clickPetInsurance();
        String expectedText = "Pet Insurance - Get a Cat or Dog Insurance Quote - State Farm®";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");
    }

    @Test
    public void ZipCode(){

        homepage  = PageFactory.initElements(driver, Statehomepage.class);
        homepage.clickOnElement("//input[@id='quote-main-zip-code-input']");
        homepage.typeOnElement("typeOnElement", "11435");
        homepage.clickOnElement("//button[@id='quote-main-zip-code-button-1']");
    }

    @Test
    public void drivingWthPets(){

        homepage  = PageFactory.initElements(driver, Statehomepage.class);
        homepage.clickOnElement("//a[contains(text(),'Driving safely with pets')]");
        String expectedText = "Drive Safely with Pets in Cars - State Farm®";
        String ActualText = driver.getTitle();
       Assert.assertEquals(ActualText, expectedText, "Page title not match");
    }

    @Test
    public void consideringMedicalInsuranceforPets(){

        homepage  = PageFactory.initElements(driver, Statehomepage.class);
        homepage.clickOnElement("//body/div[@id='content']/section[8]/div[1]/div[2]/div[1]/p[1]/a[1]");
        String expectedText = "Why Should You Consider Pet Medical Insurance - State Farm®";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");

    }

    @Test
    public void petProofingHome(){

        homepage  = PageFactory.initElements(driver, Statehomepage.class);
        homepage.clickOnElement("//a[contains(text(),'Pet proof your home in a snap')]");
        String expectedText = "Pet Proof Your Home in a Snap - State Farm®";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");
    }

    @Test
    public void petFriendlyFixes(){

        homepage  = PageFactory.initElements(driver, Statehomepage.class);
        homepage.clickOnElement("//a[contains(text(),'Pet-friendly fixes for inside and out')]");
        String expectedText = "Pet Safety at Home and in the Car - State Farm®";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");
    }

    @Test
    public void verifyMotorCycleInsurance(){

        homepage  = PageFactory.initElements(driver, Statehomepage.class);
        homepage.clickInsuranceTab();
        homepage.clickOnElement("//a[contains(text(),'Motorcycle')]");
        String expectedText = "Motorcycle Insurance - Call for a quote - State Farm®";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");
    }

    @Test
    public void makeApaymentOption(){

        homepage  = PageFactory.initElements(driver, Statehomepage.class);
        homepage.clickInsuranceTab();
        homepage.clickOnElement("//a[contains(text(),'Motorcycle')]");
        homepage.clickOnElement("//a[contains(text(),'Want to make a payment?')]");
        String expectedText = "Provide Bill Information";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");
    }

    @Test
    public void ridingDoubleSafety(){

        homepage  = PageFactory.initElements(driver, Statehomepage.class);
        homepage.clickInsuranceTab();
        homepage.clickOnElement("//a[contains(text(),'Motorcycle')]");
        homepage.clickOnElement("//a[contains(text(),'Riding double safely')]");
        String expectedText = "Motorcycle Safety Tips: Riding Double - State Farm®";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");
    }

    @Test
    public void verifyAntiLock(){

        homepage  = PageFactory.initElements(driver, Statehomepage.class);
        homepage.clickInsuranceTab();
        homepage.clickOnElement("//a[contains(text(),'Motorcycle')]");
        homepage.clickOnElement("//a[contains(text(),'Riding double safely')]");
        String expectedText = "What to Know About ABS on Motorcycles - State Farm®";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");
    }

    @Test
    public void verifyRatingsFinancialStrength(){

        homepage  = PageFactory.initElements(driver, Statehomepage.class);
        homepage.clickInsuranceTab();
        homepage.clickOnElement("//a[contains(text(),'Motorcycle')]");
        homepage.clickOnElement("//a[contains(text(),'State Farm financial strength ratings')]");
        String expectedText = "Financial Strength and Insurance Ratings - State Farm®";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");
    }

    @Test
    public void verifyInfluencingFactors(){

        homepage  = PageFactory.initElements(driver, Statehomepage.class);
        homepage.clickInsuranceTab();
        homepage.clickOnElement("//a[contains(text(),'Motorcycle')]");
        homepage.clickOnElement("//a[contains(text(),'Factors influencing car insurance rates')]");
        String expectedText = "Car Insurance Prices - State Farm®";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");
    }

    @Test
    public void returnToHomeScreen(){

        homepage  = PageFactory.initElements(driver, Statehomepage.class);
        homepage.clickInsuranceTab();
        homepage.clickOnElement("//a[contains(text(),'Motorcycle')]");
        homepage.clickOnElement("//img[@id='oneX-sf-logo']");
        String expectedText = "Auto, Life Insurance, Banking, & More. Get a Free Quote - State Farm®";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");
    }

    @Test
    public void verifyBoatInsurance(){
        homepage  = PageFactory.initElements(driver, Statehomepage.class);
        homepage.clickInsuranceTab();
        homepage.clickOnElement("//a[contains(text(),'Boat')]");
        String expectedText = "Boat Insurance - State Farm®";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");
    }

    @Test
    public void verifyBoatTrailerSafety(){
        homepage  = PageFactory.initElements(driver, Statehomepage.class);
        homepage.clickInsuranceTab();
        homepage.clickOnElement("//a[contains(text(),'Boat')]");
        homepage.clickOnElement("//a[contains(text(),'Boat trailer safety')]");
        String expectedText = "Boat Trailer Safety - State Farm®";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");
    }

    @Test
    public void verifyWaterSafety(){
        homepage  = PageFactory.initElements(driver, Statehomepage.class);
        homepage.clickInsuranceTab();
        homepage.clickOnElement("//a[contains(text(),'Boat')]");
        homepage.clickOnElement("//a[contains(text(),'Staying safe on the water')]");
        String expectedText = "Boat Safety - State Farm®";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");
    }

    @Test
    public void makeApayment(){

        homepage  = PageFactory.initElements(driver, Statehomepage.class);
        homepage.clickInsuranceTab();
        homepage.clickOnElement("//a[contains(text(),'Boat')]");
        homepage.clickOnElement("//a[contains(text(),'Want to make a payment?')]");
    }


    @Test
    public void triangleOfProtection(){
        homepage  = PageFactory.initElements(driver, Statehomepage.class);
        homepage.clickInsuranceTab();
        homepage.clickOnElement("//a[contains(text(),'Boat')]");
        homepage.clickOnElement("//a[contains(text(),'Explore the Triangle of Protection')]");
        String expectedText = "Triangle of Protection - State Farm®";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");
    }













}