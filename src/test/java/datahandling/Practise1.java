package datahandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Practise1 {
	@Test
	public void practise() {
		WebDriver driver = new ChromeDriver();

		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement elem = driver.findElement(By.cssSelector("#dropdown-class-example"));
		Select sel=new Select(elem);
		sel.selectByIndex(1);
//		sel.selectByValue("option3");
//		sel.selectByVisibleText("Option1");
//		sel.selectByContainsVisibleText("tion2");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10l));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#dropdown-class-example")));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10l));

		
	}

}
