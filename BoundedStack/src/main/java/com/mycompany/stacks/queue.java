/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stacks;

import java.util.EmptyStackException;

/**
 *
 * @author d00243400
 */
public class queue {

    private static final int INITIAL_CAPACITY = 10;
    protected Node first;
    protected Node tail;
    protected int count;
    private int capacity;

    public queue() {
        this.first = null;
        count = 0;
        capacity = INITIAL_CAPACITY;
    }

    public queue(int capacity) {
        this.first = null;
        count = 0;
        this.capacity = capacity;
    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public String peek() {
        if (isEmpty() == true) {
            throw new EmptyStackException();
        }
        return first.data;
    }
//to add

    public void enque(String add) {
        Node newNode = new Node(add);
        if (this.isFull() == true) {
            throw new StackFullException("stack is full");
        } else {
            if (first == null) {
                first = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;

            }
            count++;
        }

    }
//remove

    public String deque() {
        String remove = null;
        if (isEmpty() == true) {
            throw new EmptyStackException();
        } else {
            if (count == 1) {
                remove = first.data;
                first = first.next;
                tail = null;
            } else {
                remove = first.data;
                first = first.next;
            }
            count--;
        }
        return remove;
    }

    public String element() {
        if (isEmpty() == false) {
            return first.data;
        } else {
            throw new noSuchElementException();
        }
    }

    public String poll() {
        String data = null;
        if (isEmpty() == false) {
            data = first.data;
            first = first.next;
            return data;
        }
        return data;
    }

    public int count() {
        return count;
    }

    public boolean isFull() {
        boolean state = false;
        if (this.size() < capacity) {
            return state;
        }
        return true;
    }

    private static class Node {

        protected String data;
        protected Node next;

        public Node(String data) {
            this.data = data;
            this.next = null;
        }

        private boolean hasNext() {
            return next == null;
        }
    }

}
