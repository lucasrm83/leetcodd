package insertposition;

public class InsertPosition {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6,7,8,9,28,30,35,40,50,60};
        int target = 37;
        int it= 0;
        for (int i = 0; i < nums.length; i++) {
            it++;
            if (target <= nums[i]){
                System.out.println(i);

            }



        }
        System.out.println("iterations: "+it);
        System.out.println(nums.length);
    }
}
