package homepagetest;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import statefarm.Pages.HomePage;



public class HomePageTest extends WebAPI {


    //instance of HomepageClass
    HomePage homePage;


    @BeforeMethod
    public void getInit() {
        homePage = PageFactory.initElements(driver, HomePage.class);
}

//check whether the return policy takes you to the return policy page
    @Test
    public void checkReturnPolicy() {
        homePage.returnToHomepage();
    }
}
