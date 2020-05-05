package car;

import org.testng.Assert;
import org.testng.annotations.*;




public class CarTest {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("<------ Before Suite method");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("--Before Test method");
    }

    @BeforeClass

    public void beforeClass(){
        System.out.println("--Before Class method");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("--Before Method method");
    }
    Car testCar = new Car();

    @Test
    public void testBeepBeep() {
        System.out.println(".....test-1 testBeepBeep.....");
        String actualResult = testCar.beepBeep();
        String expectedResult = "Beeeep-beep!";
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testIncreaseSpeed() {
        System.out.println(".....test-2 testIncreaseSpeed");

        int actualResult = testCar.increaseSpeed(22);
        int expectedResult = 66;
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testChangeColor() {
        System.out.println(".....test-3 testChangeColor");
        String actualResult = testCar.changeColor("red");
        String expectedResult = "red";
        Assert.assertEquals(actualResult,expectedResult);
        Assert.assertEquals(testCar.changeColor("red"),"red", "Houston, we have got a problem:)");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("--After Method method");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("--After Class method");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("--After Test method");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("------> After Suite method");
    }


}