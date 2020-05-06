package listeners;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;



public class ITestResultExample {
    @Test
    public void testFailed() {
        System.out.println("Execute testFailed:");
        Assert.assertFalse(true);
    }

    @Test
    public void testPassed() {
        System.out.println("Execute testPassed:");
        Assert.assertTrue(true);
    }


    @AfterMethod
    public void afterMethod(ITestResult iTestResult) {
        if (iTestResult.getStatus() == ITestResult.SUCCESS) {
            System.out.println(iTestResult.getName() + " successfully Passed!");
        } else if (iTestResult.getStatus() == ITestResult.FAILURE) {
            System.out.println(iTestResult.getName() + " pathetically Failed!");
        }

    }
}
