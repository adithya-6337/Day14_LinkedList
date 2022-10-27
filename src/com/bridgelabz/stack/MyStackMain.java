package com.bridgelabz.stack;

import com.bridgelabz.linklist.INode;
import com.bridgelabz.linklist.MyNode;
import org.junit.jupiter.api.Assertions;

public class MyStackMain {

    public static void main(String[] args) {
        MyStackMain myStackMain = new MyStackMain();
         myStackMain.setStackMethod();
         myStackMain.setPeakAndPopMethod();
    }
    public void setStackMethod() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyStack myStack = new MyStack();
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        myStack.printMyStack();
        INode peak = myStack.peak();
        Assertions.assertEquals(myThirdNode,peak);
    }
    public void setPeakAndPopMethod() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyStack myStack = new MyStack();
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        INode pop = myStack.pop();
        myStack.printMyStack();
        Assertions.assertEquals(myThirdNode,pop);
    }
}