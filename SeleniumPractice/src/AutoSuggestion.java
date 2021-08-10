import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class AutoSuggestion {
    public  static  void main(String[] args) throws InterruptedException {
        try {
            System.setProperty("webdriver.chrome.driver", "/home/tilan/Downloads/chromedriver_linux64/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
            driver.get("https://www.makemytrip.com/");
            driver.findElement(By.xpath("//html")).click();
            driver.findElement(By.id("fromCity")).click();
            //Thread.sleep(400);
            WebDriverWait wait = new WebDriverWait(driver,20);
            Thread.sleep(300);
            WebElement from =  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/div[1]/div[1]/div[1]/div/div/div/input"));
            from.sendKeys("Hyd");
            Thread.sleep(200);
            from.sendKeys(Keys.ARROW_DOWN);
            from.sendKeys(Keys.ENTER);
            WebElement to = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/div[1]/div[2]/div[1]/div/div/div[1]/input"));

           // WebElement to = wait.until(ExpectedConditions.(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/div[1]/div[2]/div[1]/div/div/div[1]/input")));

            to.sendKeys("Vij");
            Thread.sleep(300);
            //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/div[1]/div[2]/div[1]/div/div/div[1]/input"))).sendKeys(Keys.ARROW_DOWN);
             to.sendKeys(Keys.ARROW_DOWN);
            to.sendKeys(Keys.ENTER);
            driver.findElement(By.xpath("//html")).click();
            WebElement search = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/p/a")));
           search.click();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
