package sqrtx;

public class SqrtxBinary {
    public static void main(String[] args) {
        int x = 4;
        int low =1;
        int high = x;
        int res =0;

        while (low<=high){
            int mid = low +(high-low)/2;


            if (x/mid==mid){
                System.out.println(mid);
                break;
            }
            else if (x/mid<mid) {
                high =mid-1;

            }
            else {
                low=mid+1;
                res = mid;

            }


        }
        System.out.println(res);
    }
}
