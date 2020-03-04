/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsl2;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Jassper
 */
public class DSL2 <E>{//must be generic
    
    Random r= new Random();
    protected int total;
    protected Object num[];
    
    public DSL2(int total) {
        this.total = total;//size of array
        num= new Object [total];
    }
    //to get index i
    E get(int i){
        @SuppressWarnings("unchecked")
        final E e = (E)num[i];
        return e;
    }
    void set(int j){
        num[j]=r.nextInt(101);//create first then replace
       
    }
    
    public void nonDuplicate( ){//generate non duplicate
                
        //create
        for (int i = 0; i < total; i++) {
            for (int j = 0; j < total; j++) {
              if(num[i]==num[j]){
                  num[j]=gen(num[i]);
              }
                
                
            }
            
        }//check and replace
       
        Arrays.sort(num);
            
        
    }
    
    //recursive method to generate non-duplicate
    public Object gen(Object var1){
        Object temp=r.nextInt(101);
        if(var1!=temp){
            return temp;
        }
        else
           return gen(var1);
    }
    

    @Override
    public String toString() {
        String a="";
        System.out.println("Generate "+total+" non-duplicate integer within 0-100\nArray Implementation");
        for (Object object : num) {
            a+=object+" ";
        }
        return a;
    }
    
    public static void main(String[] args) {
        DSL2<Integer> a = new DSL2(20);
        for (int i = 0; i < 20; i++) {
            a.set(i);
        }
        a.nonDuplicate();
        System.out.println(a.toString());
    }
    //creates duplicates 
    
    
}
