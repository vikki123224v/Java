package com.example.revision;

import java.util.Stack;

public class QueueUsingTwoStack {
    static Stack<Integer> stack1 = new Stack<>();
    static Stack<Integer> stack2 = new Stack<>();
    public static void insert(int a) {
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());

        }
        stack1.push(a);
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
    }
    public static void main(String[] args) {
        insert(1);
        insert(2);
        insert(3);
        insert(4);
        while (!stack1.isEmpty()){
            System.out.println(stack1.pop()+" ");

        }

    }
}
