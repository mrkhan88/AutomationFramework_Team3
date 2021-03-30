package statefarm.Pages;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static statefarm.Pages.HomePageWebElement.*;

public class HomePage  extends WebAPI {


    // Action Method class

    final String about_us = "//a[@id='NAV_ABOUT_US']";


    // Find By Annotation: First Approach
    @FindBy (how = How.XPATH, using = HomePageWebElement.aboutUs_xp) public WebElement aboutUS;

    @FindBy(how = How.CSS,using =searchBoxBankOfAmerica) public WebElement bankSearchBox;

    @FindBy(how = How.CSS,using = careersButton) public WebElement CareerButton;

    @FindBy(how = How.CSS,using = popUp) public WebElement PopUp;

    @FindBy(how = How.XPATH, using = closeCookies) public WebElement closeCookies1;

    @FindBy(how =How.CSS, using = searchJobsButton) public WebElement SearchJobsButton;

    @FindBy(how =How.CSS, using = careerLocationBox) public WebElement CareerLocationBox;

    @FindBy(how =How.XPATH, using = homePageLogo) public WebElement HomePageLogo;


    public void clickAboutUS(){
     aboutUS.click();
   }


    public void clickCareer(){
        CareerButton.click();
    }


    public void closePopUp(){
        PopUp.click();
    }


    public void CloseCookies(){
        closeCookies1.click();
    }


    public void clickSearchJobs(){
        SearchJobsButton.click();
    }

    public void clickCareerLocationBox(){
        CareerLocationBox.click();

    }

    public void returnToHomepage(){
        HomePageLogo.click();
    }


}



