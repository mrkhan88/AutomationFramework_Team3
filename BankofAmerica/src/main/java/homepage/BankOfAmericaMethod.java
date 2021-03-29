package homepage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class BankOfAmericaMethod extends WebAPI {

    public static final String checking = "//a[@id='navChecking']//span[@class='title'][normalize-space()='Checking']";
    public static final String exploreCheckingSolutions = "//a[normalize-space()='Explore checking solutions']";
    public static final String onlineBanking = "//a[@id='navCheckingOnlineBanking']";
    public static final String signatureServices = "//section[@id='navCheckingContent']//a[@id='lifeServicesLink']";
    public static final String advantageBanking = "//a[normalize-space()='Bank of America Advantage Banking']";
    public static final String studentBanking = "//a[@id='studentBanking']";
    public static final String businessChecking = "//a[normalize-space()='Business Checking']";
    public static final String mobileBanking = "//a[@id='navCheckingMobileBanking']";
    public static final String myRewards = "//a[@id='navCheckingPreferredRewards']";
    public static final String getStarted = "//a[@id='DCTAL13O']";
    public static final String scheduleAnAppointment = "//a[@id='scheduleApptChecking']";
    public static final String savings = "//a[@id='navSavings']//span[@class='title'][normalize-space()='Savings']";
    public static final String advantageSavings = "//a[normalize-space()='Bank of America Advantage Savings']";
    public static final String childSavings = "//a[normalize-space()='Child Savings']";
    public static final String cDs = "//a[normalize-space()='CDs']";
    public static final String iRAs = "//a[normalize-space()='IRAs']";
    public static final String creditCards = "//a[@id='navCreditCards']//span[@class='title'][normalize-space()='Credit Cards']";
    public static final String shopAllCreditCards = "//a[normalize-space()='Shop all credit cards']";
    public static final String manageYourCreditCardAccount = "//a[normalize-space()='Manage your credit card account']";
    public static final String cashRewards = "//a[normalize-space()='Cash Rewards Credit Cards']";
    public static final String travelAndAirlinesRewards = "//a[normalize-space()='Travel and Airlines Rewards Cards']";
    public static final String lowerInterestRate = "//a[normalize-space()='Lower Interest Rate Cards']";
    public static final String pointsRewards = "//a[normalize-space()='Points Rewards Cards']";
    public static final String cardsToBuiltOrRebuildCredit = "//a[normalize-space()='Cards to Build or Rebuild Credit']";
    public static final String cashForStudents = "//a[normalize-space()='Cards for Students']";



    @FindBy(how = How.XPATH, using = checking) public WebElement checking1;
    @FindBy(how = How.XPATH, using = exploreCheckingSolutions) public WebElement exploreCheckingSolutions1;
    @FindBy(how = How.XPATH, using = onlineBanking) public WebElement onlineBanking1;
    @FindBy(how = How.XPATH, using = signatureServices) public WebElement signatureServices1;
    @FindBy(how = How.XPATH, using = advantageBanking) public WebElement advantageBanking1;
    @FindBy(how = How.XPATH, using = studentBanking) public WebElement studentBanking1;
    @FindBy(how = How.XPATH, using = businessChecking) public WebElement businessChecking1;
    @FindBy(how = How.XPATH, using = mobileBanking) public WebElement mobileBanking1;
    @FindBy(how = How.XPATH, using = myRewards) public WebElement myRewards1;
    @FindBy(how = How.XPATH, using = getStarted) public WebElement getStarted1;
    @FindBy(how = How.XPATH, using = scheduleAnAppointment) public WebElement scheduleAnAppointment1;
    @FindBy(how = How.XPATH, using = savings) public WebElement savings1;
    @FindBy(how = How.XPATH, using = advantageSavings) public WebElement advantageSavings1;
    @FindBy(how = How.XPATH, using = childSavings) public WebElement childSavings1;
    @FindBy(how = How.XPATH, using = cDs) public WebElement cDs1;
    @FindBy(how = How.XPATH, using = iRAs) public WebElement iRAs1;
    @FindBy(how = How.XPATH, using = creditCards) public WebElement creditCards1;
    @FindBy(how = How.XPATH, using = shopAllCreditCards) public WebElement shopAllCreditCards1;
    @FindBy(how = How.XPATH, using = manageYourCreditCardAccount) public WebElement manageYourCreditCardAccount1;
    @FindBy(how = How.XPATH, using = cashRewards) public WebElement cashRewards1;
    @FindBy(how = How.XPATH, using = travelAndAirlinesRewards) public WebElement travelAndAirlinesRewards1;
    @FindBy(how = How.XPATH, using = lowerInterestRate) public WebElement lowerInterestRate1;
    @FindBy(how = How.XPATH, using = pointsRewards) public WebElement pointsRewards1;
    @FindBy(how = How.XPATH, using = cardsToBuiltOrRebuildCredit) public WebElement cardsToBuildOrRebuildCredit1;
    @FindBy(how = How.XPATH, using = cashForStudents) public WebElement cashForStudents1;



    public void checkChecking() {
        checking1.click();
    }

    public void checkExploreCheckingSolutions() {
        checking1.click();
        exploreCheckingSolutions1.click();
    }

    public void checkOnlineBanking() {
        checking1.click();
        onlineBanking1.click();
    }

    public void checkSignatureServices() {
        checking1.click();
        signatureServices1.click();
    }

    public void checkAdvantageBanking() {
        checking1.click();
        advantageBanking1.click();
    }

    public void checkStudentBanking() {
        checking1.click();
        studentBanking1.click();
    }

    public void checkBusinessChecking() {
        checking1.click();
        businessChecking1.click();
    }

    public void checkMobileBanking() {
        checking1.click();
        mobileBanking1.click();
    }

    public void checkMyRewards() {
        checking1.click();
        myRewards1.click();
    }

    public void checkGetStarted() {
        checking1.click();
        getStarted1.click();
    }

    public void checkScheduleAnAppointment() {
        checking1.click();
        scheduleAnAppointment1.click();
    }

    public void checkSavings() {
        savings1.click();
    }

    public void checkAdvantageSavings() {
        savings1.click();
        advantageSavings1.click();
    }

    public void checkChildSavings() {
        savings1.click();
        childSavings1.click();
    }

    public void checkCDs() {
        savings1.click();
        cDs1.click();
    }

    public void checkIRAs() {
        savings1.click();
        iRAs1.click();
    }

    public void checkCreditCards() {
        creditCards1.click();
    }

    public void checkShopAllCreditCards() {
        creditCards1.click();
        shopAllCreditCards1.click();
    }

    public void checkManageYourCreditCardAccount() {
        creditCards1.click();
        manageYourCreditCardAccount1.click();
    }

    public void checkCashRewards() {
        creditCards1.click();
        cashRewards1.click();
    }

    public void checkTravelAndAirlinesRewards() {
        creditCards1.click();
        travelAndAirlinesRewards1.click();
    }

    public void checkLowerInterestRate() {
        creditCards1.click();
        lowerInterestRate1.click();
    }

    public void checkPointsRewards() {
        creditCards1.click();
        pointsRewards1.click();
    }

    public void checkCardsToBuildOrRebuildCredit() {
        creditCards1.click();
        cardsToBuildOrRebuildCredit1.click();
    }

    public void checkCashForStudents() {
        creditCards1.click();
        cashForStudents1.click();
    }

}