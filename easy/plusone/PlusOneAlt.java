package plusone;

import mergetwolinkedlists.ListNode;

public class PlusOneAlt {
    public static void main(String[] args) {
        int [] digits ={8,9,9};
        for (int i = digits.length-1; i >=0 ; i--) {
            if (digits[i]<9){
                digits[i]++;
                printList(digits);
            }
            digits[i] =0;
            
        }
        digits = new int[digits.length+1];
        digits[0] =1;
        printList(digits);

    }
    public static void printList(int [] head) {
        for (int i = 0; i < head.length; i++) {
            System.out.print(head[i]);
        }
    }
}
