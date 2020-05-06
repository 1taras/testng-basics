package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener1 implements ITestListener {

    @Override
    public void onTestStart(ITestResult iTestResult) {
        System.out.println(" noTestStart - " + iTestResult.getName());
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println(" onTestSuccess - " + iTestResult.getName());

    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        System.out.println(" onTestFailure - " + iTestResult.getName());
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        System.out.println(" onTestSkipped - " + iTestResult.getName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
        System.out.println(" onTestFailedButWithinSuccessPercentage - " + iTestResult.getName());
    }

    @Override
    public void onStart(ITestContext iTestContext) {
        System.out.println(" onStart - " + iTestContext.getName());
    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        System.out.println(" onFinish - " + iTestContext.getName());

    }
}
