package tests;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dummy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20l));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='oxd-sheet oxd-sheet--rounded oxd-sheet--gutters oxd-sheet--gray-lighten-2 orangehrm-demo-credentials']/p")));
		
		List<WebElement> credentials=driver.findElements(By.xpath("//div[@class='oxd-sheet oxd-sheet--rounded oxd-sheet--gutters oxd-sheet--gray-lighten-2 orangehrm-demo-credentials']/p"));
		String uname;
		String pswd;
		
		HashMap<String,String> map=new HashMap<>();
		
		
		
		for(WebElement credential:credentials) {
			
			
			String[] arr = credential.getText().split(":");
			map.put(arr[0].trim(), arr[1].trim());
		
		}
		System.out.println(map);
		uname=map.get("Username");
		System.out.println(uname);

		pswd=map.get("Password");
		System.out.println(pswd);
		
		
		System.out.println(map.get("bjk"));
		
		
		
		
	}

}
