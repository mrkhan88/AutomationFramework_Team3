package bofa.Pages;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.Iterator;
import java.util.Set;

public class RetirementPage extends WebAPI {

    @FindBy(how = How.XPATH, using = "//span[@class='nav-topic__link'][normalize-space()='Retirement']") public WebElement retirementMenue;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Your 401(k): 10 things to find out')]") public WebElement your401k;
    @FindBy(xpath = "//span[contains(text(), 'The effect of time on your')]") public WebElement effectofTime;
    @FindBy(xpath = "//*[contains(text(), 'an appointment')]") public WebElement scheduleAppointment;
    @FindBy(xpath = "//h1[normalize-space()='Schedule An Appointment']") public WebElement appointmentText;
    @FindBy(xpath = "//span[contains(text(),'Building a foundation')]") public WebElement buildingFoundation;
    @FindBy(xpath = "//h1[contains(normalize-space(),'Building a foundation')]") public WebElement buildinFoundationText;


    Actions actions = new Actions(driver);
    WebDriverWait wait = new WebDriverWait(driver, 10);

//    public static void handleMouseHover(WebElement webElement1, WebElement webElement2, int timeunint){
//        Actions actions = new Actions(driver);
//        actions.moveToElement(webElement1).perform();
//        WebDriverWait wait = new WebDriverWait(driver, timeunint);
//        wait.until(ExpectedConditions.visibilityOf(webElement2));
//        actions.moveToElement(webElement2).click().perform();
//    }


    public void clickOnYour401k(){
        //Actions actions = new Actions(driver);
        actions.moveToElement(retirementMenue).perform();

        //WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(your401k));
        actions.moveToElement(your401k).click().perform();

    }
    public void verifyRetirementpage(){
        Assert.assertTrue(getCurrentPageUrl().contains("401k-benefits-and-information"), "Url not matching.");
    }
    public void clickOnEffectOfTime(){

        actions.moveToElement(retirementMenue).perform();
        wait.until(ExpectedConditions.visibilityOf(effectofTime));
        actions.moveToElement(effectofTime).click().perform();

    }

    public void clickScheduleAppointment(){
        scheduleAppointment.click();
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it = windows.iterator();

        System.out.println("Windowd id: "+driver.getWindowHandle());

        String parewindow = it.next();
        String childwindow = it.next();

        driver.switchTo().window(childwindow);
        sleepFor(15);

        System.out.println(driver.getCurrentUrl());
        //System.out.println("TEXT FROM WEBSITE: "+getTextByWebElement(appointmentText));
        //Assert.assertTrue(getTextByWebElement(appointmentText).contains("Schedule An Appointment"), "Text didn't match");

    }
    public void verifyTextforAppointment(){
//        sleepFor(20);
        System.out.println(getTextByWebElement(appointmentText));
        Assert.assertTrue(getTextByWebElement(appointmentText).contains("Schedule An Appointment"), "Text didn't match");
    }
    public void clickBuildingFoundation(){
//        actions.moveToElement(retirementMenue).perform();
//        wait.until(ExpectedConditions.visibilityOf(buildingFoundation));
//        actions.moveToElement(buildingFoundation).click().perform();

       // RetirementPage.handleMouseHover(retirementMenue, buildingFoundation, 10);
        handleMouseHover(retirementMenue, buildingFoundation, 10);

    }
    public void verifybuildingFoundationText(){
        Assert.assertTrue(getTextByWebElement(buildinFoundationText).contains("foundation for retirement"), "Text not matched.");
    }

    @FindBy(xpath = "//span[@class='nav-topic__link'][normalize-space()='College']")public WebElement college;
    @FindBy(xpath = "//span[contains(text(),'Terms to know when you')]")public WebElement terms;

    public void clickTerms(){
        handleMouseHover(college, terms, 10);
    }


}
