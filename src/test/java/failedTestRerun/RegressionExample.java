package failedTestRerun;

import org.testng.Assert;
import org.testng.annotations.Test;


public class RegressionExample {

    @Test
    public void passedTest1() {
        System.out.println("Test 0 - PASSED");
        Assert.assertEquals(0, 0);
    }


    @Test
    public void failedTest1() {
        System.out.println("Test 1 - FAILED");
        Assert.assertEquals(0, 1);
    }

    @Test
    public void failedTest2() {
        System.out.println("Test 2 - FAILED");
        Assert.assertEquals(0, 1);
    }

    @Test
    public void failedTest3() {
        System.out.println("Test 3 - FAILED");
        Assert.assertEquals(0, 1);
    }

}
