package tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import testcomponents.BaseComponent;

public class AlertsPractice extends BaseComponent{
	@Test
	public void alerts() {
		// TODO Auto-generated method stub

		//WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("[name=\"enter-name\"]")).sendKeys("Pujitha");
		driver.findElement(By.cssSelector("#alertbtn")).click();
		Alert handle=driver.switchTo().alert();
		String text=handle.getText();
		System.out.println("text");
		handle.accept();
		
		driver.findElement(By.cssSelector("#confirmbtn")).click();
		Alert handle2=driver.switchTo().alert();
		String str2=handle2.getText();
		handle2.dismiss();
		System.out.println("str2");
		
	}

}
