package Palindrome;

public class Palindrome {
    public static void main(String[] args) {
        int x = 2991;
        if(x<0||(x>0 && x%10==0)){
            System.out.println(false);
        }
        int reverso =0;
        while (x>reverso){
            reverso = reverso*10 +x%10;
            x = x/10;
        }
        System.out.println(x==reverso||x==reverso/10);

    }
}
