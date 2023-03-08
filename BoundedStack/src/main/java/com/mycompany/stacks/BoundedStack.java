/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stacks;



/**
 *
 * @author d00243400
 */
public class BoundedStack extends Stack{
     private final int maxCapacity;
     
     public BoundedStack(){
         super();
         maxCapacity=10;
        
     }
     
      public BoundedStack(int capacity){
           super();
          if(capacity<=0){
              throw new IllegalArgumentException();

          }
         maxCapacity=10;
        
     }
      
     @Override
      public void push(String add){
        if(super.size()>maxCapacity){
             throw new IllegalArgumentException();
        }   
        else{
            super.push(add);
        }
       
      }
      
      public boolean isFull(){
          boolean state=false;
           if(super.size()<maxCapacity){
            return state;
        }   
           return true;
      }
    
}
