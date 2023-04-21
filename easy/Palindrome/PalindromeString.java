package Palindrome;

public class PalindromeString {
    public static boolean main(String[] args) {
        int x = 121;
        String s = String.valueOf(x);
        int n = s.length();
        for (int i = 0; i <n/2 ; i++) {
            if (s.charAt(i)!= s.charAt(n-1-i)){
                return false;
            }

        }
        return true;
    }
}
