package booking.pages;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class HotelbookingPage extends WebAPI {
    @FindBy(xpath = "//span[@aria-label='21 April 2021']//span[@aria-hidden='true'][normalize-space()='21']")
    WebElement checkindate;
    @FindBy(xpath = "//span[@aria-label='11 May 2021']//span[@aria-hidden='true'][normalize-space()='11']")
    WebElement checkoutdate;
    @FindBy(xpath = "//span[normalize-space()='Search']")
    WebElement searchbutton;
    @FindBy(xpath = "//label[@id='xp__guests__toggle']")
    WebElement guestinputbutton;
    @FindBy(xpath = "(//span[@class='bui-button__text'][normalize-space()='+'])[1]")
    WebElement adultspassengerbutton;
    @FindBy(xpath = "(//button[contains(@class,'bui-button bui-button--secondary bui-stepper__add')])[2]")
    WebElement childrenpassButton;
    @FindBy(xpath = "//label[@id='xp__guests__toggle']")WebElement gusetselectButton;


    @FindBy(xpath = "//div[contains(@class,'bui-calendar__content')]/div[1]//tbody/tr/td")
    WebElement clenderCheckindate;
    By calenderWebelement = By.xpath("//div[contains(@class,'bui-calendar__content')]/div[1]//tbody/tr/td");

    By calenderWebelement2 = By.xpath("//div[contains(@class,'bui-calendar__content')]/div[2]//tbody/tr/td");



    public void selectCheckIndate() {
        checkindate.click();
        sleepFor(2);
    }

    public void selecCheckoutDate() {
        checkoutdate.click();
    }

    public void clickOnguestinputButton() {
        guestinputbutton.click();
    }

    public void selectNumberOfAdultpassenger() {
        /*int i=3;
        while (i<11){
            adultspassengerbutton.click();
            i++;
        }*/
        clickMultipleTimes(3, 10, adultspassengerbutton);
    }

    public void selectNumberoFChildrenpass() {
        childrenpassButton.click();
    }

    public void clickOnSearchBoxbutton() {
        searchbutton.click();
    }

    public void verifResultPage() {
        String expectedText = "searchresults";
        Assert.assertTrue(getCurrentPageUrl().contains(expectedText), "page verification failed.");
        //Assert.assertTrue(getCurrentPageUrl().contains("alfjaljflakjflajfldhresults"), "page verification failed.");
    }
    /*public void clickMultipleTimes(int startingpointloop, int numberOfClick,WebElement webElement){
        while (startingpointloop<=numberOfClick){
            webElement.click();
            startingpointloop++;
        }

    }*/

    public void clickOncalederDate() {
        /*List<WebElement> dates = driver.findElements(calenderWebelement);

        for (WebElement edate : dates) {
            if(edate.getText().contains("26")){
                edate.click();
                break;
            }

        }*/
        clickByWebElements(calenderWebelement, "26");

    }

//    public void clickByWebElements(By byclass, String text) {  //For clicking using List of WebElement, need to store locator in BY class
//        List<WebElement> muliWebElements = driver.findElements(byclass);
//
//        for (WebElement eWebElement : muliWebElements) {
//            if (eWebElement.getText().contains(text)) {
//                eWebElement.click();
//                break;
//            }
//        }
//
//    }
    public void clickOncalenderDate2(){
        clickByWebElements(calenderWebelement2, "15");
    }
    public void clickOnguestselectonButton(){
        guestinputbutton.click();
    }
    public void addNumberofAdultGuest(){
        clickMultipleTimes(1,3,adultspassengerbutton);

    }








}
