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
    public void getInit() throws InterruptedException {
        homePage = PageFactory.initElements(driver, HomePage.class);
        sleepFor(5);

    }

    @Test(enabled = false)
    public void aboutUsTest() throws InterruptedException {
        homePage.clickAboutUS2();
        sleepFor(5);
    }

    @Test(enabled = false)
    public void validateCheckingTab() throws InterruptedException {
        homePage.clickCheckingTab();
        sleepFor(5);
    }

    @Test(enabled = false)
    public void validateClickOnlineBankingg() {
        homePage.clickOnlineBanking();
    }

    @Test(enabled = false)
    public void validateClickOnCheckingSoultions() throws InterruptedException {
        homePage.clickOnCheckingSolutions();
    }

    @Test(enabled = false)
    public void validateScrollDowntoMiddle() throws InterruptedException {
        homePage.scrollDownToMiddle();
    }

    @Test(enabled = false)
    public void validateScrollToElement() throws InterruptedException {
        homePage.scrollToElement();
    }

    @Test(enabled = false)
    public void validateMouseHovering() throws InterruptedException {
        homePage.mouseHovering();

    }

    @Test(enabled = false)
    public void validateRightClick() throws InterruptedException {
        homePage.rightClickEnroll();
        sleepFor(5);
    }
    @Test(enabled = true)
    public void createAccount() throws InterruptedException {
        homePage.openBasicAccount();
    }
//    @Test(enabled = true)
//    public void multiWindows() throws InterruptedException {
//       homePage.tabWindows();
//
//    }
}
