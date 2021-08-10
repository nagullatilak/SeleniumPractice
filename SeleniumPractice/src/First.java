import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class First {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/tilan/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver=new ChromeDriver();

// Launch website
        driver.navigate().to("http://www.google.com/");

        // Click on the search text box and send value
        driver.findElement(By.name("q")).sendKeys("javatpoint tutorials");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        // Click on the search button
        driver.findElement(By.name("btnK")).click();

    }
}
