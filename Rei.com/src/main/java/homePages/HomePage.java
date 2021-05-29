package homePages;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static homePages.homePageWebElement.*;

public class HomePage extends WebAPI {


    @FindBy(how = How.LINK_TEXT, using =reiOutletLocator) public WebElement reiOutletButton;
    @FindBy(how = How.CSS, using =signInLocator) public WebElement signInBttn;
    @FindBy(how = How.ID,using =emailFieldLocator)public WebElement emailF;
    @FindBy(how =How.CSS,using= showLocator)public WebElement showBttn;
    @FindBy(how=How.CSS,using= signInBttnLocator)public WebElement signInButton;



    public void clickReiOutletLocator() {
        reiOutletButton.click();
    }
    public void signIn(){
        clickByCss(signInLocator);
        typeById(emailFieldLocator,passWord);
        sleepFor(2);
        clickByCss(showLocator);
        sleepFor(2);
        clickByCss(signInBttnLocator);
        sleepFor(2);




            }


}
