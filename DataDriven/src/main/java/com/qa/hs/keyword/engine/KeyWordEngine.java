package com.qa.hs.keyword.engine;

import com.qa.hs.keyword.base.Base;
import net.bytebuddy.asm.Advice;
import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class KeyWordEngine {
    public Properties prop;
    public WebDriver driver;
    public Base base;
    public  WebElement element;
    public  static Workbook book;
    public static Sheet sheet;
    public final String SCENARIO_SHEET_PATH="/home/tilan/IdeaProjects/DataDriven/src/main/java/com/qa/hs/keyword/scenarios/KeywordData.xlsx";
    public  void startExecution(String sheetName){
        String locatorName = null;
        String locatorValue = null;
        FileInputStream file = null;
        try{
            file = new FileInputStream(SCENARIO_SHEET_PATH);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            book = WorkbookFactory.create(file);
        }
        catch (InvalidFormatException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        sheet = book.getSheet(sheetName);
        int k=0;
        for(int i =0;i< sheet.getLastRowNum();i++){
         String locatorColValue = sheet.getRow(i+1).getCell(k+1).toString().trim();
         //System.out.println(locatorColValue);
         try {
             if (!locatorColValue.equalsIgnoreCase("NA")) {
                 locatorName = locatorColValue.split("=")[0].trim();
                 locatorValue = locatorColValue.split("=")[1].trim();
             }
             String action = sheet.getRow(i + 1).getCell(k + 2).toString().trim();
             String value = sheet.getRow(i + 1).getCell(k + 3).toString().trim();
            System.out.println(action+""+value);
             switch (action) {
                 case "open browser":
                     base = new Base();
                     prop = base.init_properties();
                     if (value.isEmpty() || value.equals("NA")) {
                         driver = base.init_driver(prop.getProperty("browser"));
                     } else {
                         driver = base.init_driver(value);
                     }

                     break;
                 case "enter url":

                     if (value.isEmpty() || value.equals("NA")) {
                         driver.get(prop.getProperty("url"));

                     } else {
                         driver.get(value);
                     }
                     Thread.sleep(40000);
                     break;
                 case "quit":
                     driver.quit();
                     break;
                 default:
                     break;
             }
             //System.out.println("Locator Name "+locatorName);
             switch (locatorName) {

                 case "id":
                     Thread.sleep(40000);
                     element = driver.findElement(By.id(locatorValue));
                     if (action.equalsIgnoreCase("sendkeys")) {
                         element.clear();
                         element.sendKeys(value);
                     } else if (action.equalsIgnoreCase("click")) {
                         element.click();
                     }
                     locatorName = null;
                     break;
                 case "linkText":
                     Thread.sleep(40000);
                     element = driver.findElement(By.linkText(locatorValue));
                     element.click();
                     locatorName = null;
                     break;
                 default:
                     break;
             }
         }
         catch (Exception e){

         }
         }

        }
    }

