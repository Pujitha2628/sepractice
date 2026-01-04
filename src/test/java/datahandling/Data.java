package datahandling;

import java.io.File;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.ObjectMapper;

public class Data {
	
	@Test(dataProvider="data")
	public  void userdata(HashMap<String,String> map) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/client/#/auth/login");
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys(map.get("username"));
		driver.findElement(By.xpath("//input[@id='userPassword']")).sendKeys(map.get("password"));
		
		driver.findElement(By.cssSelector("#login")).click();
		 
		
	}

	@DataProvider
	public Object[][] data() {
		ObjectMapper mapper=new ObjectMapper();
		List<HashMap<String,String>> result=mapper.readValue(new File(System.getProperty("user.dir") + "/src/test/java/datahandling/Data1.json"),new TypeReference<>() {});
		return new Object[][] { {result.get(0)} , {result.get(1)} , {result.get(2)} };
	
	}
	
	
}
