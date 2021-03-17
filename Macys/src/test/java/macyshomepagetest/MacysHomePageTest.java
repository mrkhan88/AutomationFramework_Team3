package macyshomepagetest;

import common.WebAPI;
import homepage.MacysHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MacysHomePageTest extends WebAPI {
    // Test class

    //instance of HomepageClass
    MacysHomePage homePage;

    @BeforeMethod
    public void getInit() {
        homePage = PageFactory.initElements(driver, MacysHomePage.class);

    }
    @Test(enabled = true)
    public void mouseHover() throws InterruptedException {
        homePage.mouseHover();
    }

}
