import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TablesDemo {
    public static  void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "/home/tilan/Downloads/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://money.rediff.com/indices");
        driver.manage().window().maximize();
        driver.findElement(By.id("showMoreLess")).click();
        WebElement element = driver.findElement(By.xpath("//table[@id=\"dataTable\"]//tbody"));
        List<WebElement> rows = driver.findElements(By.tagName("tr"));
        int rowCount = rows.size();
        System.out.println(rowCount);
        for(int i = 0;i<rows.size();i++){
            List<WebElement> columns = rows.get(i).findElements(By.tagName("td"));
            for(int j=0;j<columns.size();j++){
                String text = columns.get(j).getText();
                if(text.equals("S&P BSE 500")){
                    System.out.println("Prev close value:"+columns.get(1).getText());
                    System.out.println("Last Traded:"+columns.get(2).getText());
                    System.out.println("Change :"+columns.get(3).getText());
                }

            }
        }
        driver.close();
    }
}
