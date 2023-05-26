package insertposition;

public class SearchInsertBinary {
    public static void main(String[] args) {
        int [] nums = {1,3,5,6};
        int target = 2;
        int low =0;
        int high = nums.length-1;
        int ans = nums.length;
        while (low<=high){
            int mid = low+ (high-low)/2;
            //System.out.println(mid);
            if (nums[mid]==target){
                System.out.println(mid);
                break;

            } else if (nums[mid]<target) {
                low = mid+1;

            }  else {
                ans = mid;
                high = mid-1;
            }
        }
        System.out.println(ans);
    }
}
