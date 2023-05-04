package insertposition;

public class InsertPosition {
    public static void main(String[] args) {
        int [] nums = {2,3,4,7,8,9};
        int target = 11;
        for (int i = 0; i < nums.length; i++) {
            if (target <= nums[i]){
                System.out.println(i);

            }



        }
        System.out.println(nums.length);
    }
}
