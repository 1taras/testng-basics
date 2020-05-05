package asserts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionsExample {

    @Test
    public void assertOne() {
        Assert.assertEquals(1, 1);
        Assert.assertEquals("This is an example", "This is an example");
        Assert.assertEquals(123, "123"); // 123 does not equal "123" this assert should not pass, actions below will not be considered
        Assert.assertEquals(true, true);
        System.out.println("If i see this message something is broken");

    }

    @Test
    public void assertTwo() {
        Assert.assertEquals(1, 1);
        Assert.assertEquals("This is an example", "This is an example");
        Assert.assertEquals("1", "1");
        Assert.assertEquals(true, true);
        System.out.println("If i see this message everything is fine");

    }
}
