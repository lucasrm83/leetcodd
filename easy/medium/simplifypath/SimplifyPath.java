package medium.simplifypath;

import java.util.Stack;

public class SimplifyPath {
    public static void main(String[] args) {
        Stack<String> ch = new Stack<>();
        String path = "/a//b////c/d//././/..";
        String cur="";
        path+="/";

        for (char c:path.toCharArray()){
            if(c =='/'){
                if(cur.equals("..")){
                    if(!ch.isEmpty()) ch.pop();
                } else if (!cur.equals("")   && !cur.equals(".")  ) {
                    ch.push(cur);
                }
                cur="";
            }
            else {
                cur+=c;
            }
        }
        StringBuilder res = new StringBuilder();
        for(String s: ch){
            res.append("/"+s);
        }
        if (ch.isEmpty()){
            res.append("/");
        }
        System.out.println(res);

    }
}
