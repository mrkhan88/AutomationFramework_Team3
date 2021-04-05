package homepagetest;

import bofa.Pages.BetterMoneyHabitPage;
import bofa.Pages.RetirementPage;
import bofa.Pages.SignInPage;
import common.WebAPI;
import bofa.Pages.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends WebAPI {
    // Test class

    //instance of HomepageClass
    HomePage homePage;
    SignInPage signinpage;
    BetterMoneyHabitPage bettermone;
    RetirementPage retirementPage;


    @BeforeMethod
    public void getInit(){
        homePage= PageFactory.initElements(driver,HomePage.class);
        signinpage= PageFactory.initElements(driver,SignInPage.class);
        bettermone = PageFactory.initElements(driver, BetterMoneyHabitPage.class);
        retirementPage= PageFactory.initElements(driver, RetirementPage.class);
    }

    //@Test(priority = 1)
    public void aboutUsTest(){
        //homePage= PageFactory.initElements(driver,HomePage.class);
        homePage.clickAboutUS();
        homePage.clickonCareer();
        sleepFor(5);
    }

    @Test(priority = 2)
    public void signinTest() throws Exception {
//        signinpage= PageFactory.initElements(driver,SignInPage.class);
        signinpage.typeinSigninField();
        sleepFor(2);
        signinpage.typeinPasswordField();
        sleepFor(2);
        signinpage.clickonsigninButton();
        sleepFor(3);
    }
    //@Test(priority = 3)
    public void betterMoneyHabitTest(){
        bettermone.clickOnMoneyhabit();
        bettermone.clickOnRetirement();
        retirementPage.clickOnYour401k();
        retirementPage.verifyRetirementpage();
        sleepFor(5);
    }

    //@Test(priority = 4)
    public void effectOfTimeofRetirementTest(){
        bettermone.clickOnMoneyhabit();
        bettermone.clickOnRetirement();
        retirementPage.clickOnEffectOfTime();
        retirementPage.clickScheduleAppointment();
        retirementPage.verifyTextforAppointment();

        sleepFor(5);
    }

    //@Test(priority = 5)
    public void buildingFoundationTest(){
        bettermone.clickOnMoneyhabit();
        bettermone.clickOnRetirement();
        retirementPage.clickBuildingFoundation();
        retirementPage.verifybuildingFoundationText();
        sleepFor(5);
    }

    //@Test(priority = 6)
    public void collegeTest(){
        bettermone.clickOnMoneyhabit();
        bettermone.clickOnRetirement();
        retirementPage.clickTerms();
        sleepFor(5);
    }



}
