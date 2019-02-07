package com.lambdaschool;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public class Stack
{
    private LinkedList<String> storage;

    // Constructor
    public Stack()
    {
        this.storage = new LinkedList<String>();
    }

    // Print in order they were added
    public void printInOrder()
    {
        String toBePrinted = "[";
        if (this.storage.size() == 0)
        {
            System.out.println("[]");
        }
        else
        {
            for (int i = this.storage.size() - 1; i >= 0; i--)
            {
                if (i == this.storage.size() -1)
                {
                    toBePrinted = toBePrinted + "'" + storage.get(i) + "'";
                }
                else
                {
                    toBePrinted = toBePrinted + ", '" + storage.get(i) + "'";
                }
            }
            toBePrinted = toBePrinted + "]";
            System.out.println(toBePrinted);
        }
    }
    // Pop
    public void pop()
    {
        this.storage.pop();
    }
    // Push
    public void push(String str)
    {
        this.storage.push(str);
    }
    // numOfItems
    public void numOfItems()
    {
        if (this.storage.size() == 0)
        {
            System.out.println("There are no items in your Stack");
        }
        else
        {
            System.out.println(this.storage.size());
        }
    }
}
