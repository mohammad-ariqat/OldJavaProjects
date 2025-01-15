

package com.mycompany.help;

import java.util.Scanner;


public class Help {

    public static void main(String[] args) {
        Scanner t =new Scanner (System.in);
        int y=t.nextInt();
        int r [] []=new int[y][5];
        
        for (int i = 0; i < r.length; i++) {
            r[i]=t.nextInt();
        }
        System.out.println("search for what?");
        String o=t.next();
        int x =0;
        for (int i = 0; i < 10; i++) {
            if (o.equals(r[i])) {
                x++;
                
            }else
                System.out.println("not found");
         
        }
          System.out.println(x); 
            
            
        
        
        
    }    
    
}
