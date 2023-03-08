/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stacks;



/**
 *
 * @author d00243400
 */
public class StackApp {
    public static void main(String[] args) {
      Stack s = new Stack();
      s.push("hey");
      s.push("hey");
      s.push("hey");
      s.push("please");
        System.out.println(s.peek());
        
        while(s.isEmpty()==false){
            System.out.println(s.peek());  
            s.pop();
        }
    }
    
}
