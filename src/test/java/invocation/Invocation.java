package invocation;

import org.testng.annotations.Test;

public class Invocation {
    @Test(invocationCount = 5)
    public void invocationEx1() {
        System.out.println("invocation method 1 -");

    }

    @Test
    public void invocationEx2() {
        System.out.println("invocation method 2 -");
    }
}
