package com.qa.hs.keyword.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Base {
    public WebDriver driver = null;
    public Properties props = null;
    public WebDriver init_driver(String browserName){
        if(browserName.equals("chrome")){
            System.setProperty("webdriver.chrome.driver", "/home/tilan/Downloads/chromedriver_linux64/chromedriver");
            /*if(props.getProperty("headless").equals("yes")){
                ChromeOptions option = new ChromeOptions();
                option.addArguments("--headless");
                driver=new ChromeDriver(option);
            }*/

                driver = new ChromeDriver();
                 //driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        }
        return driver;
    }
    public Properties init_properties() throws IOException {
        Properties prop = new Properties();
        try {
            FileInputStream fis = new FileInputStream("/home/tilan/IdeaProjects/DataDriven/src/main/java/com/qa/hs/keyword/keyword/config/config.properties");
            prop.load(fis);
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
          }
        return prop;
    }

}
