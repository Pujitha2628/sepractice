package tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.cssSelector("[name='enter-name']")).sendKeys("pujitha");
		driver.findElement(By.cssSelector("#alertbtn")).click();

		Alert alertHandle=driver.switchTo().alert();
		String text=alertHandle.getText();
		System.out.println("text");

		alertHandle.accept();

		driver.findElement(By.cssSelector("[name='enter-name']")).sendKeys("Saikam");

		driver.findElement(By.cssSelector("#confirmbtn")).click();
		Alert alertHandle1=driver.switchTo().alert();
		String text1=alertHandle1.getText();
		System.out.println("text1");
		alertHandle1.dismiss();

}}
