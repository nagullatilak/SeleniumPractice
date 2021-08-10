package com.testcases;

import com.objectrepository.RediffHomePage;
import com.objectrepository.RediffLoginPage;
import com.objectrepository.RediffLoginPageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginApplication {
    WebDriver driver=null;
    @BeforeTest
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "/home/tilan/Downloads/chromedriver_linux64/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();
    }
    @Test
    public void login(){

       // RediffLoginPage rd= new RediffLoginPage(driver);
        RediffLoginPageFactory rd = new RediffLoginPageFactory(driver);
        rd.emailId().sendKeys("hello");
        rd.passWord().sendKeys("hello");
        rd.submit().click();
        rd.home().click();
        RediffHomePage rh = new RediffHomePage(driver);
        rh.search().sendKeys("rediff");
        rh.searchButton().click();

    }
    @AfterTest
    public void afterTest(){
        driver.close();
    }
}
