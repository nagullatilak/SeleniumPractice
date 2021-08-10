package com.objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginPageFactory {
    WebDriver driver;

    public RediffLoginPageFactory(WebDriver driver) {
        this.driver =driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//*[@id=\"login1\"]")
    WebElement userName;
    @FindBy(id = "password")
    WebElement passWord;
    @FindBy(name = "proceed")
    WebElement go;
    @FindBy(linkText = "rediff.com")
    WebElement home;
    public WebElement emailId(){
        return  userName;
    }
    public  WebElement passWord(){
        return  passWord;
    }
    public WebElement submit(){
        return go;
    }
    public WebElement home(){
        return home;
    }
}
