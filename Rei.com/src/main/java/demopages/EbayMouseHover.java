package demopages;

import common.WebAPI;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class EbayMouseHover {

    @Test
   public void hanglemousehover() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.ebay.com/");

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        Actions act = new Actions(driver);

        WebElement Electornics = driver.findElement(By.linkText("Electronics"));

        //	act.moveToElement(Electornics).pause(Duration.ofSeconds(5)).moveToElement(driver.findElement(By.xpath("//a[text()='Laptops']"))).pause(Duration.ofSeconds(5)).click().build().perform();

        act.moveToElement(Electornics).perform();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Laptops']")));

        WebElement laptops = driver.findElement(By.xpath("//a[text()='Laptops']"));

//        act.moveToElement(Electornics).moveToElement(laptops).click().build().perform();


        act.moveToElement(laptops).click().perform();

        Thread.sleep(3000);

        //action.moveToElement(we).moveToElement(webdriver.findElement(By.xpath("/expression-here"))).click().build().perform();





   }



}
