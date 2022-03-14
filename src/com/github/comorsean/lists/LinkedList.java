package com.github.comorsean.lists;

public class LinkedList {
    static class Node {
        int value;
        Node next, previous;
    }

    private int size;
    private Node startNode;

    public LinkedList() {
        startNode = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public void pushBack(int value) {
        Node node = new Node();
        node.value = value;
        if (startNode == null) {
            startNode = node;
        } else {
            Node temp = startNode;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
            node.previous = temp;
        }
        size++;
    }

    public int get(int index) {
        if (index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        Node node = startNode;
        for (int i = 0; i < size; i++) {
            if (i == index) {
                return node.value;
            }
            node = node.next;
        }
        return 0;
    }

}
