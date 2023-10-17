package climbingstairs;

public class ClimbingStairs {
    public static void main(String[] args) {
        int n = 2;
        int one =1;
        int two =1;
        for (int i =0;i<n-1;i++){
            int temp = one;
            one = one+two;
            two = temp;

        }
        int result = one;
        System.out.println(result);

    }
}
