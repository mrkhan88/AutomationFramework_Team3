
package homepagestatefarm;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static homepagestatefarm.StatehomepageWebElements.insuranceTab;
import static homepagestatefarm.StatehomepageWebElements.petInsurance;

public class Statehomepage extends WebAPI {
    public void clickLogin() {
    }

    /*public final String login_xp = "//span[text()='LOG IN']";

    @FindBy (how = How.XPATH, using = login_xp) public WebElement loginButton;*/
    @FindBy (how = How.XPATH, using = insuranceTab) public WebElement InsuranceTab;
    @FindBy (how = How.XPATH, using = petInsurance) public WebElement PetInsurance;


    /*public void clickLogin(){
        loginButton.click();*/

    public void clickInsuranceTab(){
        InsuranceTab.click();
    }

    public void clickPetInsurance(){
        PetInsurance.click();
    }


}




