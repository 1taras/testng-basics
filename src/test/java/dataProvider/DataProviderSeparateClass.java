package dataProvider;

import org.testng.annotations.DataProvider;

public class DataProviderSeparateClass {
    @DataProvider(name = "loginData")
    public Object[][] dataProvSeparate(){
        return new Object[][]{
                {"nombre1","hombre1"},
                {"nombre2","hombre2"},
                {"nombre3","hombre3"},
        };
    }
}
