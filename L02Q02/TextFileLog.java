/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L02Q02;

/**
 *
 * @author Jassper
 */
public class TextFileLog <T extends Comparable<T>>implements SimpleLog<T> {
    
    private T[] log;
    private int index,maxsize;

    public TextFileLog(int a) {
        index=-1;
        maxsize=a;
        log=(T[]) new Comparable[5];
    }
    
    @Override
    public void clear() {
        for (int i = 0; i <= index; i++) 
            log[i]=(T) null;
            
            index=-1;
        
    }


    @Override
    public void insert(T t) {
        if(!isFull()){
            index++;
            log[index]=t;
        }
        else 
            System.out.println("The log is full");
            
    }

    @Override
    public boolean isFull() {
        return maxsize==(index+1);
        
    }

    @Override
    public int size() {
        return index+1;
    }

    @Override
    public boolean search(T t) {
        for (int i = 0; i <index; i++) {
         if(log[i].compareTo(t)==0){
             return true;
             
         }
         }
        return false;
    }
    
    @Override
    public String display() {
        String str="";
        for (T t : log) {
            str+=t+" ";
        }
        return str;
    }
    
}
