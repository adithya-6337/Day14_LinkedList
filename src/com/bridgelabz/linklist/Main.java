package com.bridgelabz.linklist;

import com.bridgelabz.test.MyLinkedListTest;

public class Main {
    public static void main(String[] args) {

        MyLinkedListTest myLinkedList = new MyLinkedListTest();

        System.out.print("Added method => ");
        myLinkedList.givenThreeNoWhenAddedToLinkedListShouldBeAddedToTop();

        System.out.print("Appended method => ");
        myLinkedList.givenThreeNoWhenAppendedShouldBeAddedToLast();

        System.out.print("Inserting method => ");
        myLinkedList.givenThreeNoWhenInsertingSecondInBetweenShouldPassLinkedList();
    }
}
