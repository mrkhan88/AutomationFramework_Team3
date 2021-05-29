package pages;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class InsurancePage extends WebAPI {

    public static final String insurance_xp ="//span[normalize-space()='INSURANCE']";

    @FindBy(how = How.XPATH, using = insurance_xp) public WebElement insurance;

    public void clickInsurance(){
        insurance.click();
    }
    @FindBy(how = How.XPATH, using = "//a[normalize-space()='Home']") public WebElement home;

    public void clickHome(){
        home.click();

    }
    public static final String zipCode_xp ="(//input[@name='zipCode'])[3]";
    @FindBy(how = How.XPATH, using = zipCode_xp) public WebElement zipCode;

    public void enterZipCode(){
        zipCode.sendKeys("11435");

    }
    public static final String startQuote_xp ="//button[contains(@id, 'quote-main-zip')]";

    @FindBy(how = How.XPATH, using=startQuote_xp) public WebElement startQuote;

    public void clickStartQuote(){
        startQuote.click();

    }

    public static final String calenderIcon_xp="//button[contains(@class, 'ui-datepicker-trigger')]/span";

    @FindBy(how = How.XPATH, using = calenderIcon_xp) public WebElement calenderIcon;

    public void clickCalender(){
        calenderIcon.click();
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("ui-datepicker-calendar")));

    }
    public static final String pickDate_xp = "//td[@data-handler='selectDay']";

    //@FindBy(how = How.XPATH, using = pickDate_xp) public WebElement pickDate;

    public void pickAdate(){


        List<WebElement> date = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr//td"));

         System.out.println(date.size());

        for(WebElement edate : date){
            String day = edate.getText();
            if(day.equalsIgnoreCase("30")){
                System.out.println(day);
                edate.click();
                break;
            }
        }




        sleepFor(5);
    }




}
