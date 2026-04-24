package com.example.revision;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        String str1 = "([{}])";
        char[] str = str1.toCharArray();
        for (int i = 0; i < str.length; i++) {
            if (str[i] == '(' || str[i] == '{' || str[i] == '[') {
                stack.push(str[i]);
            }
            else  {
                if (stack.isEmpty() ){
                    System.out.println("false");
                    return;
                }
                char temp=stack.pop();
                if (temp == '(' && str[i]!=')'){
                    System.out.println("false");
                    return;
                }
                if (temp=='{' && str[i]!='}'){
                    System.out.println("false");
                    return;
                }
                if (temp == '[' && str[i]!=']') {
                    System.out.println("false");
                    return;
                }
            }
        }
        System.out.println(stack.isEmpty());
    }
}
