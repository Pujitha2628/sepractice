package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropdownHandling {
	@Test
    public  void dropdownHandling() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");


        WebElement dropdown = driver.findElement(By.cssSelector("#dropdown-class-example"));
        Select select = new Select(dropdown);
        select.selectByIndex(1);
        select.selectByValue("option3");
        select.selectByContainsVisibleText("tion2");
        select.selectByVisibleText("Option2");


        driver.findElement(By.cssSelector("#hide-textbox")).click();
        String styleValue = driver.findElement(By.cssSelector("#displayed-text")).getDomAttribute("style");
        System.out.println(styleValue);

        assert styleValue != null;
        Assert.assertTrue(styleValue.contains("none"));

        driver.findElement(By.cssSelector("#show-textbox")).click();
        styleValue = driver.findElement(By.cssSelector("#displayed-text")).getDomAttribute("style");
        System.out.println(styleValue);
        assert styleValue != null;
        Assert.assertTrue(styleValue.contains("block"));

        Thread.sleep(10000);
    }
}
