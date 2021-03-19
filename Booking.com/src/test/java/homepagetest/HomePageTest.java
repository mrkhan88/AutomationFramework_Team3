package homepagetest;

import common.WebAPI;
import homepage.BookingHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends WebAPI  {
    // Test class

    //instance of HomepageClass
    BookingHomePage bookingHomePage;

    @BeforeMethod
    public void getInit() throws InterruptedException {
        bookingHomePage = PageFactory.initElements(driver, BookingHomePage.class);
        sleepFor(5);

    }
    @Test(enabled = false)
    public void flightTab() throws InterruptedException {
        bookingHomePage.flightTab();
        sleepFor(5);

    }
    @Test(enabled = false)
        public void searchLondon() throws InterruptedException {
            bookingHomePage.search();
        }
    @Test(enabled = false)
    public void searchDropDown() throws InterruptedException {
        bookingHomePage.search2();
    }
    @Test(enabled = true)
    public void clickAndDrag() throws InterruptedException {
        bookingHomePage.clickAndDrag();
}

}
