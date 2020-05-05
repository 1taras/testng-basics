package grouping;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Grouping {


    @Test(groups = "Smoke")
    void login() {
        Assert.assertTrue(true);
        System.out.println("it's a smoke test");
    }

    @Test(groups = {"Smoke", "Regression"})
    void sendEmail() {
        Assert.assertTrue(true);
        System.out.println("it's a smoke and regression test");

    }

    @Test(groups = {"Smoke", "Abracadabra"})
    void sendEmail2() {
        Assert.assertTrue(true);
        System.out.println("it's a smoke and Abracadabra test");

    }
}
