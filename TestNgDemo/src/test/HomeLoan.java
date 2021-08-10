package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeLoan {
    @Test
    public void webLoginHomeLoan() {
        System.out.println("Thi is Web login");
    }
    @Test(groups= {"group"})
    public  void mobileLoginHomeLoan(){
        System.out.println("This is mobile login");
    }
    @Test(timeOut = 40000)
    public void apiLoginHomeLoan(){
        System.out.println("This is api login");
    }
    @BeforeMethod
    public void beforemethod(){
        System.out.println("THis is before method");
    }
    @AfterMethod
    public void after(){
        System.out.println("This is after method");
    }

}
