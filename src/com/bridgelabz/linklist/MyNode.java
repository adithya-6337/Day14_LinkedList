package com.bridgelabz.linklist;

public class MyNode<T> implements INode<T> {
    public T key;
    public MyNode next;

    public MyNode(T key) {
        this.key = key;
        this.next = null;
    }

    @Override
    public T getKey() {
        return key;
    }

    @Override
    public void setKey(T key) {
        this.key = key;
    }

    public MyNode getNext() {
        return next;
    }
    public void setNext(INode next) {
        this.next = (MyNode<T>)next;
    }
}
