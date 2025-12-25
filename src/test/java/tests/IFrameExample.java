package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class IFrameExample {

    @Test
    public void iframeExample() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        driver.switchTo().frame("courses-iframe");

        List<WebElement> courses = driver.findElements(By.cssSelector("[class='hidden md:flex items-center space-x-4 lg:space-x-6 text-sm'] a"));

        for (WebElement course : courses) {
            String currentCourse = course.getText();
            System.out.println(currentCourse);

            if (currentCourse.equalsIgnoreCase("Practice")) {
                course.click();
                break;
            }
        }

        String heading = driver.findElement(By.cssSelector("[class='space-y-6'] h1")).getText();
        System.out.println(heading);

        Assert.assertTrue(heading.contains("QA Testing"));

        driver.switchTo().parentFrame();

        driver.findElement(By.cssSelector("[id='autocomplete']")).sendKeys("pujitha");


    }
}
