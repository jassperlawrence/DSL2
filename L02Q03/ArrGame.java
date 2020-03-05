/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L02Q03;

import java.util.Random;

/**
 *
 * @author Jassper
 */
public class ArrGame<T> implements UNO {
    
    String []colour={"Blue ","Yellow ","Green ","Red "};
    String []type={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Reverse","Block"};
    String [] special={"Add Two","Add Four"};
    String numDeck[]=new String [54];
    int count=0;
    
    
    
        @Override
    public void draw() {
        
        //Draw from first to last
        System.out.print(numDeck[count]+" :: ");
        count++;
    }
    
    public void createShuffle(){
       int counter=0;
        for (int i = 0; i < 4; i++) {
            
            for (int j = 0; j < 12; j++) {
                
                numDeck[counter]=colour[i]+type[j];
                counter++;
            }
            
        }
        //shuffle
        numDeck[49]=special[0];
        numDeck[50]=special[0];
        numDeck[51]=special[1];
        numDeck[52]=special[1];
        
        Random r= new Random();
    //swap
        int randIndex,randValue;
        
        for (int i = 0; i < numDeck.length; i++) {
            //shuffle
            randIndex=r.nextInt(numDeck.length);
            randValue=r.nextInt(numDeck.length);
            String s="";
            s=numDeck[randIndex];
            numDeck[randIndex]=numDeck[randValue];
            numDeck[randValue]=s;//swap & shuffle
        }
        
    }
    public static void main(String[] args) {
        int times=7;
        ArrGame<String> a = new ArrGame();
        a.createShuffle();
        System.out.println("Array Implmentation\nPlayer 1 draws "+times);
        for (int i = 0; i < times; i++) {
            a.draw();
        }
        
    }
    
   
    
}
