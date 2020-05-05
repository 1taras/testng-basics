package car;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ToyotaTest {
Toyota camry = new Toyota();

    @Test
    public void testBeepBeep() {
        String actualResult = camry.beepBeep();
        String expectedResult = "こんにちは Beeeep-beep!";
        assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testIncreaseSpeed() {
        int actualResult = camry.increaseSpeed(22);
        int expectedResult = 34;
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testChangeColor() {
    String value = "緑";
    Assert.assertEquals(camry.changeColor("緑"),"my new color is " + value, "Houston, we have got a problem:)");
    }
}