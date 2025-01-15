
package com.mycompany.revised7m2;
import java.util.Scanner;
public class ReviseD7M2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter how many rows");
        int num =input.nextInt();
        int count = 0;
        if (count <num) {
         for (int i = 0; i <num ; i++) {
            System.out.println("");
            count++;
            
            for (int j = 0; j < count; j++) {
                System.out.print("*");
            }
        }   
        }if (count >= num) {
            for (int i = 0; i <num ; i++) {
                System.out.println("");
                count--;
            
                for (int j = 0; j < count; j++) {
                    System.out.print("*");
                }
        }
        }

            
        
        
        
    }
}
