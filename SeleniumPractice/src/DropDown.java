import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class DropDown {
    public static void main(String[] args){
        WebDriver driver = null;
        try{
            System.setProperty("webdriver.chrome.driver", "/home/tilan/Downloads/chromedriver_linux64/chromedriver");
            driver = new ChromeDriver();
            driver.get("https://www.spicejet.com/");
            driver.findElement(By.id("divpaxinfo")).click();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            Select s = new Select(driver.findElement(By.name("ctl00$mainContent$ddl_Adult")));
            s.selectByIndex(3);
           // s.selectByVisibleText("3");
           //s.selectByValue("1");
            Select se = new Select(driver.findElement(By.name("ctl00$mainContent$ddl_Child")));
            se.selectByVisibleText("1");
            String str = driver.findElement(By.id("divpaxinfo")).getText();
            Assert.assertEquals(str,"4 Adult, 1 Child");
            driver.findElement(By.xpath("//html")).click();

        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally {
           // driver.close();
        }
    }

}
