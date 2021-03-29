package homepagetest;

import common.WebAPI;
import homepage.BankOfAmericaMethod;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BankOfAmericaTest extends WebAPI {

    BankOfAmericaMethod bankOfAmerica;


    @BeforeMethod
    public void getInit(){
        bankOfAmerica= PageFactory.initElements(driver,BankOfAmericaMethod.class);

    }

    @Test(priority = 1)
    public void testCheckChecking(){

        bankOfAmerica.checkChecking();
    }

    @Test(priority = 2)
    public void testCheckExploreCheckingSolutions(){
        bankOfAmerica.checkExploreCheckingSolutions();
    }

    @Test(priority = 3)
    public void testCheckOnlineBanking(){
        bankOfAmerica.checkOnlineBanking();
    }

    @Test(priority = 4)
    public void testCheckSignatureServices(){
        bankOfAmerica.checkSignatureServices();
    }

    @Test(priority = 5)
    public void testCheckAdvantageBanking(){
        bankOfAmerica.checkAdvantageBanking();
    }

    @Test(priority = 6)
    public void testCheckStudentBanking(){
        bankOfAmerica.checkStudentBanking();
    }

    @Test(priority = 7)
    public void testCheckBusinessChecking(){
        bankOfAmerica.checkBusinessChecking();
    }

    @Test(priority = 8)
    public void testCheckMobileBanking(){
        bankOfAmerica.checkMobileBanking();
    }

    @Test(priority = 9)
    public void testCheckMyRewards(){
        bankOfAmerica.checkMyRewards();
    }

    @Test(priority = 10)
    public void testCheckGetStarted(){
        bankOfAmerica.checkGetStarted();
    }

    @Test(priority = 11)
    public void testCheckScheduleAnAppointment(){
        bankOfAmerica.checkScheduleAnAppointment();
    }

    @Test(priority = 12)
    public void testCheckSavings(){
        bankOfAmerica.checkSavings();
    }

    @Test(priority = 13)
    public void testCheckAdvantageSavings(){
        bankOfAmerica.checkAdvantageSavings();
    }

    @Test(priority = 14)
    public void testCheckChildSavings(){
        bankOfAmerica.checkChildSavings();
    }

    @Test(priority = 15)
    public void testCheckCDs(){
        bankOfAmerica.checkCDs();
    }

    @Test(priority = 16)
    public void testCheckIRAs(){
        bankOfAmerica.checkIRAs();
    }

    @Test(priority = 17)
    public void testCheckCreditCards(){
        bankOfAmerica.checkCreditCards();
    }

    @Test(priority = 18)
    public void testCheckShopAllCreditCards(){
        bankOfAmerica.checkShopAllCreditCards();
    }

    @Test(priority = 19)
    public void testCheckManageYourCreditAccountAccount(){
        bankOfAmerica.checkManageYourCreditCardAccount();
    }

    @Test(priority = 20)
    public void testCheckCashRewards(){
        bankOfAmerica.checkCashRewards();
    }

    @Test(priority = 21)
    public void testCheckTravelAndAirlinesRewards(){
        bankOfAmerica.checkTravelAndAirlinesRewards();
    }

    @Test(priority = 22)
    public void testCheckLowerInterestRate(){
        bankOfAmerica.checkLowerInterestRate();
    }

    @Test(priority = 23)
    public void testCheckPointsRewards(){
        bankOfAmerica.checkPointsRewards();
    }

    @Test(priority = 24)
    public void testCheckCardsToBuildRebuildCredit(){
        bankOfAmerica.checkCardsToBuildOrRebuildCredit();
    }

    @Test(priority = 25)
    public void testCheckCashForStudents(){
        bankOfAmerica.checkCashForStudents();
    }
























}
