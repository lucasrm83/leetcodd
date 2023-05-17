package validParenthesis;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        Stack<Character> ch = new Stack<>();
        //A chave da questão é que um stack opera pelo lifo
        String s = "({[]})";
        for (char c:s.toCharArray()) {
            if (c =='('||c=='{'||c=='['){
                ch.push(c);
            }
            else {
                if (ch.isEmpty() || ch.peek() =='(' && c != ')' ||  ch.peek() =='{' && c != '}' ||  ch.peek() =='[' && c != ']'){
                    System.out.println(false);
                }
                ch.pop();
            }

        }
        //se vazio retorna true
        System.out.println(ch.isEmpty());


    }
}
