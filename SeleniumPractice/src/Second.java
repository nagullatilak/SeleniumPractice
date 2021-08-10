import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Second {
    public static void main(String[] args){
        WebDriver driver=null;
        try {
            System.setProperty("webdriver.chrome.driver", "/home/tilan/Downloads/chromedriver_linux64/chromedriver");
            driver = new ChromeDriver();
            driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");
            String simpleText = driver.findElement(By.className("col-md-12")).getText();
            System.out.println(simpleText);
            driver.findElement(By.linkText("This is a link")).click();
            driver.navigate().back();
            driver.findElement(By.id("fname")).sendKeys("Tilak sai kumar");
            //driver.findElement(By.id("fname")).clear();
            driver.findElement(By.id("idOfButton")).click();
            WebElement test = driver.findElement(By.id("male"));
            test.click();
            Assert.assertEquals(true, test.isSelected());
            System.out.println("Radio button is selected assert passed");
            driver.findElement(By.className("Automation")).click();
            driver.findElement(By.className("Performance")).click();
            //Drop down
            Select dropdown = new Select(driver.findElement(By.id("testingDropdown")));
            dropdown.selectByVisibleText("Automation Testing");
            Actions act = new Actions(driver);
            WebElement ele = driver.findElement(By.id("dblClkBtn"));
            act.doubleClick(ele).perform();
            //alerts handling
            driver.switchTo().alert().accept();
            Assert.assertNotEquals("ActualTitle", "ExpectedTitle");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally {
            driver.close();
        }

    }
}
