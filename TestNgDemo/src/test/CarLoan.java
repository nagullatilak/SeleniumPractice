package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class CarLoan {
    @Test
    public void webLoginCarLoan() {
        System.out.println("Thi is Web login");
    }
    @Test(groups= {"group"})
    public  void mobileLoginCarLoan(){
        System.out.println("This is mobile login");
    }
    @Test
    public  void mobileLogOutCarLoan(){
        System.out.println("This is mobile logout");
    }
    @Test(dependsOnMethods = {"webLoginCarLoan"})
    public void apiLoginCarLoan(){
        System.out.println("This is api login");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("This is before suite");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("This is after suite");
    }
    @Test(enabled = false)
    public  void signInCarLoan(){
        System.out.println("This is mobile signIn");
    }
}
