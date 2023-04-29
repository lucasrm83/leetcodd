package removeduplicates;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {1,2,3,3,5};
        int k = 0;

        for (int i = 0; i <nums.length-1 ; i++) {
            if (nums[i] != nums[i+1]) {
                k++;
            }



        }
        System.out.println(k);

    }
}
