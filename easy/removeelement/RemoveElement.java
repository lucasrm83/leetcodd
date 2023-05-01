package removeelement;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {2};
        int val = 3;
        int k =0;

        for (int i = 0; i <=nums.length-1 ; i++) {
            if (nums[i] !=val){
                nums[k] = nums[i];
                k++;
            }

        }
        System.out.println(k);
    }
}
