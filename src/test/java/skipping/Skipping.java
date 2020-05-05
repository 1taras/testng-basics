package skipping;

import org.testng.annotations.Test;

public class Skipping {

    @Test(enabled = false)
    public void skippingEx1() {
        System.out.println("skipping test 1 - in should be skipped!");
    }

    @Test()
    public void skippingEx2() {
        System.out.println("skipping test 2 -");
    }
}
