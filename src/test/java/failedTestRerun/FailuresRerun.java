package failedTestRerun;

import org.testng.Assert;
import org.testng.TestNG;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


import java.util.ArrayList;

public class FailuresRerun {
    @Test
    public void rerun(){
        System.out.println("Rerun the failures >>>");
        TestNG testNG = new TestNG();
        ArrayList<String> myList = new ArrayList<>();
        myList.add("D:\\Automation\\TestNG-presentation\\test-output\\testng-failed.xml");
        testNG.setTestSuites(myList);
        testNG.run();

    }
}
