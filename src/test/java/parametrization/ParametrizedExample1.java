package parametrization;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametrizedExample1 {
    @Test
    @Parameters({"login","password"})
    public void paramtrized1(String login, String password){
        System.out.println("[ Parametrized test 1]");
        System.out.println("Login :    " + login);
        System.out.println("Password : " + password);
        System.out.println("[<-                ->]");

    }

}
