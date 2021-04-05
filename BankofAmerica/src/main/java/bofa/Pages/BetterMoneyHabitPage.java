package bofa.Pages;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BetterMoneyHabitPage extends WebAPI {

    @FindBy(xpath = "//span[normalize-space()='Better Money Habits®']") public WebElement bettermoneyHabit;
    @FindBy(xpath = "//span[normalize-space()='Retirement']") public WebElement retirement;


    public void clickOnMoneyhabit(){
        bettermoneyHabit.click();
    }
    public void clickOnRetirement(){

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(retirement)).click();

    }



}
