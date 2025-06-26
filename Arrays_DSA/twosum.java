package Arrays_DSA;

import java.util.Scanner;

public class twosum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Come on now; tell me the integers");
        String[] inputNumbers = sc.nextLine().split(" ");
        int[] nums = new int[inputNumbers.length];
        for (int i = 0; i < inputNumbers.length; i++) {
            nums[i] = Integer.parseInt(inputNumbers[i]);
        }



    }
    
}
