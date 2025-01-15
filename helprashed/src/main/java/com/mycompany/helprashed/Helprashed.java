
package com.mycompany.helprashed;

import java.util.ArrayList;
import java.util.Scanner;
public class Helprashed {
    static Scanner  input=new Scanner(System.in);
    public static void main(String[] args) {
        int a = 1;
        Integer a1 = 1;
        String s = "kkkkk";
        Character c = 'l';
        c.toUpperCase(c);
        Developer developers[] = new Developer[5];
        
        ArrayList<Developer> developers2 = new ArrayList<>();
        
        developers2.add( new Developer("moh", 'S', 5));
        
        developers2.add(new Developer("rashed", 'j', 7));
        
        developers2.get(1).getName();
        
        developers2.remove(1);
        
        setdev(developers);
        
        getdev(developers);
      
        printall(developers);
      
    }
    
    public  static  void setdev(Developer[] developers){
        
        for (int i = 0; i < developers.length; i++) {
            System.out.println("enter data in this order name , degree(j or s) , eYears");
            
            developers[i] = new Developer(input.next(), input.next().charAt(0), input.nextInt());
        }
    
    }
    
    public  static  void getdev(Developer[] developers){
        
        for (int i = 0; i < developers.length; i++) {
            if (developers[i].getDegree() =='j' && developers[i].geteYears() >10) {
                System.out.println(developers[i].toString());
            }
            
        }
    
    }
    public  static  void printall(Developer[] developers){
        
        for (int i = 0; i < developers.length; i++) {
            System.out.println(developers[i].toString());
            
        }
    }
    
}
