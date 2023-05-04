package lengthoflastword;

public class LastWord {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        int k =0;
        int last =0;
        char ch = ' ';
        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i) ==ch ){
                k=0;
            }
            else {
                k++;

            }
            if (s.charAt(i) != ch) {
                last = k;
            }


        }
        System.out.println(last);


    }
}
