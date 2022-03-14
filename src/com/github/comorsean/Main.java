package com.github.comorsean;

import com.github.comorsean.lists.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.pushBack(10);
        System.out.println(linkedList.getSize());

        linkedList.pushBack(11);
        System.out.println(linkedList.getSize());

        linkedList.pushBack(12);
        System.out.println(linkedList.getSize());

        System.out.println(linkedList.get(0));
        System.out.println(linkedList.get(1));
        System.out.println(linkedList.get(2));

    }
}
