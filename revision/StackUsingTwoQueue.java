package com.example.revision;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingTwoQueue {
    static Queue<Integer> queue1 = new LinkedList<>();
    static Queue<Integer> queue2 = new LinkedList<>();
    public static void insert(int a) {
        while (!queue1.isEmpty()){
            queue2.add(queue1.poll());
        }
        queue1.add(a);
        while (!queue2.isEmpty()){
            queue1.add(queue2.poll());
        }

    }
    public static void main(String[] args) {
        insert(1);
        insert(2);
        insert(3);
        while (!queue1.isEmpty()) {
            System.out.println(queue1.poll() + " ");

        }
    }
}
