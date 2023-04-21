package romantointeger;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        String s = "dcxxi";
        Map<String,Integer> map = new HashMap<>();
        map.put("i",1);
        map.put("v",5);
        map.put("x",10);
        map.put("l",50);
        map.put("c",100);
        map.put("d",500);
        map.put("m",1000);
        int n = s.length();
        int value =0;
        for (int i = 0; i < n; i++) {
            String c = String.valueOf(s.charAt(i));
            if (map.containsKey(c)){
                if((c.equals("i") || c.equals("x") || c.equals("c"))&& i<n-1){
                    String c2 =String.valueOf(s.charAt(i+1));
                    if(map.get(c)>=map.get(c2)){
                        value=value+(map.get(c));
                    }

                    else if (map.get(c2)==10 || map.get(c2)==5){
                        value =value+(map.get(c2)-1);
                        i++;
                    }
                    else if (map.get(c2)==50 || map.get(c2)==100){
                        value =value+(map.get(c2)-10);
                        i++;
                    }
                    else if (map.get(c2)==500 || map.get(c2)==1000){
                        value =value+(map.get(c2)-100);
                        i++;
                    }else {
                        value = value+map.get(c);
                    }

                }else {
                    value = value+map.get(c);
                }




            }else {
                System.out.println("nao tem");
            }
        }
        System.out.println(value);




    }
}
