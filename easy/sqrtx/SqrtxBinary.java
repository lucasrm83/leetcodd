package sqrtx;

public class SqrtxBinary {
    public static void main(String[] args) {
        int x = 8;
        int low =1;
        int high = x;
        int res =0;

        while (low<=high){
            int mid = low +(high-low)/2;


            if (mid*mid==x){
                System.out.println(mid);
                break;
            }
            else if (mid*mid>x) {
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
