package statefarm.Pages;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage  extends WebAPI {
    // Action Method class

    final String about_us = "//a[@id='NAV_ABOUT_US']";


    // Find By Annotation: First Approach
    @FindBy (how = How.XPATH, using = HomePageWebElement.aboutUs_xp) public WebElement aboutUS;

public void clickAboutUS(){
    aboutUS.click();


}


}
