package lengthoflastword;

public class LastWordAlt {
    public static void main(String[] args) {
        int length = 0;
        String s = "a lua esta linda ";
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                length++;
            } else {
                if (length > 0){
                    System.out.println(length);
                }
            }
        }
        System.out.println(length);
    }
}
