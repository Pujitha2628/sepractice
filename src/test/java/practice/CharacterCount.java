package practice;

import java.util.HashMap;/////ONLY JOB////////

public class CharacterCount {
	public static void main(String[] args) {
		String name = "pujitha is quality assurance engineer";
		HashMap<Character, Integer> output = new HashMap<>();

		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			System.out.println(ch);

			output.put(ch, output.getOrDefault(ch, 0) + 1);
		}

		System.out.println(output);

	}

	private static void getCharCount(String name) {
		HashMap<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < name.length(); i++)
		{
				char ch=name.charAt(i);
				System.out.println(ch);
				
		}
	}
}
