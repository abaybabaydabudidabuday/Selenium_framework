package kz.beeline.test.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class TestListenerImpl implements ITestListener {

    public void onTestStart(ITestResult iTestResult) {
        System.out.println(iTestResult.getName() + " --- Started");
        Reporter.log(iTestResult.getName() + " --- Started");
    }

    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println(iTestResult.getName() + " --- Success");
        Reporter.log(iTestResult.getName() + " --- Success");
    }


    public void onTestFailure(ITestResult iTestResult) {
        System.out.println(iTestResult.getName() + " --- Failed");
        Reporter.log(iTestResult.getName() + " --- Failed");
    }


    public void onTestSkipped(ITestResult iTestResult) {

    }


    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    public void onStart(ITestContext iTestContext) {

    }

    public void onFinish(ITestContext iTestContext) {

    }
}
