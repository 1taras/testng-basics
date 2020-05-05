package dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderSeparateTest {
    @Test(dataProvider = "loginData", dataProviderClass = DataProviderSeparateClass.class)
    public void logIn(String a, String b){
        System.out.println("it's the beginning");
        System.out.println(a + " " + b);
        System.out.println("it's the ending");
    }
}
