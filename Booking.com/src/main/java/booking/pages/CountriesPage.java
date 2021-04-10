package booking.pages;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CountriesPage extends WebAPI {

    @FindBy(xpath = "//a[normalize-space()='Algeria']") public WebElement algeriaButton;


public void clickOnAlgeria(){
    algeriaButton.click();
}










}
