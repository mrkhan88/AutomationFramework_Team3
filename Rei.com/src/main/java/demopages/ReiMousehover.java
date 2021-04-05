package demopages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ReiMousehover {

    @Test
    public void handlehover() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.rei.com/rei-garage");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement acivities = driver.findElement(By.xpath("//span[text()='Activities']"));
        WebElement backpack = driver.findElement(By.xpath("//span[text()='Backpacks']"));


        Actions act = new Actions(driver);

        act.moveToElement(acivities).perform();

        WebDriverWait wait = new WebDriverWait(driver, 10);

//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Laptops']")));

        wait.until(ExpectedConditions.visibilityOf(backpack));

        act.moveToElement(backpack).click().perform();

        Thread.sleep(5000);


    }
}
