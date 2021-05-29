package homePageTest;

import common.WebAPI;
import homePages.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePageTest extends WebAPI {

    HomePage homePage;
    public void getInit() {
        homePage = PageFactory.initElements(driver, HomePage.class);
    }

        @Test(enabled = false)
        public void testFlight(){
        homePage.clickFlight();
        sleepFor(3);

        }
    }


