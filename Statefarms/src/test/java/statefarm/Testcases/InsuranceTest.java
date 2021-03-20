package statefarm.Testcases;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import statefarm.Pages.ClaimPage;
import statefarm.Pages.InsurancePage;

public class InsuranceTest extends WebAPI {
    InsurancePage insurancepage;

    @BeforeMethod
    public void getInit(){
        insurancepage= PageFactory.initElements(driver, InsurancePage.class);
    }
    @Test
    public void insTest(){
        insurancepage.clickInsurance();
        insurancepage.clickHome();
        insurancepage.enterZipCode();
        insurancepage.clickStartQuote();
        insurancepage.clickCalender();
        insurancepage.pickAdate();
    }




}
