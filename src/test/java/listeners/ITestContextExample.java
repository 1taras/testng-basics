package listeners;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class ITestContextExample {


//1st Approach

        String responseCode=null;

//@Test

        void test()

        {

            /*

             * you are getting the Data After Hitting the API

             * Or After Getting the text/Attribute from Selenium/Appium

             * After Initialization we can use this inside any class by calling but it's not good

             * So best practice is to use ITestContext for Sharing the data within the class

             */

            responseCode="IDDQD";

            System.out.println("Response code is --> "+responseCode);

        }

//2nd Approach

        @Test

        void test1(ITestContext context)

        {

            /*

             * you are getting the Data After Hitting the API

             * Or After Getting the text/Attribute from Selenium/Appium

             * We will set this value once and through out inside this class only we can use

             */

            String code="IDDQD";

            context.setAttribute("Code", "IDDQD");

            System.out.println("Response code by ITestContext is --> "+code);

        }

        @Test

        void test2(ITestContext context)

        {

            //From Different class just we have to call it

            System.out.println("Response code is --> "+context.getAttribute("code"));

        }




}
