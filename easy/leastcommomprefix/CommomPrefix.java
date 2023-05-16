package leastcommomprefix;

import java.util.Arrays;

public class CommomPrefix {
    public static void main(String[] args) {
        String [] strs = {"flower","flight","flow"};
        //array.sort é a parte chave que faz necessário usar apenas o primeiro e ultimo item
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        int idx = 0;
        while(idx < s1.length() && idx < s2.length()){
            if(s1.charAt(idx) == s2.charAt(idx)){
                idx++;
            } else {
                break;
            }
        }
        System.out.println(s1.substring(0, idx));
        //return s1.substring(0, idx);
    }

}
