package practise;

import java.util.List;

public class Strings1 {

	public static void main(String[] args) {
//		findVowels();
		 findConsonants();
		
		
	}
	
	private static void findVowels() {
		List<Character> vowels=List.of('a','e','i','o','u');
		String name="pujitha saikam";
		char[] array=name.toCharArray();
		for(char ch:array) {
			
			if(vowels.contains(ch)) {
				System.out.println(ch);
			}
			
		}
	}
	
	private static void findConsonants() {
		List<Character> vowels1=List.of('a','e','i','o','u');
		String nm= "I hate you";
		char[] arr=nm.toCharArray();
		for(int i=0;i<arr.length;i++) {
			char ch=arr[i];
			if(!vowels1.contains(ch)) {
				System.out.println(ch);
			}
		}
		
		
	
	}
}
