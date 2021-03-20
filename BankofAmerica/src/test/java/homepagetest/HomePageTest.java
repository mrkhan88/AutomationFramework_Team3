package homepagetest;

import common.WebAPI;
import statefarm.Pages.HomePage;
import org.openqa.selenium.support.PageFactory;
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
