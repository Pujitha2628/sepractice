package parallelexecution;

import org.testng.annotations.Test;

public class Script1 {

    @Test
    public void method1() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Script 1 - method 1");
    }

    @Test
    public void method2() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Script 1 - method 2");
    }

    @Test
    public void method3() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Script 1 - method 3");
    }
}
