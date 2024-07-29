package org.example;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1);
        System.out.println(myQueue.empty());
        myQueue.push(2);
        myQueue.push(3);
        myQueue.display();
        System.out.println(myQueue.peek());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.peek());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.peek());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.empty());
    }
}

class MyQueue {
    Stack<Integer> stk1;
    Stack<Integer> stk2;
    public MyQueue() {
        stk1 = new Stack<>();
        stk2 = new Stack<>();
    }

    public void push(int x) {
        stk1.push(x);
    }
    public int pop() {
        if(stk2.empty()) {
            while(!stk1.empty()) {
                stk2.push(stk1.pop());
            }
        }
        return stk2.pop();
    }

    public int peek() {
        if(stk2.empty()) {
            while(!stk1.empty()) {
                stk2.push(stk1.pop());
            }
        }
        return stk2.peek();
    }

    public boolean empty() {
        return stk1.empty() && stk2.empty();
    }

    public void display() {
        if(stk2.empty()) {
            while(!stk1.empty()) {
                stk2.push(stk1.pop());
            }
        }
        int x = stk2.size() - 1;
        while (x >= 0) {
            System.out.println(stk2.elementAt(x));
            x--;
        }
    }
}