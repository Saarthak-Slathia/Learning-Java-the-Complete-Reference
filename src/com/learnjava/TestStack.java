package com.learnjava;

class Stack {
    int[] stack = new int[10];
    int tos;

    Stack() {
        tos = -1;
    }

    // Push an item onto the stack
    void push(int item) {
        if (tos == 9) {
            System.out.println("Stack is full");
        } else
            stack[++tos] = item;
    }

    // Pop an item from the stack
    int pop() {
        if (tos == 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else
            return stack[tos--];
    }
}

public class TestStack {
    public static void main(String[] args) {
        Stack myStack1 = new Stack();
        Stack myStack2 = new Stack();

        // Push some numbers into the stack
        for (int i = 0; i<10; i++) myStack1.push(i);
        for (int i = 10; i<20; i++) myStack2.push(i);

        // Pop items from the stack
        System.out.println("Stack in myStack1:-");
        for (int i = 0; i<10; i++)
            System.out.println(myStack1.pop());

        System.out.println("Stack in myStack2:-");
        for (int i = 0; i<10; i++)
            System.out.println(myStack2.pop());
    }
}
