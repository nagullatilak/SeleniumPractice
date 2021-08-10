import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Grid {
    public  static  void main(String[] args) throws MalformedURLException {
        System.setProperty("webdriver.chrome.driver", "/home/tilan/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();
        String url = "http://192.168.43.90:4444/wd/hub";
        DesiredCapabilities  desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setBrowserName("chrome");
        desiredCapabilities.setPlatform(Platform.LINUX);
        driver = new RemoteWebDriver((new URL(url)),desiredCapabilities);
        driver.get("https://scrolltest.com");
        System.out.println(driver.getCurrentUrl());
    }
}
