package statefarm.Testcases;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import statefarm.Pages.ClaimPage;

public class FileClaimTest extends WebAPI {
    ClaimPage claimpage;

    @BeforeMethod
    public void getInit(){
        claimpage=PageFactory.initElements(driver, ClaimPage.class);
    }

    @Test
    public void testCases_Claim(){
        claimpage.clickClaim();
        claimpage.clickFileAclaim();
        claimpage.clickAutoGlass();

    }



}
