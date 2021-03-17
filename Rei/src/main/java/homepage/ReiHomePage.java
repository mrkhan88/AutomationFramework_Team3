package homepage;

import common.WebAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static homepage.ReiHomePageWebElement.*;

public class ReiHomePage extends WebAPI {
    // Action Method class

    @FindBy(how = How.ID, using = mouseA)
    public WebElement search;
    @FindBy(how = How.XPATH, using = mouseB)
    public WebElement mouseBXP;
    @FindBy(how = How.XPATH, using = mouseC)
    public WebElement mouseCXP;

    // Find By Annotation: First Approach
    public void searchInput() throws InterruptedException {
     search.sendKeys("shoe", Keys.ENTER);
     Thread.sleep(5000);

    }

}
