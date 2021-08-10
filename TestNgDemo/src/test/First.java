package test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class First {
    @Test
    public void f(){
        System.out.println("THis is 1st test");
    }
    @Test(groups= {"group"})
    public void s(){
        System.out.println("This is second test");
    }
    @Test(dataProvider = "getData")
    public  void data(String userName,String passWord){
        System.out.println(userName);
        System.out.println(passWord);
    }
    @DataProvider
    public Object[][] getData(){
         Object[][] data = new Object[3][2];
         //1st test
         data[0][0] = "firstusername";
         data[0][1] = "firstpassword";
         //2nd test
         data[1][0] = "secondusername";
         data[1][1] = "secondpassword";
         //3rd test
         data[2][0] = "thirdusername";
         data[2][1] = "thirdpassword";
        return data;
    }

}
