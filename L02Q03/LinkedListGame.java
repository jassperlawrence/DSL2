/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L02Q03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;



/**
 *
 * @author Jassper
 */
public class LinkedListGame<T> implements UNO {
    
    
    
    public static void main(String[] args) {
    
        LinkedList<String> type= new LinkedList <String>();
        LinkedList<String> colour= new LinkedList <String>();
        LinkedList<String> special= new LinkedList <String>();
        
        type.add("Zero");
        type.add("One");
        type.add("Two");
        type.add("Three");
        type.add("Four");
        type.add("Five");
        type.add("Six");
        type.add("Seven");
        type.add("Eight");
        type.add("Nine");
        type.add("Reverse");
        type.add("Block");
        
        
        colour.add("Red ");
        colour.add("Yellow ");
        colour.add("Green ");
        colour.add("Blue ");
        
        
        
        
        ArrayList<String> all = new ArrayList<>();
        for (int i = 0; i < colour.size(); i++) {
            String temp = colour.get(i);
            for (int j = 0; j < type.size(); j++) {
                all.add(temp + type.get(j));
            }
        }
        
        Collections.shuffle(all);
        
        System.out.println("Linked List Implementation : \n");
        for (int i = 0; i < all.size(); i++) {
            
            System.out.print(all.get(i)+" :: ");
            if((i+1)%6==0)
                System.out.println("");
        }
        
    }
    
    
    @Override
    public void draw() {
        
    }
    
}
