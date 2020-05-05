package dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderSameClass {
    @DataProvider(name = "loginData")
    public Object[][] dateProvider() {
        return new Object[][]{
                {"name1", "password1"},
                {"name2", "password2"},
                {"name3", "password3"},
        };
    }

    @Test(dataProvider = "loginData")
    public void logIn(String login, String password) {
        System.out.printf("My login is: %s My password is: %s ", login, password);
    }
}
