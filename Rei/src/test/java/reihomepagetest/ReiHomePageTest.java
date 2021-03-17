package reihomepagetest;

import common.WebAPI;
import homepage.ReiHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ReiHomePageTest extends WebAPI {
    // Test class

    //instance of HomepageClass
    ReiHomePage reihomePage;

    @BeforeMethod
    public void getInit() {
        reihomePage = PageFactory.initElements(driver, ReiHomePage.class);

    }
    @Test(enabled = true)
    public void mouseHover() throws InterruptedException {
        reihomePage.searchInput();
    }

}
