package datahandling;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.ObjectMapper;

public class Fruits {

	@Test(enabled = true, dataProvider = "chichi")
	public void fruits(String[] arr) {
		System.out.println("hi");
		System.out.println(Arrays.toString(arr));

	}

	@Test(alwaysRun = false, enabled = false)
	public void fruits1() {
		System.out.println("hello");
		int[] arr = { 5, 9, 9, 0, 0, 9 };
		int[] arr1 = new int[] { 5, 9, 9, 0, 0, 9 };
		int[] arr2 = new int[2];
		arr2[0] = 2;
		arr2[1] = 21;
		int[][] array = { { 97, 98, 9, 0 }, { 32, 64, 3, 96, 3 } };
		int[][] array1 = new int[][] { { 3, 5, 6, 7 }, { 42, 4, 5, 6 } };
		Fruits fs = new Fruits();
		Object[][] result = fs.getfruits();
		System.out.println(Arrays.toString(result[1]));
	}

	@DataProvider(name = "chichi")
	public Object[][] getfruits() {
		return new Object[][] { { "puji", "apple" },

				{ "grapes", "kiwi" }, { "orangee", "banana" }

		};

	}

	@DataProvider(name = "credentials")
	public Object[][] getcredentials() {
		HashMap<String, String> map = new HashMap<>();
		map.put("username", "Govind");
		map.put("password", "Test@123");
		HashMap<String, String> map1 = new HashMap<>();
		map1.put("username", "hello");
		map1.put("password", "kajol");
		HashMap<String, String> map2 = new HashMap<>();
		map2.put("username", "dipika");
		map2.put("password", "ranbir");
		return new Object[][] { { map }, { map1 }, { map2 } };

	}

	@Test(dataProvider = "credentials", enabled = false)
	public void login(HashMap<String, String> input) {
		System.out.println(input.get("username"));
		System.out.println(input.get("password"));
	}

	@DataProvider(name = "data")
	public Object[][] getDataFromJsonFile() {

		ObjectMapper mapper = new ObjectMapper();// file lo unna data retrieve ki -ObjectMapper.read value
		List<HashMap<String, String>> listmap = mapper.readValue(new File(
				"C:\\Users\\bhavy\\eclipse-workspace\\sepractice\\src\\test\\java\\datahandling\\credentials.json"),
				new TypeReference<List<HashMap<String, String>>>() {
				}); // filepath, list of hashmap
		return new Object[][] { { listmap.get(2) }, { listmap.get(3) }, { listmap.get(1) } };//
	}

	

	public static List<HashMap<String, String>> getDataFromJson(String filepath) {
		ObjectMapper mapper = new ObjectMapper();// file lo unna data retrieve ki -ObjectMapper.read value
		return mapper.readValue(new File(filepath), new TypeReference<List<HashMap<String, String>>>() {
		});
	}

	@DataProvider(name = "files")
	public Object[][] getData() {
		List<HashMap<String, String>> listdata = getDataFromJson(
				"C:\\\\Users\\\\bhavy\\\\eclipse-workspace\\\\sepractice\\\\src\\\\test\\\\java\\\\datahandling\\\\credentials.json");
		return new Object[][] { { listdata.get(2) }, { listdata.get(3) }, { listdata.get(1) } };//
	}

	@Test(dataProvider = "data")
	public void loginUsingJson(HashMap<String, String> str) {
		System.out.println(str.get("username"));
		System.out.println(str.get("password"));
	}
}
