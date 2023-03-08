/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stacks;

/**
 *
 * @author d00243400
 */
public class StackFullException extends RuntimeException{
    
     public StackFullException(){
        super();
    }
    
    public StackFullException(String message){
        super(message);
    }
    
}
