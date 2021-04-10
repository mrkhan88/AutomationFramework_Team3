package homepagestatefarm;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;



import static homepagestatefarm.HomePageWebElement.ReturnPolicyButton;

public class HomePage extends WebAPI {

    // Action Method class



    // Find By Annotation: First Approach


    @FindBy(how = How.XPATH, using = ReturnPolicyButton) public WebElement returnPolicy;


    public void clickReturnPolicy(){returnPolicy.click();}

}
