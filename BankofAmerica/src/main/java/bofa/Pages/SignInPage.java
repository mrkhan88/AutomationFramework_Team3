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

    Sqldatabase sdb = new Sqldatabase();
    String rss;

    @FindBy(how = How.ID, using = SigninWeblement.signinput) public WebElement signIninput;
    @FindBy(xpath = "//input[@id='passcode1']") public WebElement passwordinputField;
    @FindBy(xpath = "//span[text()='Sign In']") public WebElement signinButton;

    public void typeinSigninField(String uname) {

        //rss = sdb.connectDatab("signinCredential","id","101","username");

        signIninput.sendKeys(uname);

    }

    public void typeinPasswordField(String pwd){


        rss = sdb.connectDatab("signinCredential","id","101","password");
        passwordinputField.sendKeys(pwd);
    }

    public void clickonsigninButton(){
        signinButton.click();
    }



}
