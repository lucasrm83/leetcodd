

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSumOptimized {
    public static int[] main(String[] args) {
        int [] nums = {2,4,1,7,9,3,5,6,8};
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i <nums.length ; i++) {
            if (map.containsKey(target-nums[i])){
                return new int[] {map.get(target-nums[i]),i};

            }
            map.put(nums[i],i);


        }
        return new int[]{};
    }
}
