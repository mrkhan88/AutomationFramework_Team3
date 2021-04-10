package homepagetest;

import bofa.Pages.*;
import common.WebAPI;
import dataprovider.ReadMysqldata;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.TestDataProvider;

public class HomePageTest extends WebAPI {
    // Test class

    //instance of HomepageClass
    HomePage homePage;
    SignInPage signinpage;
    BetterMoneyHabitPage bettermone;
    RetirementPage retirementPage;
    Signinpage2 login;


    @BeforeMethod
    public void getInit(){
        homePage= PageFactory.initElements(driver,HomePage.class);
        signinpage= PageFactory.initElements(driver,SignInPage.class);
        bettermone = PageFactory.initElements(driver, BetterMoneyHabitPage.class);
        retirementPage= PageFactory.initElements(driver, RetirementPage.class);
        login = PageFactory.initElements(driver, Signinpage2.class);

    }

    @Test(priority = 1)
    public void aboutUsTest(){
        //homePage= PageFactory.initElements(driver,HomePage.class);
        homePage.clickAboutUS();
        homePage.clickonCareer();
        sleepFor(5);
    }

    @Test(dataProvider = "mysqldata2", dataProviderClass = ReadMysqldata.class, priority = 2)
    public void signinTest(String uname, String pwd){
//        signinpage= PageFactory.initElements(driver,SignInPage.class);
        signinpage.typeinSigninField(uname);
        sleepFor(2);
        signinpage.typeinPasswordField(pwd);
        sleepFor(2);
        signinpage.clickonsigninButton();
        sleepFor(3);
    }
    @Test(priority = 3)
    public void betterMoneyHabitTest(){
        bettermone.clickOnMoneyhabit();
        bettermone.clickOnRetirement();
        retirementPage.clickOnYour401k();
        retirementPage.verifyRetirementpage();
        sleepFor(5);
    }

    @Test(priority = 4)
    public void effectOfTimeofRetirementTest(){
        bettermone.clickOnMoneyhabit();
        bettermone.clickOnRetirement();
        retirementPage.clickOnEffectOfTime();
        retirementPage.clickScheduleAppointment();
        retirementPage.verifyTextforAppointment();

        sleepFor(5);
    }

    @Test(priority = 5)
    public void buildingFoundationTest(){
        bettermone.clickOnMoneyhabit();
        bettermone.clickOnRetirement();
        retirementPage.clickBuildingFoundation();
        retirementPage.verifybuildingFoundationText();
        sleepFor(5);
    }

    @Test(priority = 6)
    public void collegeTest(){
        bettermone.clickOnMoneyhabit();
        bettermone.clickOnRetirement();
        retirementPage.clickTerms();
        sleepFor(5);
    }
    @Test(dataProvider = "mysqldata", dataProviderClass = ReadMysqldata.class, priority = 7)
    public void login2(String uname, String pwd){
        login.typeinSigninField(uname);
        sleepFor(2);
        login.typeinPasswordField(pwd);
        sleepFor(2);
        login.clickonsigninButton();
        sleepFor(5);

    }

    @Test(dataProvider = "getexcelData", dataProviderClass = TestDataProvider.class, priority = 8)
    public void login3(String uname, String pwd){
        login.typeinSigninField(uname);
        sleepFor(2);
        login.typeinPasswordField(pwd);
        sleepFor(2);
        login.clickonsigninButton();
        sleepFor(5);

    }



}
