package bofa.Pages;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage  extends WebAPI {
    // Action Method class

    final String about_us = "//a[@id='NAV_ABOUT_US']";

    // Find By Annotation: First Approach
    @FindBy (how = How.XPATH, using = HomePageWebElement.aboutUs_xp) public WebElement aboutUS;

    @FindBy(how = How.XPATH, using = HomePageWebElement.career_xp) public WebElement career;

public void clickAboutUS(){
    aboutUS.click();

}

public void clickonCareer(){
    WebDriverWait wait = new WebDriverWait(driver, 10);
//    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".rwd.col-3.flag_ga.alertOverlayOpen")));
    wait.until(ExpectedConditions.elementToBeClickable(career)).click();
//    driver.findElement(By.cssSelector(".rwd.col-3.flag_ga.alertOverlayOpen")).click();
//    career.click();

}



}
