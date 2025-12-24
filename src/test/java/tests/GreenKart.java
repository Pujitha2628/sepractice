package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GreenKart {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

        int[] arr = {1, 2, 5, 4, 9};

        List<String> items = List.of("banana", "apple", "orange");


        List<WebElement> cards = driver.findElements(By.xpath("//div[@class='product']"));

        for (int i = 1; i <= cards.size(); i++) {
            String itemName = driver.findElement(By.xpath("(//div[@class='product'])[" + i + "]"))
                    .findElement(By.xpath("(//h4[@class='product-name'])[" + i + "]")).getText();
            System.out.println(items);
            System.out.println(itemName);

            for (String name : items) {
                if (itemName.toLowerCase().contains(name.toLowerCase())) {
                    driver.findElement(By.xpath("(//div[@class='product'])[" + i + "]"))
                            .findElement(By.xpath("(//div[@class='product-action']/button)[" + i + "]")).click();
                    break;
                }
            }

        }

        Thread.sleep(10000);
//        driver.quit();

    }
}
