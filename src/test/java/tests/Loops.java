package tests;

import java.util.List;

public class Loops {
    public static void main(String[] args) {
        //For loop
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        //for each loop
        List<Integer> nums = List.of(1, 2, 3, 5, 6, 8, 4, 9);
        for (int num : nums) {
            System.out.println(num);

        }

        int k =0;
        while (k < 10) {
            System.out.println(k);
            k++;
        }
    }
}
