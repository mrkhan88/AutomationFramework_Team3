package homepage;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import javax.swing.*;

import static homepage.BookingHomePageWebElement.*;

public class BookingHomePage extends WebAPI {
    // Action Method class

    // Find By Annotation: First Approach
    @FindBy (how = How.XPATH, using = flightTab) public WebElement flightXP;
    @FindBy (how = How.XPATH, using = search) public WebElement searchXP;
    @FindBy (how = How.XPATH, using = search2) public WebElement search2XP;
    @FindBy (how = How.XPATH, using = searchDropDown) public WebElement searchDropDownXP;
    @FindBy (how = How.XPATH, using = dropBox) public WebElement dropBoxXP;


    public void flightTab() throws InterruptedException {
        flightXP.click();
        sleepFor(3);

    }
    public void search() throws InterruptedException {
        searchXP.sendKeys("London");
        sleepFor(5);

    }
    public void search2() throws InterruptedException {
        search2XP.sendKeys("egy");
        sleepFor(3);

    }
    public void clickAndDrag() throws InterruptedException {
        WebElement source = driver.findElement(By.xpath("//*[@class='bui-avatar__image']"));
        WebElement destination = searchXP;
        Actions actions = new Actions(driver);
        actions.dragAndDrop(source,destination).build().perform();
        sleepFor(5);
    }




}
