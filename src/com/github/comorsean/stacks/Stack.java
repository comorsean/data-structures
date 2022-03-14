package com.github.comorsean.stacks;

public class Stack {
    static class Node {
        int value;
        Node next;
    }

    private int size;
    private Node startNode;

    public Stack() {
        startNode = null;
        size = 0;
    }

    public void push(int value) {
        Node node = new Node();
        node.value = value;
        node.next = startNode;
        startNode = node;
        size++;
    }

    public void pop() {
        if(startNode == null) {
            throw new ArrayIndexOutOfBoundsException();
        }
        startNode = startNode.next;
        size--;
    }

    public int top() {
        if(startNode == null) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return startNode.value;
    }

    public int getSize() {
        return size;
    }
}
