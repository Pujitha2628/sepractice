package testcomponents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseComponent  {
	public WebDriver driver;
	@BeforeTest
	
	public void initializeBrowser() {
		
		String browserName = "edge";
		
		
		if(browserName.contains("chrome")) 
		{
			System.out.println("Initializing chrome");
			 driver=new ChromeDriver();
			
		}
		else if(browserName.contains("edge")) 
		{
			driver=new EdgeDriver();
			System.out.println("Initializing edge");
		}
		else
		{
			driver=new FirefoxDriver();
			System.out.println("Initializing fire fox");
		}
	}
		
	@AfterTest
	public void quitBrowser() {
	
		driver.quit();
		System.out.println("browser closed");
		
	}
		
}
