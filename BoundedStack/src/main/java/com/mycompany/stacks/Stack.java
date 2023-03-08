/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.stacks;

import java.util.EmptyStackException;

/**
 *
 * @author d00243400
 */
public class Stack {
    private static final int INITIAL_CAPACITY=10;
    protected Node first;
    protected int count;
    private int capacity;

    public Stack() {
        this.first = null;
        count = 0;
        capacity=INITIAL_CAPACITY;
    }
    
     public Stack(int capacity) {
        this.first = null;
        count = 0;
        this.capacity=capacity;
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

    public void push(String add) {
        Node newNode = new Node(add);
          if(this.isFull()==true){
             throw new StackFullException("stack is full");
        }   else{
        if (first == null) {
            first = newNode;
        } else {
            newNode.next = first;
            first = newNode;
        }
        count++;
          }

    }

    public String pop() {
        String remove = null;
        if (isEmpty() == true) {
            throw new EmptyStackException();
        } else {
            remove = first.data;
            first = first.next;
            count--;
        }
        return remove;
    }
    
    public int count() {
        return count;
    }
    
     public boolean isFull(){
          boolean state=false;
           if(this.size()<capacity){
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
