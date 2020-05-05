package car;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class BMWTest {

    BMW x5 = new BMW("X-5","Damn red", 1444, 60);

    @Test
    public void testBeepBeep() {
        String actualResult = x5.beepBeep();
        String expectedResult = "Du hast mich gefragt und ich hab nichts gesagt Beeeep-beep!";
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testIncreaseSpeed() {
        System.out.println(Reporter.getCurrentTestResult());
    }

    @Test
    public void testChangeColor() {
    }
}