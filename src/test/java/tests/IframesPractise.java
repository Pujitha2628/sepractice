package tests;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IframesPractise {
	@Test
	public void iFrames() {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.xpath("//legend[text()='Suggession Class Example']/following-sibling::input")).sendKeys("mommy");
		driver.switchTo().frame(0);//index of frame- 0
		
		String str=driver.findElement(By.xpath("//h1[@class='text-3xl md:text-4xl lg:text-5xl xl:text-6xl font-bold leading-tight']")).getText();
					
		System.out.println(str);
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//legend[text()='Suggession Class Example']/following-sibling::input")).sendKeys("hello");
}	}
