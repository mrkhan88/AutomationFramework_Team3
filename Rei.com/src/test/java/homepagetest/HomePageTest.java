package homepagetest;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import homepagestatefarm.HomePage;



public class HomePageTest extends WebAPI {


    //instance of HomepageClass
    HomePage homePage;


    @BeforeMethod
    public void getInit() {
        homePage = PageFactory.initElements(driver, HomePage.class);
}

//check whether the return policy takes you to the return policy page
//    @Test
//    public void checkReturnPolicy() {
//        homePage.returnToHomepage();
//    }

    @Test
    //verify search result with invalid product
    public void verifySearchBoxIncorrectProduct(){
        homePage.typeOnSearchBox();
        homePage.typeOnElement1("searchbox", "idk");
        String expectedText = "Results for “idk” at REI | REI Co-op";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");
    }
    //verify search result with valid product

    @Test
    public void verifySearchBox(){
        homePage.typeOnSearchBox();
        homePage.typeOnElement("searchBox","climbing shoes");
        String expectedText = "Results for “climbing shoes” at REI | REI Co-op";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");
    }

    //verify Headers
    @Test
    public void verifyFurniture(){
        homePage.clickOnFurniture();
        String expectedText = "Furniture You'll Love in 2021 | Wayfair";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");
    }

    @Test
    public void verifyOutdoor(){
        homePage.clickOnOutdoor();
        String expectedText = "Outdoor | Wayfair";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");
    }

    @Test
    public void verifyBeddingAndBath(){
        homePage.clickOnBedding();
        String expectedText = "Bed & Bath | Wayfair";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");
    }

    @Test
    public void verifyRugs(){
        homePage.clickOnRugs();
        String expectedText = "Rugs You'll Love in 2021 | Wayfair";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");
    }

    @Test
    public void verifyDecorAndPillows(){
        homePage.clickOnPillows();
        String expectedText = "Home Decor | Wayfair";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");
    }

    @Test
    public void verifyOrganization(){
        homePage.clickOnOrganization();
        String expectedText = "Storage & Organization Solutions you'll Love in 2021 | Wayfair";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");
    }

    @Test
    public void verifyLighting(){
        homePage.clickOnLighting();
        String expectedText = "Lighting | Wayfair";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");
    }

    @Test
    public void verifyKitchen(){
    homePage.clickOnKitchen();
        String expectedText = "Kitchen & Tabletop | Wayfair";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");
    }

    @Test
    public void verifyBaby(){
    homePage.clickOnBaby();
        String expectedText = "Baby & Kids | Wayfair";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");
    }


    //verify footers
    @Test
    public void checkTheReturnPolicy(){
        homePage.clickTheReturnPolicy();
        String expectedText = "REI – Top-Brand Clothing, Gear, Footwear and Expert Advice for All Your Outdoor Adventures | REI Co-op";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");
    }

    @Test
    public void returnInstructions(){
    homePage.clickTheReturnInstructions();
        String expectedText = "Return Instructions. | REI Co-op";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");
    }

    @Test
    public void YourOnlineAccount(){
        homePage.clickTheYourOnlineInstructions();
        String expectedText = "Sign In | REI Co-op";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");
    }

    @Test
    public void purchaseStatus(){
        homePage.clickThePurchaseStatus();
        String expectedText = "Sign In | REI Co-op";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");
    }

    @Test
    public void shippingInfo(){
        homePage.clickTheShippingInfo();
        String expectedText = "Shipping Timeline | REI Co-op";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");
    }

    @Test
    public void membership(){
        homePage.clickTheMembership();
        String expectedText = "REI Co-op membership benefits | REI Co-op";
        String ActualText = driver.getTitle();
        Assert.assertEquals(ActualText, expectedText, "Page title not match");
    }











}
