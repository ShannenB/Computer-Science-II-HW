/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework5;

import java.util.LinkedList;

/**
 *
 * @author Shannen Barrameda
 */
public class SimpleQueue {
     LinkedList<Character> charListQueue = new LinkedList<Character>();
     
     
     public SimpleQueue(){
         
     }
     public void enqueue(char c){
         charListQueue.addLast(c);
     }
     
     public Character dequeue(){
         return charListQueue.removeFirst();
     }
     
     public int getSize(){
         return charListQueue.size();
     }
     
     @Override
     public String toString(){
         return "Queue: " + charListQueue.toString();
     }
}
