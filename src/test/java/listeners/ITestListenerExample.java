package listeners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Listener1.class)
// example of multiple listeners usage:
// @Listeners({Listener1.class, Listener2.class})
public class ITestListenerExample {

    @Test
    public void test1(){
        System.out.println("Execute 1");
        Assert.assertEquals(1,1);
    }

    @Test
    public void test2(){
        System.out.println("Execute 2");
        Assert.assertEquals(1,1);
    }
}
