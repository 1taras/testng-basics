package dependsOnMethods;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethods {

    @Test
    void login() {
        Assert.assertTrue(true);
        System.out.println("Login Success");

    }

    @Test(dependsOnMethods = "login")
    void sendEmail() {
        Assert.assertTrue(false);
        System.out.println("Email Sent Success");

    }

    @Test(dependsOnMethods = "sendEmail", alwaysRun = true)
    void logout() {
        Assert.assertTrue(true);
        System.out.println("Logout Success");

    }
}

