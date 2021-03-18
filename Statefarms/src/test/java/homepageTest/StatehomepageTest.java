package homepageTest;

import common.WebAPI;
import homepage.Statehomepage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class StatehomepageTest extends WebAPI {
    Statehomepage sthp;

    @Test
    public void loginTest() throws InterruptedException {

        sthp  = PageFactory.initElements(driver, Statehomepage.class);

        sthp.clickLogin();
        Thread.sleep(5000);

    }





}
