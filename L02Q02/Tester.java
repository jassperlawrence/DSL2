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
public class Tester {
    
    public static void main(String[] args) {
          TextFileLog<String> a = new TextFileLog(5);
          a.insert("One");
          a.insert("Two");
          a.insert("Three");
          a.insert("Four");
          a.insert("Five");
          
          String name="One";
          
          System.out.println(a.display()+"\nThe log is full? "+a.isFull());
          if(a.search(name))
              System.out.println("Log contains "+name);
          else 
              System.out.println("Log does not contain "+name);
          a.clear();
          System.out.println(a.display()+"\nThe log is full? "+a.isFull());
          
          
          if(a.search(name))
              System.out.println("Log contains "+name);
          else 
              System.out.println("Log does not contain "+name);
    }
    
    
}
