package com.lambdaschool;

public class Main
{

    public static void main(String[] args)
    {
        // Make new stack
        Stack myStack = new Stack();
        // Report number of items on the stack
        myStack.numOfItems();
        // Push first
        myStack.push("first");
        // Push second
        myStack.push("second");
        // Push third
        myStack.push("third");
        // Report number of items on the stack
        myStack.numOfItems();
        // Print the stack
        myStack.printInOrder();
        // Pop the stack
        myStack.pop();
        // Print the stack
        myStack.printInOrder();
        // Pop the stack
        myStack.pop();
        // Print the stack
        myStack.printInOrder();
        // Pop the stack
        myStack.pop();
        // Print the stack
        myStack.printInOrder();
        // Report number of items on the stack
        myStack.numOfItems();
    }
}
