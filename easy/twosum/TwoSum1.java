package twosum;

import java.util.Scanner;

public class TwoSum1 {
    public static void main(String[] args) {
        int [] nums = {2,4,1,7,9,3,5,6,8};
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            for (int j = i+1; j < nums.length ; j++) {
                if (value+nums[j] ==target){
                    System.out.println(i+""+j);

                }

            }

        }

    }
}