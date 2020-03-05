/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L02Q01;

import java.util.Collections;
import java.util.List;
import java.util.Random;

// ONLY DOES THE LINKED LIST BUT NOT SORTING 

// FIND OUT HOW TO SORT IN THIS GENERIC LINKED LIST IMPLEMENTATION
public class LinkedList<T> {
        
    private int size;
    public LinkedList(int n) {
        this.size=n;
    }
    
    
    int total=101;
    int []arr= new int[total];
    private Node head;//heaad is the first node in linked list
    
    public boolean isEmpty(){
        return length()==0;
    }
    
    public void append(T data){
        if(head==null){
            head=new Node(data);
            return;
        }
        tail().next=new Node(data);
    }
    
    private Node tail(){
        Node tail=head;
        //Find the last element of the linked list
        while(tail.next!=null){
            tail=tail.next;
            
        }
        return tail;
    }

    @Override
    public String toString() {
        String line="";
        Node current =head;
        while(current !=null){
            line+=current+" ";
            current=current.next;
        }
        return line;
    }
    public int length(){
        int length=0;
        Node current =head;//Starts count from head
        while(current!=null){
            length++;
            current=current.next;
            
        }
        return length;
    }
    
    private  class Node{
        private Node next;
        private T data;
        
        public Node(T data){
            this.data=data;
        }
        public String toString(){
            return data.toString();
        }
    }
   
    
    public void gen(){
        
        Random r= new Random();
        //initialize 
        int total=101;
        
        //for loop 
        for (int i = 0; i < arr.length; i++) {
            arr[i]=i;
        }
        int ind1,ind2;//ind1 is random index ind2 is random value
        
        for (int i = 0; i < arr.length; i++) {
            //select a random index
            ind1=r.nextInt(total);
            //swap values
            ind2=arr[ind1];//ind1 : random index
            arr[ind1]=arr[i];
            arr[i]=ind2;
        }
        //shuffle and return each index subsequently
        
        
    }
    public void add(LinkedList list){
        for (int i = 0; i < size; i++) {
            list.append(arr[i]);
            }
        
     }
    public static void main(String[] args) {
        LinkedList<Integer> a = new LinkedList(100);
        a.gen();
        a.add(a);
        System.out.println("Linked List Implementation :\n"+a.toString());
    }
    
}
