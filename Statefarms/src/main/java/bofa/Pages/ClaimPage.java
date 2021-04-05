package bofa.Pages;

import com.microsoft.schemas.office.office.STInsetMode;
import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ClaimPage extends WebAPI {

    public static final String claim_xp = "//span[text()='CLAIMS']";

    @FindBy(how = How.XPATH, using = claim_xp) public WebElement claim;

    public void clickClaim(){
        claim.click();
    }

    public static final String fileAclaim_xp = "//*[text()='File a Claim']";

    @FindBy(how = How.XPATH, using = fileAclaim_xp) public WebElement fileAClaim;

    public void clickFileAclaim(){
        fileAClaim.click();

    }

    public static final String autoGlass_xp ="//label[normalize-space()='Auto (Glass Only)']";

    @FindBy(how = How.XPATH, using = autoGlass_xp) public WebElement autoGlass;

    public void clickAutoGlass(){
        autoGlass.click();
        sleepFor(3);

    }
    public static final String start_xp = "//a[@class='panelButton -oneX-btn-primary__anchor'][normalize-space()='Start']";
    @FindBy(how = How.XPATH, using = start_xp) public WebElement startButton;

    public void clickStartbutton(){
        //driver.switchTo().frame(0);
        //startButton.click();

    }


}
