package statefarm.Pages;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Statehomepage extends WebAPI {

public final String login_xp = "//span[text()='LOG IN']";

@FindBy (how = How.XPATH, using = login_xp) public WebElement loginButton;

public void clickLogin(){
    loginButton.click();
}




}
