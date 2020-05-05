package priority;

import org.testng.annotations.Test;

public class Priority {

    @Test(priority = 5)
    public void priorityEx1() {
        System.out.println("priority test 1 -");
    }

    @Test(priority = 1)
    public void priorityEx2() {
        System.out.println("priority test 2 -");
    }

    @Test(priority = 3)
    public void priorityEx3() {
        System.out.println("priority test 3 -");
    }
}
