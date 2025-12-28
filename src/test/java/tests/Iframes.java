package tests;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Iframes {
	@Test
	public void iFrames() {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		WebElement iFrame = driver.findElement(By.cssSelector("[id='courses-iframe']"));
		driver.switchTo().frame(iFrame);
		List<WebElement> courses = driver
				.findElements(By.cssSelector("[class='hidden md:flex items-center space-x-4 lg:space-x-6 text-sm'] a"));
		for (WebElement course : courses) {//fr iterating crses
			String text = course.getText();// crnt iteration value
			System.out.println(text);

			if (text.equalsIgnoreCase("Practice")) {//
				course.click();
				break;
			}
		}

		String textValue = driver.findElement(By.cssSelector("[class='space-y-6'] div:nth-child(1)")).getText();
		System.out.println(textValue);
		
		driver.switchTo().parentFrame();
		driver.findElement(By.cssSelector("#autocomplete")).sendKeys("ahhh");

	}
}
