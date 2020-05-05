package parallel;

import org.testng.annotations.Test;

public class ParallelExample {

    @Test
    public void parallelTest1(){
        System.out.println("test 1 was executed by Thread # " + Thread.currentThread().getId());
    }

    @Test
    public void parallelTest2(){
        System.out.println("test 2 was executed by Thread # " + Thread.currentThread().getId());
    }

    @Test
    public void parallelTest3(){
        System.out.println("test 3 was executed by Thread # " + Thread.currentThread().getId());
    }

    @Test
    public void parallelTest4(){
        System.out.println("test 4 was executed by Thread # " + Thread.currentThread().getId());
    }

    @Test
    public void parallelTest5(){
        System.out.println("test 5 was executed by Thread # " + Thread.currentThread().getId());
    }
}
