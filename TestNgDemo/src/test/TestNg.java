package test;

import org.openqa.selenium.WebDriver;
//import org.testng.annotations.test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

    public class TestNg {
        WebDriver driver=null;
        @Test
        public void f() {
            System.out.println("Launching Google Chrome browser");
            String testTitle = "Tools QA";
            String originalTitle = driver.getTitle();
            Assert.assertEquals(originalTitle, testTitle);
        }
        @Test(groups= {"group"})
        public void s(){
            System.out.println("This is 2nd test");
        }
        @Parameters({"url"})
        @BeforeTest
        public void beforeMethod(String baseUrl) {
            System.setProperty("webdriver.chrome.driver", "/home/tilan/Downloads/chromedriver_linux64/chromedriver");
            driver = new ChromeDriver();
            System.out.println("Starting test On Chrome Browser");
            driver.get(baseUrl);
            System.out.println(baseUrl);
        }
        @AfterTest
        public void afterMethod() {
            driver.close();
            System.out.println("Finished test On Chrome Browser");
        }

    }

