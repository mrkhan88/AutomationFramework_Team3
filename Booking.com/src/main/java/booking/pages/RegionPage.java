package booking.pages;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegionPage extends WebAPI {
    @FindBy(how = How.XPATH, using = "//a[text()='Florida Hotels']") public WebElement regionButton;



    public void clickRegionButton(){
        regionButton.click();
    }




}
