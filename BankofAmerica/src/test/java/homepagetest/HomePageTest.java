package homepagetest;

import common.WebAPI;
import homepage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends WebAPI {
    // Test class

    //instance of HomepageClass
    HomePage homePage;


    @BeforeMethod
    public void getInit(){
        homePage= PageFactory.initElements(driver,HomePage.class);

    }

    @Test
    public void aboutUsTest(){
        //homePage= PageFactory.initElements(driver,HomePage.class);
        homePage.clickAboutUS();
    }

}
