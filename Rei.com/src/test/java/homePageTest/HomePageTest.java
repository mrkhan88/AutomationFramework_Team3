package homePageTest;

import common.WebAPI;
import homePages.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends WebAPI {

    HomePage homePage;
    @BeforeMethod
    public void getInit() {
        homePage = PageFactory.initElements(driver,HomePage.class);
    }
    @Test
    public void testReiOutlet(){
        homePage.clickReiOutletLocator();
        sleepFor(2);
    }
//@Test(enabled = false)
//    public void testSignInBttn(){
//        homePage.signIn();


//}


}
