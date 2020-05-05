package reporterExample;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ReporterExampleTest {

    @BeforeMethod
    public void setUp() {
    }

    @AfterMethod
    public void tearDown() {
    }

    @Test
    public void googleSearchTest(){
        WebDriverManager.chromedriver().version("80.0.3987.106").setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Reporter.log("I opened the browser window");
        driver.navigate().to("https://www.google.com");
        Reporter.log("I opened the google.com page");
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys(" how to make a spirulina smoothie and code Python");
        Reporter.log("I entered the text in search input field");
    }
}