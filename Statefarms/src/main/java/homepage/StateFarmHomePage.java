package homepage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static homepage.StateFarmHomePageWebElement.*;

public class StateFarmHomePage extends WebAPI {
    // Action Method class

    // Find By Annotation: First Approach
    @FindBy (how = How.XPATH, using = aboutUs_xp) public WebElement aboutUS;

public void clickAboutUS(){
    aboutUS.click();
    clickOnElement(aboutUs_xp);
    try {
        sleepFor(3);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}

    public void clickAboutUS2(){   //this is alternative approach, U can choose either one.
        aboutUS.click();
    }





}
