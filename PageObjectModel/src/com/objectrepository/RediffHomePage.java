package com.objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffHomePage {
    WebDriver driver;

    public RediffHomePage(WebDriver driver) {
        this.driver =driver;
    }
    By search = By.id("srchword");
    By searchButton = By.xpath("//*[@id=\"queryTop\"]/input");
    public WebElement search(){
        return  driver.findElement(search);
    }
    public  WebElement searchButton(){
        return  driver.findElement(searchButton);
    }
}
