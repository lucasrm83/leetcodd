package insertposition;

public class SearchInsertBinary {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6,7,8,9,28,30,35,40,50,60};
        int [] reff = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        int target = 37;
        int low =0;
        int high = nums.length-1;
        int i =0;
        while (low<=high){
            i++;
            int mid = (low+high)/2;
            //System.out.println(mid);
            if (nums[mid]==target){
                System.out.println(mid);
                break;
            } else if (nums[mid]<target && nums[mid+1]>target) {
                System.out.println(mid+1);
                break;

            } else if (nums[mid]>target && nums[0]==nums[mid]) {
                System.out.println(mid);
                break;

            } else if (nums[mid]<target && nums[nums.length-1]==nums[mid]) {
                System.out.println(mid+1);
                break;

            } else if (nums[mid]>target) {
                high =mid-1;

            }  else {
                low = mid+1;
            }
        }
        System.out.println("iterations: "+i);
    }
}
