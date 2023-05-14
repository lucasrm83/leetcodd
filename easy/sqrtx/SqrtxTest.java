package sqrtx;

public class SqrtxTest {
    public static void main(String[] args) {
        int x = 8;
        int start = 1, end = x, ans = 0;
        while (end - start >= 0) {
            int mid = start + (end - start) / 2;
            System.out.println(mid);
            int midSquared = mid * mid;
            if (midSquared == x) {
                System.out.println("here"+mid);
            }
            if (midSquared > x) {
                end = mid - 1;
            } else {
                start = mid + 1;
                ans = mid;
            }
            System.out.println(start);
        }

    }

}
