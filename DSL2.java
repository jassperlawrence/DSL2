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
        //check and replace
       
        Arrays.sort(num);
            
        
    }
    
    //method to generate non-duplicate
    public void gen(){
        //array to store N random integers (0 - N-1)
        int[] nums = new int[total];

        // initialize each value at index i to the value i 
        for (int i = 0; i < nums.length; ++i)
        {
            nums[i] = i;
        }

        Random randomGenerator = new Random();
        int randomIndex; // the randomly selected index each time through the loop
        int randomValue; // the value at nums[randomIndex] each time through the loop

        // randomize order of values
        for(int i = 0; i < nums.length; ++i)
        {
             // select a random index
             randomIndex = randomGenerator.nextInt(nums.length);

             // swap values
             randomValue = nums[randomIndex];
             nums[randomIndex] = nums[i];
             num[i] = randomValue;
        }
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
    //I got the implementation right just the non-duplicate integers
    //shuffle and swap
    //store and shuffle
}
