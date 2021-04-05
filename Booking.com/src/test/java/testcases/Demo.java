package testcases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Demo {

    @Test
    public void demoTest() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement input = driver.findElement(By.xpath("//input[@id='autosuggest']"));
//       driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("Ban");
        input.sendKeys("Ban");
        Thread.sleep(5000);

//        input.sendKeys(Keys.ARROW_DOWN);

        int i = 0;
        while (i<2){
            input.sendKeys(Keys.ARROW_DOWN);
            i++;
        }

        input.sendKeys(Keys.ENTER);

//        List<WebElement> options =driver.findElements(By.cssSelector("li[class=ui-menu-item] a"));
//
//        for(WebElement opt : options){
//            if(opt.getText().equalsIgnoreCase("Bangladesh"))
//                opt.click();
//            break;
//        }

        Thread.sleep(5000);
        driver.quit();
    }

}
