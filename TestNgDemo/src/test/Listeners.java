package test;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.internal.annotations.IListeners;

public class Listeners implements ITestListener{

    public void onTestStart(ITestResult result){
        //System.out.println("On start");

    }
    public void onTestSuccess(ITestResult result){
       // System.out.println("On success");
    }
    public void onTestFailure(ITestResult result){
        System.out.println("On failure "+result.getName());
    }
    public void onTestSkipped(ITestResult result){
        //System.out.println("On skipped");
    }

}
