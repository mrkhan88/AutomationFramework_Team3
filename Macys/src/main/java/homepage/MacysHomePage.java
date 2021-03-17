package homepage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static homepage.MacysHomePageWebElement.*;

public class MacysHomePage extends WebAPI {
    // Action Method class

    @FindBy(how = How.XPATH, using = mouseA)
    public WebElement mouseAXP;
    @FindBy(how = How.XPATH, using = mouseB)
    public WebElement mouseBXP;
    @FindBy(how = How.XPATH, using = mouseC)
    public WebElement mouseCXP;

    // Find By Annotation: First Approach
    public void mouseHover() throws InterruptedException {
        Thread.sleep(5000);
        WebElement gifts = (mouseAXP);
        Actions actions = new Actions(driver);
        actions.moveToElement(gifts).build().perform();
        Thread.sleep(5000);
        WebElement gifts1 = (mouseBXP);
        Actions actions1 = new Actions(driver);
        actions.moveToElement(gifts1).build().perform();
        Thread.sleep(5000);
        WebElement gifts2 = (mouseCXP);
        Actions actions2 = new Actions(driver);
        actions.moveToElement(gifts2).build().perform();
        Thread.sleep(5000);

    }

}
