package bofa.Pages;

import common.WebAPI;
import databases.ConnectToSqlDB;
import databases.Sqldatabase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class SignInPage extends WebAPI {

    Sqldatabase sdb = new Sqldatabase();;
    String rss;

    @FindBy(how = How.ID, using = SigninWeblement.signinput) public WebElement signIninput;
    @FindBy(xpath = "//input[@id='passcode1']") public WebElement passwordinputField;
    @FindBy(xpath = "//span[text()='Sign In']") public WebElement signinButton;

   /* public void typeinSigninField(){
        signIninput.sendKeys("abcd");
//        driver.findElement(By.id("onlineId1")).sendKeys("acacd");
    }

    public void typeinPasswordField(){
        passwordinputField.sendKeys("Abcd");
    }
    public void clickonsigninButton(){
        signinButton.click();
    }*/

    //========================

    public void typeinSigninField() {

//        sdb = new Sqldatabase();
        rss = sdb.connectDatab("movie","id","101","title");

        signIninput.sendKeys(rss);

    }

    public void typeinPasswordField(){

//        sdb = new Sqldatabase();
        rss = sdb.connectDatab("movie","id","101","genre");
        passwordinputField.sendKeys(rss);
    }

    public void clickonsigninButton(){
        signinButton.click();
    }



}
