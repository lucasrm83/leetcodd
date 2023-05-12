package sqrtx;

public class SqrtxBinary {
    public static void main(String[] args) {
        int x = 324;
        int low =1;
        int high = x;
        int res =0;

        while (low<=high){
            int mid = low+high/2;
            System.out.println(mid);
            System.out.println(low);
            if (x/mid==mid){
                System.out.println(mid);
            }
            else if (x/mid<mid) {
                high =mid-1;

            }
            else {
                low=mid+1;
            }

        }
    }
}
