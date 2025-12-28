package practise;

import java.util.List;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		findEven();
//		Loops.findOdd();
//		findEvenUsingForEach();
//		findEvenUsingWhileLoop();
		findOddUsingWhileLoop();
	}

	public static void findEven() {
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}

		}
	}

	public static void findOdd() {
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}

		}
	}

	public static void findOddUsingForEach() {

		List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		for (Integer num : nums) {
			if (num % 2 != 0) {
				System.out.println(num);
			}

		}

	}

	public static void findEvenUsingForEach() {

		List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		for (Integer num : nums) {
			if (num % 2 == 0) {
				System.out.println(num);
			}

		}

	}

	public static void findEvenUsingWhileLoop() {
		int i=1;
		while(i<=10) 
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
			
			i++;
			
		}
	}

	public static void findOddUsingWhileLoop() {
		int i=1;
		while(i<=10) 
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
			
			i++;
			
		}
	}
	
	
}
