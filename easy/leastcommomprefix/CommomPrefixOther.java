package leastcommomprefix;

import java.util.Arrays;

public class CommomPrefixOther {
    public String longestCommonPrefix(String[] strs) {

        StringBuilder prefix = new StringBuilder();
        Arrays.sort(strs);
        String primeiro = strs[0];
        String ultimo = strs[strs.length-1];
        for(int i=0;i<Math.min(primeiro.length(), ultimo.length());i++){
            if(primeiro.charAt(i) != ultimo.charAt(i)){
                return prefix.toString();
            }
            prefix.append(primeiro.charAt(i));

        }
        return prefix.toString();

    }
}
