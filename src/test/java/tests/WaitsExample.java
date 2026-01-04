package tests;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import testcomponents.BaseComponent;

public class WaitsExample extends BaseComponent {
	
	@Test(enabled = true,groups = {"smoke"})
	public void test1() {
		System.out.println("smoke-test1");
	}

	@Test(enabled = true,groups = {"sanity"})
	public void test2() {
		System.out.println("sanity-test2");
	}
	

	@Test(enabled = true,groups = {"regression"})
	public void test3() {
		System.out.println("regression-test3");
	}
	
	@Test(enabled = true,groups = {"sanity","smoke"})
	public void test4() {
		System.out.println("sanity-test4");
	}
	
	
	@Test(enabled = true,dependsOnGroups = "sanity",priority = 0)
	public void waits()  {
		
		
		System.out.println("Executing waits example");
		driver.manage().window().maximize();
		
		/*
		 * Implicit waits()-
		 * explicit wait()-
		 * fluent wait()-
		 * thread.sleep()-
		 * 
		 */
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		try{
			driver.findElement(By.cssSelector("[id='pu']")).click();
		}
		catch(Exception e) {
			System.out.println("NoSuchElementException occured");
		}
		
		try{
			driver.findElement(By.cssSelector("[id='ji']")).click();
		}
		catch(Exception e) {
			System.out.println("NoSuchElementException occured");
		}
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10L));// Syntax for Explicit
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id=\"autocomplete\"]")));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id='aaa']")));

	
	}	
	
	
}
