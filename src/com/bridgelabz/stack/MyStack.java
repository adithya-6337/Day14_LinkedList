package com.bridgelabz.stack;

import com.bridgelabz.linklist.INode;
import com.bridgelabz.linklist.MyLinkedList;
import com.bridgelabz.linklist.MyNode;

public class MyStack {
    private MyLinkedList myLinkedList;

    public MyStack() {
        this.myLinkedList = new MyLinkedList();
    }

    public void push(MyNode myNode) {
        myLinkedList.add(myNode);
    }

    public void printMyStack() {
        myLinkedList.printMyNodes();
    }

    public INode peak() {
        return myLinkedList.head;
    }
    public INode pop(){
        return myLinkedList.pop();
    }
}