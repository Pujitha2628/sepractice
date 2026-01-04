package parallelexecution;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Script2 {
    @Test(priority = 2)
    public void method1() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Script 2 - method 1");
    }

    @Test(priority = 1)
    public void method2() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Script 2 - method 2");
    }

    @Test(alwaysRun = true, enabled = true )
    public void method3() throws InterruptedException 
    {
        Thread.sleep(3000);
        System.out.println("Script 2 - method 3");
        
       
    }
    
    @BeforeSuite
    public void method4() throws InterruptedException{
    	Thread.sleep(3000);
    	System.out.println("Script to before suite");
    }
    @BeforeMethod
    public void method5() throws InterruptedException{
    	Thread.sleep(3000);
    	System.out.println("Script to before method");
    }
    @BeforeTest
    public void method9() throws InterruptedException{
    	Thread.sleep(3000);
    	System.out.println("Script to before test");
    }
    @BeforeClass
    public void method10() throws InterruptedException{
    	Thread.sleep(3000);
    	System.out.println("Script to before class");
    }
    
    
    @AfterSuite
    public void method6() throws InterruptedException {
    	Thread.sleep(3000);
    	System.out.println("Script to after suite");
    	
    	}
    @AfterTest
    public void method7() throws InterruptedException {
    	Thread.sleep(3000);
    	System.out.println("Script to after test");
    	
    	}
    @AfterMethod
    public void method8() throws InterruptedException {
    	Thread.sleep(3000);
    	System.out.println("Script to after method");
    	
    	}
    @AfterClass
    public void method11() throws InterruptedException {
    	Thread.sleep(3000);
    	System.out.println("Script to after class");
    	
    	}
    
    
}
