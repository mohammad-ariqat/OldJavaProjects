
package com.mycompany.rrrr;

import java.util.Scanner;

public class Rrrr {
static Scanner  input=new Scanner(System.in);
    public static void main(String[] args) {
        appartment[] app = new appartment[3];
        
        fillarr(app);
        printarr(app);
    }
    public static void fillarr(appartment[] app){
        for (int i = 0; i < app.length; i++) {
            System.out.println("enter the size then the number of rooms");
            app[i] = new appartment(input.next().charAt(0), input.nextInt());
        }
    
    }
    public static void printarr(appartment[] app){
        for (int i = 0; i < app.length; i++) {
            if (app[i].getSize() == 'L') {
                System.out.println(app[i].toString()); 
            }
        }
    
    }
}
