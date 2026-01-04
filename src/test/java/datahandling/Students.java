package datahandling;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.ObjectMapper;//

public class Students {
	
	@Test(dataProvider="data")
	public void student(HashMap<String,String> map) {
		System.out.println(map.get("name"));
		System.out.println(map.get("grade"));
	}
	
	@DataProvider(name="data")
	public Object[][] getStudentData() {
		ObjectMapper mapper=new ObjectMapper();
		List<HashMap<String,String>> val= mapper.readValue(new File(System.getProperty("user.dir") + "/src/test/java/datahandling/students.json"),new TypeReference<>() {});
		return new Object[][] { {val.get(0)}, {val.get(1)} };
		
	}
}