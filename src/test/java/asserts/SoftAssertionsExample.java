package asserts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionsExample {


    @Test
    public void softAssertOne() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(1, 1);
        softAssert.assertEquals("This is an example", "This is an example");
        softAssert.assertEquals(123, "123");  // 123 does not equal "123" but, actions below will not be considered
        softAssert.assertEquals(false, true, "IT'S Broken, bro!"); // false does not equal true but,actions below will not be considered
        System.out.println("If i see this message Soft Assertion works fine");
        softAssert.assertAll(); // if any of previous asserts failed the test will be marked as FAILED

    }

    @Test
    public void softAssertTwo() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(1, 1);
        softAssert.assertEquals("This is an example", "This is an example");
        softAssert.assertEquals("1", "1");
        softAssert.assertEquals(true, true);
        System.out.println("If i see this message everything is fine");
        softAssert.assertAll();

    }
}
